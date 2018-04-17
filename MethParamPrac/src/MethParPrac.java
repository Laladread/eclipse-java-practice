
public class MethParPrac {

	public static void main(String[] args) {
		
		int x = 8;
		String y = "x";
		int z = 13;
		
		children(x, y, z);
		System.out.println(x + "" + y + "" + z);
		children(z, "y", x);
		children(x + 3, y + z, x + z);
		

	}
	public static void children(int x, String z, int y)
	{
		x++;
		y--;
		System.out.println(z + "" + y + "" + x);
	}

}
