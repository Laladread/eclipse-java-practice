import java.util.Scanner;

public class Oranges {
	public static void main(String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		Apples applesObject = new Apples("Charlie Brown");
		System.out.println("Enter name of first boyfriend here: ");
		
		String temp = input.nextLine();
		applesObject.setName(temp);
		applesObject.saying();
		
		
		
	}

}
