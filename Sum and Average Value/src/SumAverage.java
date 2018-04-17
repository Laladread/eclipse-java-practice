import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		double total = 0;
		int count = 0;
		while (in.hasNextDouble())
		{
			double input = in.nextDouble();
			total = total + input;
			count++;
		}

	}
		double average = 0;
		
		if (count > 0)
		{
			average = total / count;
		}
}
/**
 * double total = 0;
 * for(double element : values)
 * {
 * total = total + element;
 * }
 * double average = 0;
 * if(values.length > 0)
 * {
 * average = total / values.length;
 * }
 */
