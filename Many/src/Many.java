import java.util.*;

public class Many {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How many times should the text be printed");
		int num = Integer.parseInt(reader.nextLine());
		
		while(num < 8)
		{
			printText();
			if(num > 8)
				break;
			{
				System.out.println("No Way!");
			}
			
		}
	
		

	}
	
	public static void printText()
	{
		System.out.println("In the beginning, there were the swamp, the hoe and Java.");
	}
	

}
