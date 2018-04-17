import java.util.Scanner;
public class CompareAdjacent {

	public static void main(String[] args) {
		//when comparing adjacent values, store the previous value in a variable
		
		Scanner in = new Scanner(System.in);
		
		double input = in.nextDouble();
		while (in.hasNextDouble())
		{
			double previous = input;
			input = in.nextDouble();
			if (input == previous)
			{
				System.out.println("Duplicate input");
			}
		}

	}

}
