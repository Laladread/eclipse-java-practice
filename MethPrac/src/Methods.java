/*Write the following methods and provide a program to test them.
a.  boolean allTheSame(double x, double y, double z) , returning true if the arguments 
are all the same 
b.  boolean allDifferent(double x, double y, double z) , returning true if the argu- 
ments are all different 
c.  boolean sorted(double x, double y, double z) , returning true if the arguments are 
sorted, with the largest one coming first*/

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean allTheSame(double x, double y, double z) { 
		 return x == y && y == z; 
		    } 
	
		    public static boolean allDifferent(double x, double y, double z) { 
		 return x != y && x != z && y != z; 
		    } 
		    
		    public static boolean sorted(double x, double y, double z) { 
		 return ((x > y && y > z) || (x >= y && y > z)); 
		 
		    } 
		    
		    
		    /*Write the following methods and provide a program to test them.
		    a.  double smallest(double x, double y, double z) , returning the smallest of the 
		    arguments 
		    b.  double average(double x, double y, double z) , returning the average of the 
		    arguments*/
		    
		    public static double smallest(double x, double y, double z) { 
		    	 return ((x <= y && x < z) || (x < y && x <= z))? x : 
		    	  (y < x && y < z)? y: z; 
		    	    } 
		    
		    	    public static double average(double x, double y, double z) { 
		    	 return (x + y + z) / 3; 
		    	    } 
		    	    
		    	    
		    	    /*Write the following methods.
		    	    a.  int firstDigit(int n) , returning the first digit of the argument 
		    	    b.  int lastDigit(int n) , returning the last digit of the argument 
		    	    c.  int digits(int n) , returning the number of digits of the argument 
		    	    For example, firstDigit(1729) is 1, lastDigit(1729) is 9, and digits(1729) is 4. 
		    	    Provide a program that tests your methods.*/
		    	    
		    	    
		    	    public static int firstDigit(int number) { 
		    	    	 char firstDigit = Integer.toString(number).charAt(0); 
		    	    	 return Character.getNumericValue(firstDigit); 
		    	    	    } 
		    	    
		    	    	    public static int lastDigit(int number) { 
		    	    	 return number % 10; 
		    	    	    } 
		    	    	    
		    	    	    public static int digits(int number) { 
		    	    	 return Integer.toString(number).length(); 
		    	    	    } 

}
