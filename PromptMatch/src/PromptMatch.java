import java.util.Scanner;

public class PromptMatch {

	public static void main(String[] args) {
		//prompts until a match is found
		Scanner in = new Scanner(System.in);
		
		boolean valid = false;
		double input = 0;
		while (!valid)
		{
			System.out.print("Please enter a positive value < 100: ");
			input =in.nextDouble();
			if (0 < input && input < 100)
			{
				valid = true;
			}else{
				System.out.println("Invalid input.");
			}
		}

	}

}
