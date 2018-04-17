/*Write a method
public static String middle(String str) 
that returns a string containing the middle character in str if the length of str is odd, 
or the two middle characters if the length is even. For example, middle("middle") 
returns "dd" .
*/

public class MiddleStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//String word = "hello";
	System.out.println(middle("flower"));
		

	}
	
	public static String middle(String str) { 
		 String output = ""; 
		 int sentence_middle = str.length() / 2; 
		 
		 if (str.length() % 2 == 0) { 
			 
		     output = str.substring(sentence_middle - 1, sentence_middle + 1); 
		 } 
		 else { 
			 
		     output = str.substring(sentence_middle, sentence_middle + 1); 
		 } 
		 return output; 
		    } 

}
