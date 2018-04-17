
public class DateMain {

	public static void main(String[] args) {
		
		Date d1 = new Date(2009,10,17);
		//d1.year = 2009;
		//d1.month = 10;
		//d1.day = 17;
		
		Date d2 = new Date(2008, 31, 3);
		//d2.year = 2008;
		//d2.month = 2;
		//d2.day = 3;
		
		Date d3 = new Date(2010, 31,12);
		
		System.out.println(d1.getYear());
		System.out.println(d1.getDaysInMonth());
		System.out.println(d1.isLeapYear());
		System.out.println(d1.getDaysInYear());
		//System.out.println(d1.getYear + "/" + d1.month + "/" + d1.day);
		d1.nextDay(); //10/18
		//System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
		//System.out.println(d1.year);
		
		System.out.println(d2.getDaysInMonth());
		System.out.println(d2.isLeapYear());
		System.out.println(d2.getDaysInYear());
		//System.out.println(d2.year + "/" + d2.month + "/" + d2.day);
		d2.nextDay();
		//System.out.println(d2.year + "/" + d2.month + "/" + d2.day);
		
		//System.out.println(d3.year + "/" + d3.month + "/" + d3.day);
		d3.nextDay();
		//System.out.println(d3.year + "/" + d3.month + "/" + d3.day);
		
		System.out.println(d1.daysBetween(d2));
		//System.out.println(d2.daysBetween(d3));
		

	}

}
