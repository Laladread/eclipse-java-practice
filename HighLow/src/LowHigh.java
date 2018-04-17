import java.util.Scanner;

/**
 * 
 */

/**
 * @author LalaDread
 *Prompts the user to enter a value within a given range until the user
 *provides valid input
 *high the largest allowable input
 *return the value provided by the user (between low and high, inclusive
 */
public class LowHigh {

	public static int readIntBetween(int low, int high)
	{
		int input;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("Enter a value between " + low + " and " + high + " : ");
			input = in.nextInt();
		}
			while (input < low || input > high);
		{
			return input;
		}
	}
}
