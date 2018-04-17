import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		//loop that computes the largest value in a sequence
		//keeping a variable that stores the largest element
		//and updating with larger one
		
		Scanner in = new Scanner(System.in);
		
		double largest = in.nextDouble();
		while (in.hasNextDouble())
		{
			double input = in.nextDouble();
			if (input > largest)
			{
				largest = input;
			}
		}
//To compute the smallest value, reverse
		//double smallest = in.NextDouble();
		//while (in.hasNextDouble())
		//{
		//double input = in.nextDouble();
		//if (input < smallest)
		//{
		//smallest = input;
		//}}
	}

}
/**
 * double largest = value[0];
 * for(int i = 1; i < values.length; i++)
 * {
 * if(values[1] > largest)
 * }
 * Note that the loop starts at 1 because we initialize largest with values[0]
 * To compute the smallest element, reverse the comparison
 * These algorithms require that the array contain at lease one element
*/