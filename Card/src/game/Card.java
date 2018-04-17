package game;

public class Card {
	
	int rank;
	String suit;
	public static String[] suits = {"hearts", "spades", "diamonds", "clubs"};
	public static String[] ranks = {"ACE(1)", "TWO(2)","THREE(3)","FOUR(4)","FIVE(5)","SIX(6)","SEVEN(7)","EIGHT(8)","NINE(9)","TEN(10","JACK"
			,"JACK(11)","QUEEN(12)","KING(13)"};
	
	public Card() { //setting card to ACE 
		rank = Integer.parseInt(ranks[0]);
		suit = suits[1];
	}
	
	
	Card(int r, String s)
	{
		rank = r;
		suit = s;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	

}
