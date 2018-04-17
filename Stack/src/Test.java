
public class Test extends Stack{
	public static void main(String[] args) {
		
		Stack s = new Stack();//creates and initializes new Stack
		s.push(22);
		//System.out.println("Element is pushed to the Stack!");
		System.out.println();
		s.push(17);
		System.out.println();
		
		s.push(4);
		s.peek();
		s.peek();
		System.out.println();
		
		s.push(12);
		s.pop();
		s.pop();
		System.out.println();
		
		s.push(7);
		s.pop();
		s.peek();
		s.pop();
		
		
	}
}
