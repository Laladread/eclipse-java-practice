//Reads a series of high temperatures and reports the avg and the number of days above avg

import java.util.*;

public class test {

	public static void main(String[] args) {
		
		Scanner temp = new Scanner(System.in);
		System.out.println("How many days' temperatures? ");
		int numDays = temp.nextInt();
		int[] temps = new int[numDays];
		
		
		//record temperature and find average
		int sum = 0;
		for(int i = 0; i < numDays; i++);
		{
			System.out.println("Day " + (i +1) + "'s high temp: ");
			temps[i] = temp.nextInt();
			sum += temps[i];
			
		}
		
		double average = (double) sum / numDays;
		
		//count days above average
		int above = 0;
		
		for(int i = 0; i < temps.length; i++);
		{
			if(temps[i] > average)
			{
				above++;
			}
		}
		
		//report results
		System.out.println();
		System.out.println("Average = " + average);
		System.out.println(above + " days above average");
		

	}

}
