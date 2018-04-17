class Thing {
	public final static int LUCKY_NUMBER = 7;// value cannot be reassigned because it is constant
	
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public Thing() {
		count++;
	}
	
	public void showName() {
		System.out.println(description + ":" + name);//instance methods can access static data
		//static methods do not have  access to instance variables...to print
	}
	
	
	public static void showInfo() {
		System.out.println(description);//using description, it prints I am a thing
		//System.out.println(name);  wont work static methods will not work with instance variables non static
	}
}

public class StaticFinal {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		Thing.showInfo();//ran static method and prints Hello from class above
		//System.out.println(Thing.description);
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		thing1.name = "Latriss";
		thing2.name = "Terrell";
		
		//System.out.println(thing1.name); Didn't have to use sysout here because of method down below
		//System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);//constant variable
		

	}

}
