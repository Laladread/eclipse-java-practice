import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		//program code
		System.out.println("Let us try if we can get to the method world:");
		greet();
		System.out.println();
		
		
		System.out.println("It seems like we can, let us try again:");
		
		greet();
		greet();
		greet();

	}
	
	//self-written methods
	
	public static void greet()
	
	{
		System.out.println("Greetings from the world of methods!");
	}

}
