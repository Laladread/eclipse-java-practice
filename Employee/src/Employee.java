// A class to represent employees
public class Employee {
	private int years;
	
	public Employee(int initialYears)
	{
		years = initialYears;
	}
	
	
	public int getYears()
	{
		return years;
	}
	
	
	public int getHours()
	{
		return 40; // works 40 hours a week
	}
	
	
	public double getSalary()
	{
		return 40000.0; // $40,000.00 a year
	}
	
	
	public int getVacationDays()
	{
		return 10 + 2 * years; // 2 weeks' paid vacation
	}
	
	
	public String getVacationForm()
	{
		return "yellow"; // use the yellow form
	}
	
	
	public String toString()
	{
		return "";
	}

}
