import java.util.Scanner;

/*Write a method
public static int countVowels(String str) 
that returns a count of all vowels in the string str . Vowels are the letters a, e, i, o, and 
u, and their upper­case variants.*/

public class VowelCount {

	public static void main(String[] args) {
	
		System.out.println(countVowels("Nnenna is looking at me"));
		
		
	}
	
	public static int countVowels(String sentence) { 
		
		 int vowels_count = 0; 
		 
		 for (int i = 0; i < sentence.length(); i++) { 
			 
		     char current_char = Character.toLowerCase(sentence.charAt(i)); 
		     
		     if (current_char == 'a' || current_char == 'e' || current_char == 'o' 
		         || current_char == 'i' || current_char == 'u' || current_char == 'y') { 
		    	 
		  vowels_count += 1; 
		     } 
		 } 
		 return vowels_count; 
		    
	}

}
