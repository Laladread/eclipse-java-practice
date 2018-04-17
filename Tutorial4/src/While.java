
public class While {
	public static void main(String[] args) {
		
		
		int value = 0;
		
		
		while(value < 10)
		{
		
		System.out.println("Good " + value);
		
		value = value + 1;
		
		final double RATE = 5;
		final double INITIAL_BALANCE = 10000;
		final double TARGET = 3 * INITIAL_BALANCE;
		
		double balance = INITIAL_BALANCE;
		int year = 0;
		
		while (balance < TARGET)
		{
			year++;
			double interest = balance * RATE / 100;
			balance = balance + interest;
		}
		System.out.println("The investment doubled after " + year + " years.");
		}
		
		int n = 1;
		
		while (n < 100)
		{
			n = 2 * n;
			System.out.println(n + "");
		}
		
	
		

	}
  }

