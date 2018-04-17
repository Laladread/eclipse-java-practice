import java.util.Scanner;

public class FirstMatch {

	public static void main(String[] args) {
		//a loop that finds the first space in a string
		
		boolean found = false;
		char ch = '?';
		int position = 0;
		while (!found && position < str.length())
		{
			ch = str.charAt(position);
			if (ch == '') 
			{
				found = true;
				}else{
					position++;
				}
			
		}

	}

}
