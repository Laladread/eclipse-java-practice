import java.util.Scanner;

public class DoubleAverage {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter variable x: ");
		double x = in.nextDouble();
		
		System.out.println("Enter variable y: ");
		double y = in.nextDouble();
		
		System.out.println("Enter variable z: ");
		double z = in.nextDouble();
		
		double average;
		System.out.println("The average is: " + average(x,y,z));
		
		
		

	}

	public static double average(double x, double y, double z)
	{
		double average = (x + y + z) / 3;
		return average;
	}
}
