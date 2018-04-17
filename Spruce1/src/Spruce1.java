
public class Spruce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printStars(5);
		printStars(3);
		printStars(9);
		
		printSquare(4);
		printRectangle(17,3);

	}
	public static void printStars(int amount)
	{
		for(int i = 0; i < amount; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printSquare(int sideSize)
	{
		for(int i = 0; i < sideSize; i++)
		{
			System.out.println("****");
		}
	}
	
	public static void printRectangle(int width, int height)
	{
		int i;
		int j;
		for(i = 0; i < height; i++)
		{
			for(j = 0; j < width; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
