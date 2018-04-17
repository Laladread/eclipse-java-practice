/*
 * Latriss King Lab 5
 * Data Structures
 * The purpose of this program is to insert elements at beginning and end of an array
 * and to print out array using toString method
 */
import java.util.Arrays;
public class LabFive {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		//Generates 10 Random Numbers in the range of 1-5
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 5 + 1);
			printReversed(numbers);
		}
		

	}
	public static void insertBeginning(int[]numbers, int pos)
	{
		int size;
		for(int i = size + 1; i > pos;i++)
		{
			numbers[i] = numbers[i+1];
		}
		numbers[pos] = new number;
	}
	
	public static void insertEnd(int[] numbers)
	{
		int pos;
		int size;
		for(int i = size - 1; i > pos; i--)
		{
			numbers[i] = numbers[i-1];//goes from lower index to higher index
		}
		numbers[pos] = new number;
	}
	public static void insertIndex(int[]numbers)
	{
		int size = 0;
		size ++; //I increase the size
		int pos;
		for(int i = size - 1; i > pos; i--)//loop makes room for the new element starting at size - 1
		{
			numbers[i] = numbers[i - 1];
		}
		numbers[pos] = new number;
	}
	
	public static void printReversed(int[] numbers) 
	{//Traverse the array in reverse order , starting with the last element
		for(int i = numbers.length - 1;i >= 0; i--)
		{
			System.out.println(numbers[i] + "");
		}
		System.out.println();
		
	System.out.println("The string representation of an array is:");
	System.out.println(Arrays.toString(numbers));
	//returns a string representation of the contents of array
	}
	
	

}
