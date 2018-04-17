//Parameter passing by an element
public class Test {
//a method which double the first value in the array
	
	public static void doubleV(int x)
	{
		x = x * 4;
	}
	
	//main function or method
	public static void main(String[] args) {
		
		
		int [] array = {1,2,3};
		doubleV(array[0]);
		System.out.println(array[0] + " " + array[1] + " " + array[2]);

	}

}
