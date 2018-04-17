//blueprint of how to implement queue

public class Queue {
	private static class Node
	{
		private int data;//pointer to data
		private Node next;//pointer to next node
		private Node(int data) 
		{
			this.data = data;
		}
	}
	
	private Node head;// remove from the head
	private Node tail;// add things here
	
	public boolean isEmpty()
	{
		return head == null;//if head is empty, it will return null
	}
	public int peek() 
	{
		return head.data;
	}
	public void add(int data) 
	{
		//add to tail
		Node node = new Node(data);
		if (tail != null)//if tail is not node
		{
			tail.next = node;
		}
		tail = node;//update tail
		if (head == null)
		{
			head = node;
		}
	}
	public int remove()//remove from head of linked list
	{
		int data = head.data;//head data
		head = head.next;//removes from queue
		if (head == null)
		{
			tail = null;
		}
		return data;
		
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
