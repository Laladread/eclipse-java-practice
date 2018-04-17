import java.io.*;

/**
 * 
 * @author Latriss King Data Structures Lab 8
 *
 *The purpose of this program is to convert a valid infix expression into a postfix expression
 */

public class Stack {
	char a[] = new char[100];
	int top = -1;
	
	public void push(char c){
		try
		{
			a [++top] = c;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Stack is full, no room to push, size = 100");
			System.exit(0);
		}
	}
	public char pop() {
		
		return a[top--];
	}
	
	public boolean isEmpty() {
		
		return (top == -1)?true:false;
	}
	
	public char peek() {
		
		return a[top];
	}
	


	
	public static Stack operators = new Stack();
	
	public static void main(String argv[]) throws IOException
	{
		
		String s;
		
		//create an input stream object
		BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
		
		//get input from user
		System.out.println("\nEnter the algebraic expression in infix: ");
		s = keyboard.readLine();
		
		//output as postfix
		System.out.println("The expression in postfix is: " + postfixEvaluate(s));
	}

	private static String postfixEvaluate(String s){
		//converts an infix expression to postfix
		char symbol;
		String postfix = "";
		
		for(int i=0; i<s.length(); i++)//while there is an input to read
		{
			symbol = s.charAt(i);
			//if it's an operand, add it to the string
			if(Character.isLetter(symbol))
				postfix = postfix + symbol;
			
			else if(symbol == '(')
				//push (
			{
				operators.push(symbol);
			}
			else if (symbol == ')')
				//push everything back to (
			{
				while(operators.peek() != '(')
				{
					postfix = postfix + operators.pop();
				}
				
				operators.pop();   //remove '('
			}
			else
				//print operators occurring before it that have greater precedence
			{
				while(!operators.isEmpty() && !(operators.peek() == '(') && prec(symbol) 
						<= prec(operators.peek())) postfix = postfix + operators.pop();
				
				operators.push(symbol);
			}
		}
		while (!operators.isEmpty()) postfix = postfix + operators.pop();
		return postfix;
	}
	
	
	public static int prec(char x)
	{
		
		if(x == '+' || x == '-')
			return 1;
		if(x == '*' || x == '/' || x == '%')
			return 2;
		return 0;
	}
	
	
}
