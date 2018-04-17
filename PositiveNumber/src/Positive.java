import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number:");
		int number = Integer.parseInt(reader.nextLine());
		
		if (number > 0)
		{
			System.out.println("The number is positive");
		}
		
		else {
			
			System.out.println("The number is not positive");
		}
		
		

	}

}
