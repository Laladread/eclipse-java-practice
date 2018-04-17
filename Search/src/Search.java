import java.util.Random;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author LalaDread
 *
 */
public class Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number that is greater than 100:");
		long startTime, stopTime;
		int size = scanner.nextInt();
		
		int A [] = new int[size];
		int B [] = new int[size];
		int C [] = new int[size];
		
		A = setArrayRandom(size);
		B = setArrayRandom(size);
		C = setArrayRandom(size);
		
		System.out.println("Sequential Search: ");
		startTime = System.nanoTime();
		Seq_search(A , 1);
		stopTime = System.nanoTime();
		System.out.println("1. Time Taken for Sequential Search:" + (stopTime - startTime));
		
		startTime = System.nanoTime();
		Seq_search(A , 50);
		stopTime = System.nanoTime();
		System.out.println("2. Time Taken for Sequential Search:" + (stopTime - startTime));
		
		startTime = System.nanoTime();
		Seq_search(A , 100);
		stopTime = System.nanoTime();
		System.out.println("3. Time Taken For Sequential Search:" + (stopTime - startTime));
		
		System.out.println("Binary Search:");
		startTime = System.nanoTime();
		Bin_search(sortArray(B , size), 1);
		stopTime = System.nanoTime();
		System.out.println("1. Time Taken For Binary Search:" + (stopTime - startTime));
		
		
		startTime = System.nanoTime();
		Bin_search(sortArray(B , size), 50);
		stopTime = System.nanoTime();
		System.out.println("2. Time Taken For Binary Search:" + (stopTime - startTime));
		
		startTime = System.nanoTime();
		Bin_search(sortArray(B , size), 100);
		stopTime = System.nanoTime();
		System.out.println("3. Time Taken For Binary Search:");
		
		System.out.println("Recursive Binary Search:");
		startTime = System.nanoTime();
		BinRe_search(sortArray(B , size), 0, B.length, 1);
		stopTime = System.nanoTime();
		System.out.println("1. Time Taken For Recursive Binary Search:" + (stopTime - startTime));
		
		
		startTime = System.nanoTime();
		BinRe_search(sortArray(B, size),0, B.length , 100);
		stopTime = System.nanoTime();
		System.out.println("3. Time Taken For Recursive Binary Search:" + (stopTime - startTime));

	}
	public static int BinRe_search(int[] sortedArray, int start, int end, int key)
	{
		if(start < end)
		{
			int mid = start + (end - start) / 2;
			
			if(key < sortedArray[mid])
			{
				return BinRe_search(sortedArray, start, mid, key);
			}
			
			else if(key > sortedArray[mid])
			{
				return BinRe_search(sortedArray, mid+1, end, key);
			}
			else{
				return mid;
			}
			}
				return -(start + 1);
		}
	
	
	public static int Bin_search(int[] arr, int search)
	{
		int start = 0;
		int end = arr.length - 1;
		
		
		while(start <= end)
		{
			int mid = (start + end) / 2;
			if(arr[mid] == search)
			{
				return mid;
			}
			else if(arr[mid] < search)
			{
				end = mid - 1;
			}else
				{
				start = mid + 1;
				}
		}
		return -1;
	}
	public static int Seq_search(int[] numbers, int key)
	{
		for(int index = 0; index < numbers.length; index++)
		{
			if(numbers[index] == key)
			{
				return index; //We have finally found it
			}
		}
		//A value hasn't been returned if we get to the end of the loop
		//We will not find the key that we are looking for
		return -1;
	}
	
	private static int[] sortArray(int nos[], int n)
	{
		for(int i = 1; i < n; i++)
		{
			int j = i;
			int B = nos[i];
			while((j > 0 ) && (nos[j - 1] > B))
			{
				nos[j] = nos[j - 1];
				j--;
			}
			nos[j] = B;
		}
		return nos;
	}
	
	public static int[] setArrayRandom(int arraySize)
	{
		int min = 1, max = 99;
		Random rand = new Random();
		int array[] = new int[arraySize];
		for(int i = 0; i < arraySize; i++)
		{
			int randomNum = rand.nextInt((max - min) + 1) + min;
			array[i] = randomNum;
		}
		return array;
	}

}
/**
 * 
 */ 
