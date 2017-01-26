package proba;

import java.util.Arrays;

public class Test {
	int nb_player = init.Param.getPlayers_nb();
	int nb_cards = init.Param.getCards_nb();
	
	public boolean[][] findParams(){
		boolean[][] obvious = new boolean[nb_player][nb_cards];
		for(boolean[] player : obvious){
			Arrays.fill(player, false);
		}
		if (init.Param.isFirst_player_rotate()){
			System.out.println("Warning : this functionnality hasn't been done yet, come back later"); 
			//@TODO s'occuper du cas ou le premier joueur rotate
			System.exit(404);
		}
		
		// Pour le moment, on ne se pose pas cette question.		
		
		
		return obvious;
		
	}
	
	public void bruteForce(boolean[][] obvious){
		
	}
}
