package game;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Permet de stoquer un set de probas pour un joueur (dépend du nombre d'état de jeu et du nombre de carte)
 */
public class ProbaSet {
	
	private ArrayList<ArrayList<ArrayList<Proba>>> probaSet;

	public ProbaSet(int nb_cards, int nb_players){
		this.probaSet = new ArrayList<ArrayList<ArrayList<Proba>>>();
		
		for(int i=0; i<nb_cards; i++){
			
			ArrayList<ArrayList<Proba>> proba_for_card = new ArrayList<ArrayList<Proba>>();
			
			for(int j=0; j<nb_players; j++){
				//Pour chaque position dans le jeu (premier, second...)
				ArrayList<Proba> proba_for_card_and_position = new ArrayList<Proba>();
				
				//Pour chaque configuration en étant à cette position
				for(int k=0; k<Math.pow(2, j); k++){
					proba_for_card_and_position.add(new Proba());
				}
				
				proba_for_card.add(proba_for_card_and_position);
				
			}
			
			this.probaSet.add(proba_for_card);

		}
		
	}
	
	/**
	 * Retourne la probabilité correspondante pour un cas
	 * @param conf configuration de jeu et du tour 
	 * @param card numero de carte
	 * @return
	 */
	public Proba getProba(int position, int state, int card){
		return this.probaSet.get(card-1).get(position).get(state);
	}
	
}
