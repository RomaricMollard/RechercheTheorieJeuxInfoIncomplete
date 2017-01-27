package tests;

import java.util.ArrayList;

import game.*;
import stats.Stats;

public class testGame {

	public static void main(String[] args) {
		
		Param param = new Param();
		param.setPlayers_nb(4);
		param.setCards_nb(10);
		
		param.setPoints_lost_end(2);
		param.setPoints_lost_sleep(1);
		param.setPoint_won_nopot(2);
		
		param.setFirst_player_rotate(true);
		
		Game game = new Game(param);
		
		System.out.println(game.countProbas());
		System.out.println(game.countGames());
		
		int player_viewed = 3;
		game.generateGame();
		double res = game.getPlayers().get(player_viewed).getEsperance(player_viewed);
		

		System.out.println(Stats.nb_appel + " " + res);
	}

}
