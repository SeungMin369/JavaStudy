package myobj.poker;

public class Card {
	
	final public static int NUM_OF_SUITS = 4;
	final public static int NUM_OF_RANKS = 13;
	final public static int CARD_SIZE = NUM_OF_SUITS * NUM_OF_RANKS;
	
	final private static char[] SUITS = {'¢¼', '¢À', '¡Þ', '¢½'};
	final private static String[] RANKS = 
		{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
	final private static int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	
	int suit;
	int rank;
	boolean hidden;
	
	

	public Card() {
		this.suit = suit;
		this.rank = rank;
	}
	
		
	int getValue() {
		return VALUES[rank];
	}
	
	@Override
	public String toString() {
		if (hidden) {
			return "H";
		} else {
			return SUITS[suit] + RANKS[rank];
		}
	}
	
	
}



