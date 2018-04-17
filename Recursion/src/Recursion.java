//Header file section


/**
 * 
 * @author Latriss King Data Structures
 * This program is a function that takes a parameter as a string and tests to see if the string belongs
 * L = {S : S is in the form of AnB3n, for some n >= 0} where n and 3n are powers.
 * For example, if the input string AABBBBBB will be true, while ABABBBBB will return not true
 *
 */


//main class
public class Recursion {
	//method definition IsIn
	public static boolean IsIn(String s) {

	       if (s.isEmpty())
	       {
	           return true;
	       }

	       else if (s.length() >= 4) {

	           if (s.charAt(0) != 'A')
	               return false;
	           
	           if (s.charAt(s.length() - 1) != 'B')
	               return false;
	           
	           if (s.charAt(s.length() - 2) != 'B')
	               return false;
	           
	           if (s.charAt(s.length() - 3) != 'B')
	               return false;
	           
	           return IsIn(s.substring(1, s.length() - 3));//returns result

	       } else {
	           return false;
	       }
	       

	   }

	   public static void main(String[] args) {
	       // main method
		   //calling method returns result of test
	       System.out.println("String Is is Language: " + IsIn("AABBBBBB"));
	       
	       System.out.println("String Is is Language: " + IsIn(""));
	       
	       System.out.println("String Is is Language: " + IsIn("ABBB"));
	       
	       System.out.println("String Is is Language: " + IsIn("AABBB"));
	       
	       System.out.println("String Is is Language: " + IsIn("BBBB"));
	       
	       System.out.println("String Is is Language: " + IsIn("AA"));
	       
	       System.out.println("String Is is Language: " + IsIn("AAABBBBBBBBB"));

	   }

	}