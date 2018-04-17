import java.util.Scanner;

public class Application {
//user input
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for the user to enter a line of text
		String line = input.nextLine();
		
		//Tell them what they entered
		System.out.println("You entered: "+ line); 
		
		//Could be have integers and double placed as well
		// double value = input.nextDouble();
		// int value = input.nextInt(); 
		
		
	}

}
