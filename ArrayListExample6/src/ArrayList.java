import java.util.ArrayList;
import java.util.Collections;

public class ArrayList {
	
	public static void main(String[] args) {
		
		//Create ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(100);
		list.add(5);
		
		//Min and max
		int minimum = Collections.min(list);
		int maximum = Collections.max(list);
		
		System.out.println(minimum);
		System.out.println(maximum);
	}
	
}

	


