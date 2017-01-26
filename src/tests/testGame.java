package tests;

import game.*;

public class testGame {

	public static void main(String[] args) {
		
		Param param = new Param();
		param.setPlayers_nb(4);
		param.setCards_nb(10);
		param.setFirst_player_rotate(true);
		
		Game game = new Game(param);
		
		System.out.println(game.countProbas());

	}

}
