import java.util.Scanner;

/**
 * This program uses total distance of the trip, 
 * to Greensboro, NC from Stone Mountain, GA, 
 * the mpg of vehicle, and the current price of
 * gas to calculate the total cost of the trip.
 */

/**
 * @author LalaDread
 *
 */
public class NCTravel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double distance;
		double pricePerGallon;
		double mpg;
		double totalCost;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the total distance of the trip: ");
		
		distance = in.nextDouble();
		
		System.out.println("Enter the mpg for the car: ");
		
		mpg = in.nextDouble();
		
		System.out.println("Enter the cost of a Gallon of gas : ");
		
		pricePerGallon = in.nextDouble();
		
		totalCost = (distance/mpg) * pricePerGallon;
		
		System.out.printf("The trip to North Carolina will be $%0.2f," totalCost);
		System.out.println();
		
		
	}

}
