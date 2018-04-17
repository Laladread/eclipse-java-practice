//distinguished between array: array is indexed
	//have to start with head and work way through list making it slower

public class LinkedList {
	public class Node{
		Node next;
		int data;
		public Node(int data) 
		{//constructor
			this.data = data;
		}
	}
		
	Node head;
	
	public void append(int data) {//takes in data value and have a pointer starts 
		//out at head of linked list walk you through the list to get to end of linked list
		if (head == null)
		{
			head = new Node(data);
			return;
		}
		
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	public void prepend(int data) {
		//creates new head value, new head will link to old value
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	public void deleteWithValue(int data) {
		//walk through the link list and stop one before the one we want to delete
		//walk around to the next element
		if (head == null) return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			//don't want to go off the list
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
}
