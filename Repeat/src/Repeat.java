/*Write a method
public static String repeat(String str, int n) 
that returns the string str repeated n times. For example, repeat("ho", 
"hohoho" .*/


public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String repeat(String sentence, int times) { 
		 String output = ""; 
		 for (int i = 0; i < times; i++) { 
		     output += sentence; 
		 } 
		 return output; 
		    } 

}
