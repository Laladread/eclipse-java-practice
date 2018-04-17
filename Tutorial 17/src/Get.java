class Frog{
	private String name;
	private int age;
	
	public void setName(String newName){
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Get {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		
		//frog1.name = "Tony";
		//frog1.age = 1;
		
		frog1.setName("Tony"); //calling a method
		frog1.setAge(1);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		

	}

}
