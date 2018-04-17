import java.util.Scanner;
/**
 * This program reads a sequence of values and prints them, marking the largest value
 */

/**
 * @author LalaDread
 *
 */
public class LargestInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int LENGTH = 100;
		double[] values = new double[LENGTH];
		int currentSize = 0;
		
		//Reads Inputs
		
		System.out.println("Please enter the values, Q to quit: ");
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble() && currentSize < values.length)
		{
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		//Find the largest value
		
		double largest = values[0];
		for(int i = 1; i < currentSize; i++)
		{
			if(values[i] > largest)
			{
				largest = values[i];
			}
		}
		//Print all values, marking the largest
		
		for(int i = 0; i < currentSize; i++)
		{
			System.out.print(values[i]);
			if(values[i] == largest)
			{
				System.out.print(" <== largest value");
			}
			System.out.println();
		}
	}

}
/**
 * Here is the same algorithm using an array list:
 * double largest = values.get(0);
 * for(int i = 1; i < values.size(); i++)
 * {
 * if(values.get(i) > largest)
 * {
 * largest = values.get(i);
 * }
 * }
 */
