package game;

public final class Param {
	
	/*
	 * Définit les paramètres d'une partie
	 */
	
	public  int cards_nb = 3; // nombre de cartes dans le jeu (par couleur)
	public  int players_nb = 2; //nombre de joueurs
	public  int hand_nbcards = 1; //nombre de cartes en main
	public  boolean first_player_rotate = false; //Rotation ou non du first player
	public  boolean pot = false;  //Pr�sence ou non d'une cagnotte
	public  int points_lost_sleep = 1; //Perte si on se couche
	public  int points_lost_end = 2; //Perte si on suit jusqu'au bout
	public  int point_won_nopot = 2; //Gain s'il n'y a pas de cagnotte
	
	
	public  int getCards_nb() {
		return cards_nb;
	}
	public  void setCards_nb(int cards_nb) {
		this.cards_nb = cards_nb;
	}
	public  int getPlayers_nb() {
		return players_nb;
	}
	public  void setPlayers_nb(int players_nb) {
		this.players_nb = players_nb;
	}
	public  int getHand_nbcards() {
		return hand_nbcards;
	}
	public  void setHand_nbcards(int hand_nbcards) {
		this.hand_nbcards = hand_nbcards;
	}
	public  boolean isFirst_player_rotate() {
		return first_player_rotate;
	}
	public  void setFirst_player_rotate(boolean first_player_rotate) {
		this.first_player_rotate = first_player_rotate;
	}
	public  boolean isPot() {
		return pot;
	}
	public  void setPot(boolean pot) {
		this.pot = pot;
	}
	public  int getPoints_lost_sleep() {
		return points_lost_sleep;
	}
	public  void setPoints_lost_sleep(int points_lost_sleep) {
		this.points_lost_sleep = points_lost_sleep;
	}
	public  int getPoints_lost_end() {
		return points_lost_end;
	}
	public  void setPoints_lost_end(int points_lost_end) {
		this.points_lost_end = points_lost_end;
	}
	public  int getPoint_won_nopot() {
		return point_won_nopot;
	}
	public  void setPoint_won_nopot(int point_won_nopot) {
		this.point_won_nopot = point_won_nopot;
	}
	
	
}
