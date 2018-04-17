import java.util.Scanner;
/*
 * Latriss King Lab 2 Data Structures
 * 
 * The purpose of this code is to write a function that accepts one parameter and tests to see
 * if the entered parameter to the function is a legitimate Java identifier
 */
public class LabTwo {
	static boolean legitimateJavaIdentifier(String x)
	{
		if(x.length() == 1)
			//returns the length of the string. The length is = to the number of Unicode code units
		{
			if(Character.isLetter(x.charAt(0)))
			{
				return true; // returns char value at specified index
				
			}else
				
			{
				return false;
			}
		}
			else
			{
				if(Character.isLetter(x.charAt(0)) || x.charAt(0) == '_' || x.charAt(0) == '$')
					//Determines if the specified character is a letter
				{
					return true;
				}else
				{
					return false;
				}
			}
		
			
			
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//prompts user to enter information
		System.out.println("Welcome to the Legitimate java Identifier Tester!");
		
		
		String id = sc.next();
		System.out.println("Result: "+ legitimateJavaIdentifier(id));

	}

}
