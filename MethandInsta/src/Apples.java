
public class Apples {
	
	private String boyName;//instance variable that is outside of method, but inside of class
	
	
	
	public Apples(String name) {
		
	}

	public void setName(String name)
	
	{
		boyName = name;
	}
	
	public String getName()
	{
		return boyName;
	}
	
	public void saying()
	{
		System.out.printf("Your first boyfriend was %s", getName());
	}

}
