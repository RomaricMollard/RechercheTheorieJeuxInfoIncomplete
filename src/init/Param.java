package init;

public final class Param {
	public static int cards_nb = 3; // nombre de cartes dans le jeu (par couleur)
	public static int players_nb = 2; //nombre de joueurs
	public static int hand_nbcards = 1; //nombre de cartes en main
	public static boolean first_player_rotate = false; //Rotation ou non du first player
	public static boolean pot = false;  //Présence ou non d'une cagnotte
	public static int points_lost_sleep = 1; //Perte si on se couche
	public static int points_lost_end = 2; //Perte si on suit jusqu'au bout
	public static int point_won_nopot = 2; //Gain s'il n'y a pas de cagnotte
	
	
	public static int getCards_nb() {
		return cards_nb;
	}
	public static void setCards_nb(int cards_nb) {
		Param.cards_nb = cards_nb;
	}
	public static int getPlayers_nb() {
		return players_nb;
	}
	public static void setPlayers_nb(int players_nb) {
		Param.players_nb = players_nb;
	}
	public static int getHand_nbcards() {
		return hand_nbcards;
	}
	public static void setHand_nbcards(int hand_nbcards) {
		Param.hand_nbcards = hand_nbcards;
	}
	public static boolean isFirst_player_rotate() {
		return first_player_rotate;
	}
	public static void setFirst_player_rotate(boolean first_player_rotate) {
		Param.first_player_rotate = first_player_rotate;
	}
	public static boolean isPot() {
		return pot;
	}
	public static void setPot(boolean pot) {
		Param.pot = pot;
	}
	public static int getPoints_lost_sleep() {
		return points_lost_sleep;
	}
	public static void setPoints_lost_sleep(int points_lost_sleep) {
		Param.points_lost_sleep = points_lost_sleep;
	}
	public static int getPoints_lost_end() {
		return points_lost_end;
	}
	public static void setPoints_lost_end(int points_lost_end) {
		Param.points_lost_end = points_lost_end;
	}
	public static int getPoint_won_nopot() {
		return point_won_nopot;
	}
	public static void setPoint_won_nopot(int point_won_nopot) {
		Param.point_won_nopot = point_won_nopot;
	}
	
	
}
