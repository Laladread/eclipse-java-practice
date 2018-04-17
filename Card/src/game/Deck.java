package game;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	public ArrayList<Card>variablwe;
	Deck()
	{

	variablwe = new ArrayList<Card>();
	for(int i=0; i<Card.suits.length;i++) 
	{
		String s = Card.suits[i];
		for(int j=0;j<Card.ranks.length;j++)
		{
			int r = Integer.parseInt(Card.ranks[j]);
			variablwe.addAll(r,s);
		}
	}
}

	public void shuffle(ArrayList<Card> c)
	{
		if(c==null)
		{Collections.shuffle(variablwe);
		}else{
			Collections.shuffle(c);
		}
		}
	
	public void print() 
	{
		for(Card card: variablwe)
		{
			System.out.println("Card: "+card.getRank()+" Suit: "+card.getSuit());
		}
	}


		
	}
	
