
public class Account {

	
		//Account class is made up of 3 variables
		
		private String FName;
		private String LName;
		private double balance;
		
		
		public void setName(String name)
		{
			this.FName = name;
			this.LName = name;
		}
		public Account(String FName,String LName, );
		{
		balance = initBal;
		name = LName + "," + LName;
		
		}
		
		public void withdraw(double amount)
		{
			if(balance >= amount)
				balance -= amount;
			else
				System.out.println("Insufficient funds");
		}
		
		//Adds deposit amount to balance
		
		public void deposit(double amount)
		{
			balance += amount;
		}
		
		//Returns balance
		public double getBalance()
		{
		return balance;	
		}
	
		

}
