class Witch
{
	private String name;
	private int age;
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	
	public void setAge(int setAge)
	{
		 age = setAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
}
public class MethParPra {

	public static void main(String[] args) {
		
		Goat goat1 = new Goat();
		
		goat1.setName("Devil");
		goat1.setAge(38);
		
		System.out.println(goat1.getName());
		System.out.println(goat1.setName());
		
		
	}

}
