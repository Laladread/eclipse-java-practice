/**
 * 
 * @author Latriss King Data Structures Lab 7
 *The purpose of this lab is to place items within a stack using methods 
 *I have chose to provide an array example 
 */

public class Stack {
	
	private static int top; //top of stack ; indicates the next open slot
	private static int[] stack= new int[10];
	
	/**
     * Initializes an empty stack.
     */
    public Stack()
    {
        stack = null;
        top = 0;
    }
        
	
	public static void stack()
	{
		top = -1;
	}
	
	public static void push(int val) //push item onto stack;also checks if number is in range
	{
		if(top == 9)
		{
			System.out.println("overflow error");
		}else{
			top = top + 1;
			stack[top] = val;
			System.out.println(val+" is pushed into the stack."); 
		}
	}
	
	
	
	public static int pop()
	//Removes and returns the item most recently added to this stack.
	{ 
		int val;
		if(top == -1)
		{
			System.out.println("underflow error");
			return -1;
		}else{
			
			val = stack[top];
			top = top-1;
			return val;
			//the item most recently added
			//System.out.println(" popped value= "+val);
		}
	
	}

	
	public static void peek()
	//Returns (but does not remove) the item most recently added to this stack.
	{
		int x = pop();
		System.out.println("Value on top = " + x);
		push(x);
	}
	
	public int size() {
	    
		return top;
	}
	
	public boolean isEmpty()
	//Returns true if the stack is empty and false otherwise. 
	{
		
		return top == 0;
		
	}
	
}