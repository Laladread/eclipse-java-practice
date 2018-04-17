import java.util.Scanner;
//This program counts how many spaces are in a string
public class CountMatch {

	public static void main(String[] args) {
		
		String str ="My Fair Lady";
		int spaces = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch == '')
			{
				spaces++;
			}
		}

	}

}
