import java.util.Scanner;

public class TestAccount {
	
	public static void main(String[] args) {
		
		String FName, LName;
		double balance;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter account holder's first name");
		FName = scan.next();
		System.out.println("Enter account holder's last name");
		LName = scan.next();
		
		System.out.println("\nEnter initial balance");
		balance = scan.nextDouble();
		
		System.out.printf("\nDepositing 100 into account, balance is now");
		System.out.printf("balance: %.2f", + balance);
		
		System.out.format("FName, LName, balance");

}
}
