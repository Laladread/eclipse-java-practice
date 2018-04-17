
public class StackEx {
	private static class Node{
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	private Node top;//here, we want to add and remove from the top
	
	public boolean isEmpty()
	{
		return top == null;
	}
	public int peek() 
	{
		return top.data;
	}
	public void push(int data) 
	{
		Node node = new Node(data);//creates new node
		node.next = top;//new node will become the top
		top = node;
	}
	public int pop() 
	{
		int data = top.data;//gets the data
		top = top.next;//moved to next element down
		return data;
		
		//if statement if you want to be complete top is null throw exception
		
	}

}
