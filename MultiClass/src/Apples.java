import java.util.Scanner;

public class Apples {

	public static void main(String[] args) {
		
		//tuna tunaObject = new tuna();
		//tunaObject.simpleMessage();
		
		
		//Method with parameter example
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);

	}

}
