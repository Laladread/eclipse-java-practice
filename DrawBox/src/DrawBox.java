
public class DrawBox {

	public static void main(String[] args) {
		drawBox(5,10);

	}
	public static void drawBox(int height, int weight)
	{
		//draw top of box
		writeChars('*',width);
		System.out.println();
		
		//draw middle lines
		for(int i = 1; i <= height - 2; i++)
		{
			System.out.println('*');
			writeChars('-', width - 2);
			System.out.println("*");
		}
		
		//draw bottom of box
		writeChars('', width);
		System.out.println();
	}
	
	public static void writeChars(char ch, int number)
	{
		for(int i = 1; i <= number; i++)
		{
			System.out.println(ch);
		}
	}

}
