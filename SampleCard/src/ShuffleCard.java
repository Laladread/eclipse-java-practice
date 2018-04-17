import java.util.ArrayList;
import java.util.Random;

public class ShuffleCard {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList <Integer>();

			for (int i = 0; i<52; i++) {
				list.add(new Integer(i));
			}
			for (int i = 0; i<52; i++) {
				System.out.println(list.get(i));
			}
			Random rand = new Random();
			int shuffleCard = rand.nextInt(52);
			int anotherCard = rand.nextInt(52);
			
			Integer tmp = list.get(shuffleCard);
			list.remove(shuffleCard);
			list.add(shuffleCard,list.get(anotherCard));
			list.remove(anotherCard);
			list.add(anotherCard,tmp); 
	}

}
