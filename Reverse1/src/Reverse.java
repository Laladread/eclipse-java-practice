import java.util.Scanner;

/**
 * The following example program reads values from standard input, multiplies them by 10, and 
 * prints the result in reverse order
 * 
 * The program uses three methods:
 * The readInputs method returns an array
 * The multiply method has an array argument. The modifies the array elements
 * The printReversed method also has an array argument, but it does not modify the array elements
 */

/**
 * @author LalaDread
 *
 */
public class Reverse {

	
	public static void main(String[] args) {
		// This program reads, scales, and reverses a sequence of numbers
		
		double[] numbers = readInputs(5);
		multiply(numbers,10);
		printReversed(numbers);

	}
	
	/**
	 * Reads a sequence of floating-point numbers
	 * numberOfInputs the number of inputs to read
	 * @return an array containing input values
	 */
	
	public static double[] readInputs(int numberOfInputs)
	{
		System.out.println("Enter " + numberOfInputs + " numbers: ");
		Scanner in = new Scanner(System.in);
		double [] inputs = new double[numberOfInputs];
		for(int i = 0; i < inputs.length; i++)
		{
			inputs[i] = in.nextDouble();
		}
		return inputs;
	}
	/**
	 * Multiplies all elements of an array by a factor
	 * @param values an array
	 * @param factor the value with which element is multiplied
	 */
		
	
		public static void multiply(double[] values, double factor)
		{
			for(int i = 0; i < values.length; i++)
			{
				values[i] = values[i] * factor;
			}
		}
	/**
	 * Prints an array in reverse order
	 * @param values an array of numbers
	 * @return an array that contains the elements of values in reverse order
	 */
		
		public static void printReversed(double[] values)
		{
			//Traverse the array in reverse order, starting with the last element
			for(int i = values.length - 1; i >= 0; i--)
			{
				System.out.println(values[i] + " ");
			}
			System.out.println();
		}
}

/**
 * Main function
 * Ask user to enter a string
 * Scan the string 
 * Check if the string is a palindrome: call Check Palindrome() method
 * print the result
 * CheckPalinedrome method:
 * Create a loop where you will compare the characters of the string
 * return boolean true if the string is a palindrome, false if not
 * Comparing two Strings
 * String mystring1 = "Lab1"
 * String mystring2 = "Lab2"
 * for(int i=0; i < mystring1.length(); i++){
 * if(mystring1.charAt(i)==mystring2.charAt(i)){
 * return true}
 * else{
 * return false
 * }}
 */