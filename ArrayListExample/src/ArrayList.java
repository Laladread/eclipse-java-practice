import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> myInts = new ArrayList<Integer>(25);
		System.out.println( "Size of myInts = " + myInts.size());
		
		for(int k = 0; k < 10; k++)
			myInts.add(3 * k);
		myInts.set(6,44);
		System.out.println( "Size of myInts = " + myInts.size());
		
		for(int k = 0; k < myInts.size(); k++)
			System.out.println( myInts.get(k) + " , ");

	}

}
