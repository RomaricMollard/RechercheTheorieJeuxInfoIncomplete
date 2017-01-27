package game;

import java.util.ArrayList;

import stats.Stats;

public class Player {

	
	private ProbaSet probaset;
	private Game game;
	private boolean currently_calculated = false;
	
	public Player(ProbaSet probaset, Game game){
		this.game = game;
		this.probaset = probaset;
	}
	
	public double getEsperance(int position){
		
		ArrayList<Integer> conf = new ArrayList<Integer>();
		
		currently_calculated = true;
		double E = 0;
		for(int i = 0; i<Math.pow(2, position); i++){
			E += this.EJoueur(new ArrayList<Integer>(), 0, Utils.compilConf(i, position), position);
		}
		//TODO la probabilité des conf n'est pas equiprobable
		// Il faudrait calculer la proba d'apparition de chaque conf
		E = E/Math.pow(2, position);
		currently_calculated = false;
		
		return E;
		
	}
	
	public double EJoueur(ArrayList<Integer> cardList, int bestCard, ArrayList<Integer> conf, int position){
		
		Stats.nb_appel++;
		
		int pnb = this.game.getPlayers().size();
		Param params = this.game.getParams();
		
		Player nextPlayer = this.game.getPlayers().get((position+1)%pnb);
		position = position % pnb;
		
		double E = 0.0;
						
		//Pour chaque cartes
		for(int c=1; c<=params.getCards_nb(); c++){
			
			if(!cardList.contains(c)){
			
				//Dans tous les cas la cartes courante n'est plus présente dans la suite du jeu
				ArrayList<Integer> next_cardList = (ArrayList<Integer>) cardList.clone();
				next_cardList.add(c);
				
				double current_proba = 0;
				if(position==conf.size()){
					current_proba = this.probaset.getProba(position, Utils.getState(conf), c).getProba();
				}
								
				//Player studied
				if(currently_calculated==true){
					
					//Se coucher
					E += current_proba * (0-params.points_lost_sleep);
					
					//Suivre
					ArrayList<Integer> new_conf = (ArrayList<Integer>) conf.clone();
					new_conf.add(1);
										
					E += (1-current_proba) * nextPlayer.EJoueur(next_cardList, Math.max(bestCard, c), new_conf, position+1);
					
				}else 
					//Last player studied and not after sudied one
					if(nextPlayer.currently_calculated==true && position<conf.size()){
						
						if(c < bestCard || conf.get(position)==0){
							E += params.point_won_nopot;
						}else{
							E += (0-params.points_lost_end);
						}
						
				}else 
				//Last player studied and not after sudied one
				if(nextPlayer.currently_calculated==true && position==conf.size()){
					
					E += current_proba * params.point_won_nopot;
					
					if(c < bestCard){
						E += (1-current_proba) * params.point_won_nopot;
					}else{
						E += (1-current_proba) * (0-params.points_lost_end);
					}
					
				}else
				//Players qui ont joué avant le joueur étudié
				if(position<conf.size()){
					
					if(c < bestCard || conf.get(position)==0){
						E += nextPlayer.EJoueur(next_cardList, Math.max(bestCard, c), conf, position+1);
					}else{
						E += (0-params.points_lost_sleep);
					}
										
				}else
				//Joueurs qui jouent après moi
				if(position==conf.size()){
					
					//Se coucher
					ArrayList<Integer> new_conf = (ArrayList<Integer>) conf.clone();
					new_conf.add(0);
					E += current_proba * nextPlayer.EJoueur(next_cardList, Math.max(bestCard, c), new_conf, position+1);
					
					new_conf = (ArrayList<Integer>) conf.clone();
					new_conf.add(1);
					if(c < bestCard){
						E += (1-current_proba) * nextPlayer.EJoueur(next_cardList, Math.max(bestCard, c), new_conf, position+1);
					}else{
						E += (1-current_proba) * (0-params.points_lost_end);
					}
				}
			
			}
					
		}
		
		E = E / ( params.getCards_nb() - cardList.size() );
				
		return E;
		
	}
	
	
}
