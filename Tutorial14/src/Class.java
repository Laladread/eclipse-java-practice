//class is a blueprint for creating objects

class Person {
// Instance variables (data or "state")
	String name;
	int age;


//Classes can contain
//1. Data
//2. Subroutines (methods)
	
	void speak() {
		//can also put a for loop that references instance variable, above
		for(int i=0; i<3; i++) {
			System.out.println("My name is: " + name + " and I am " + age + "years old ");
	}
  }

	void sayHello() {
		System.out.println("Hello there!");
	}

public class Class {
	
	public static void main(String[] args) {
		//in main program, I can write about the Person class that was made
		
		Person person1 = new Person();
		person1.name = "Latriss King";//person1 is an object
		person1.age = 38;
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		person2.name = "Terrell Smith";
		person2.age = 43;
		person2.speak();//method
		
	}
		//Java methods are being discussed as well
	//methods provide the behavior to the code

	}
}


