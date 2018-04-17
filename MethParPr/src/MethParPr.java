import java.util.Scanner;

class Robot{
	public void speak(String text)
	{
		System.out.println(text);
	}
	
	public void jump(int height)
	{
		System.out.println("Jumping" + height);
	}
	
	public void move(String direction,double distance )
	{
		System.out.println("Moving " + distance + "meters in direction " + direction);
	}
}

public class MethParPr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input;
		
		Robot robby = new Robot(); 
		robby.speak("Hello, my name is Latriss, nice to meet you.");
		
		System.out.print("What is your name?: ");
		input =in.nextInt();
		robby.speak("It is a pleasure to meet you as well!");
		robby.jump(9);
		
		robby.move("northeast", 55.0);
		
		System.out.println();
		

	}

}


