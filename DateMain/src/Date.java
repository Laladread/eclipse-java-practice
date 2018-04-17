//Each Date object represents a particular year/month/day

public class Date {
	
	//fields - state of each Date object
	private int year;
	private int month;
	private int day;
	
	
	//constructors - initialize the state of created objects
	public Date(int initialYear, int initialMonth, int initialDay)
	{
		year = initialYear;
		month = initialMonth;
		day = initialDay;
	}
	
	
	public int getDaysInMonth()
	{
		if(month == 9 || month == 4 || month == 6 || month == 11)
		{
			return 30;
			
		} else if(month == 2)
		{
		
			if(isLeapYear()){
			return 29;
			
		}else{
			
		}
			return 28;
			
		}else {
			
			return 31;
		}
			
	}
	
	// Returns the number of days in the year represented by this Date
	// (366 for leap years, and 365 for other years). 
	public int getDaysInYear()
	{
		if(isLeapYear())
		{
			return 366;
			
		}else{
			
		return 365;	
		}
	}
	
	// accessor - return information about the state of the object
	//mutator - changes the state of the object
	
	public void nextDay()
	// 1. within same month
	// 2. wrapping to next month
	// 3. wrapping to next year
	{
		day++;
		if(day > getDaysInMonth())
		{
			// case 2
			month++;
			day = 1;
			if(month > 12)
			{
				month = 1;
			}
		}
	}
	
	
	public int daysBetween(Date other)
	// count number of days 
	// start at this date, move forward until we reach other
	{
		int count = 0;
		Date temp = new Date(this);
		while(temp.year != other.year || temp.month != other.month || temp.day != other.day)
				temp.nextDay();
				return count ++;
	}
	
	// methods - behavior of each Date object
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	// Returns true if this Date occurs in a leap year
	public boolean isLeapYear()
	{
		return(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}
	
	
		
		
	
	
	
	
	

}
