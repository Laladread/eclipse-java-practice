//Example parameter passing by array name
public class Test {
	
	//a method which double the first value in the array
	public static void doubleV(int[] x)
	{
		x[0] = x[0] * 6;
		x[1] = x[1] * 8;
		x[2] = x[2] * 10;
	}
	
	//main function/method
	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		doubleV(array);
		System.out.println(array[0] + " "+ array[1] + " "+ array[2]);
		

	}

}
