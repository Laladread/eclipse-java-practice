import java.util.Random;
/*
 * Latriss King Data Structures
 * 
 * The purpose of this program is to create a size 10 array that randomly selects integers 
 */
public class LabThree
{
 public static void main(String[] args)
 {
    Random ran= new Random();
    int[] array = new int[10];// An array of ten integers. All elements are initialized with zero
    int last = 0;
   
    for (int a = 0; a < array.length; a++) {
        last = last + ran.nextInt(10) + 1;
        array[a] = last;
        System.out.println(array);
        System.out.println(getRandomNumber(1,10));
        printReversed(array);
    }
 }
 public static int getRandomNumber(int min, int max)
 {
	 if(min > max)
	 {
		 throw new IllegalArgumentException("max must be greater than min");
	 }
	 
	 {
		 return (int)(Math.random() * (max - min) + 1) + min;
	 }
 }
 
 public static void printReversed(int[] values)
	{
		//Traverse the array in reverse order, starting with the last element
		for(int i = values.length - 1; i >= 0; i--)
		{
			System.out.println(values[i] + " ");
		}
		System.out.println();
	}
 
}
