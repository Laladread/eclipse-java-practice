
public class MethParam1 {

	public static void main(String[] args) {
		
		double resultSmallest = smallest(5.5, 9.0, 12.8);
		System.out.println("The smallest number is: " + resultSmallest);

	}
	
	public static double smallest(double x, double y, double z)
	{
		double smallestNumber = 0;
		if(x < y && x < z)
		{
			smallestNumber = x;
		}
		else if(y < x && y < z)
		{
			smallestNumber = y;
		}
		else if(z < x && z < y)
		{
			smallestNumber = z;
		}
		return smallestNumber;
	}
	

}
