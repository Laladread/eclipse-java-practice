import java.util.ArrayList;

public class Book {

	public static void main(String[] args) {
		
	int n = 42;

	ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(n);
		list.add(n);

			if (list.get(0) == list.get(1)) 
			{
				System.out.println("equal");
	
			} else {
				System.out.println("Unequal");
			}

	}

}
