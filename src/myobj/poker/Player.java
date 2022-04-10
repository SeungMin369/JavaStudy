package myobj.poker;

import java.util.TreeSet;
public class Player {
	private static final int MAX_TABLE = 7;
	
	public static TreeSet<Card> cards = new TreeSet<>();
	public Player() {
		for (int i = 0; i < 4; ++i) {
			cards.add(new Card());
		}
	}
}
