import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type a number:");
		System.out.println("Type another number:");
		int number = Integer.parseInt(reader.nextLine());
		
		int anothNum = Integer.parseInt(reader.nextLine());
		
		//int sum = number + anothNum;
		double div = (double) number / anothNum;
		
		System.out.println("Division: 3 / 2 = " + div);
		
	}

}
