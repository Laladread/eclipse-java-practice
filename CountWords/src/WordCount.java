import java.util.Scanner;
//this loop is used for scanning inputs.
public class WordCount {

	public static void main(String[] args) {
//the following loop reads text, a word at a time, 
	//and counts the number of words with at most 3 letters
		Scanner in = new Scanner(System.in);
		
		int shortWords = 0;
		while (in.hasNext())
		{
			String input = in.next();
			if (input.length() <= 3)
			{
				shortWords++;
			}
		}

	}

}
