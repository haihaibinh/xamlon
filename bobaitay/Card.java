package bobaitay;

public class Card {
	private int rank;  // gia tri cua la bai
	private int suit;  // chat cua la bai
	
	public Card( int rank, int suit) {
		this.rank = rank;
		this.suit = suit;	
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		return rank + "-" + suit;
	}
}
