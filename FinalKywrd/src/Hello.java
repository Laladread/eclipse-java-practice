
public class Hello {
	
	private int sum;
	private final int number;
	
	
	public Hello(int x)
	{
		number = x;
	}
	
	public void add()
	{
		sum += number;
	}
	
	public String toString()
	{
		return String.format("sum = %d\n", sum);
	}

}
