package game;

import java.util.ArrayList;

/**
 * Représente un jeu
 */
public class Game {
	
	private Param params;
	
	private ArrayList<Player> players;
	
	public Game(){
		this.params = new Param(); //Default parameters
	}
	public Game(Param params){
		this.params = params; //Give parameters on the creation
	}
	
	/* Générer les objets du jeu pour les simulations */
	public void generateGame(){
		
		this.players = new ArrayList<Player>();
		
		for(int i=0; i<this.params.getPlayers_nb();i++){
			
			Player player = new Player(
					new ProbaSet(
						this.params.getCards_nb(),
						this.params.getPlayers_nb()
					),
					this
				);
			
			players.add(player);
			
		}
		
	}
	
	/* Données calculables */
	
	/*
	 * Calcule le nombres total de probabilités actuellement présentes
	 */
	public int countProbas(){

		int pnb = params.getPlayers_nb();
		int cnb = params.getCards_nb();
		
		int formula = cnb * ( (int) Math.pow(2, pnb) - 1 );
		
		if(this.params.isFirst_player_rotate()){
			formula *= pnb;
		}
		
		return formula;
		
	}
	
	/*
	 * Calcule le nombre total de jeux possibles
	 */
	public int countGames(){
		
		int pnb = params.getPlayers_nb();
		int cnb = params.getCards_nb();
		
		int factorial_div = 1;
		for(int i=0; i<pnb; i++){
			factorial_div *= cnb-i;
		}
		
		return (int) Math.pow(2, pnb) * factorial_div;
		
	}
	

	/* getters setters */
	
	public ArrayList<Player> getPlayers(){
		return this.players;
	}
	
	public Param getParams(){
		return this.params;
	}
}
