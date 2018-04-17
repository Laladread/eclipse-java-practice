package methClasSam;

public class classSample {

	public static void main(String[] args) {
		int x = 4;
		x = mystery(x + 1);
		System.out.println(s);

	}
	
	public static int mystery(int x)
	{
		int s = 0;
		
		for (int i = 0; i < x; x++)
		{
			int x = i + 1;
			s = s + x;
		}
		return s;
	}

}
