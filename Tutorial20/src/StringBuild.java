
public class StringBuild {

	public static void main(String[] args) {
		//Inefficient
		String info = "";
		
		info += "My name is Latriss.";
		info += " ";
		info += "I am a builder";//uses too much memory
		
		System.out.println(info);
		//More efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My is is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		//advanced String formatting
		System.out.print("Here is some text.\tThat was a tab.\nThat was a new line.");
		
		System.out.println(" More text should be on the same line with println");
		
		//formatting integers
		System.out.printf("Total cost  is %d; quantity is %d", 5, 150);
		
		//Lets say that you have a loop
		for(int i = 0; i<20; i++) {
			System.out.printf("%2d: place text here\n", i);
		}
		
			for(int i = 0; i<20; i++) {
				System.out.printf("%2d: %s\n", i, "here is some text");
		}
			
			//formatting floating point value
			System.out.printf("Total value: %.2f\n", 5.6874);
			System.out.printf("Total value: %-6.1f\n", 343.23423);
			
			
		
		

	}

}
