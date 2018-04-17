import org.w3c.dom.Node;

public class LinkedList
{
	// reference to the head node.
	private Node head;
	private int listCount;
	
	
	// LinkedList constructor
	public LinkedList()
	{
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		head = null;
		listCount = 0;
	}
	
	
	
	public void addEnd(int data)
	// post: appends the specified element to the end of this list.
	{
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		
		
		Node tmp = head;
		// starting at the head node, crawl to the end of the list
		while(tmp.getNext() != null)
		{
			tmp = tmp.getNext();
		}
		// the last node's "next" reference set to our new node
		tmp.setNext(newNode);
		listCount++;// increment the number of elements variable
	}
	
	
	
	public void addHead(int data)
	// post: appends the specified element to the end of this list.
	{
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			newNode.setNext(head);
			head=newNode;
		}
	}
	
	
	
	
	public void add(int data, int index)
	// post: inserts the specified element AFTER the specified position in this list.
	// index should not be less than 1
	{
		if(index<=0 || index >= listCount){ // if index==0, meaning insertion at the head
			return;
		}
		Node newNode = new Node(data);
		Node tmp = head;
		// crawl to the requested index or the last element in the list,
		// whichever comes first
		
		
		for(int i = 0; i < index && tmp.getNext() != null; i++)
		{
			tmp= tmp.getNext();
		}
		// set the new node's next-node reference to this node's next-node reference
		newNode.setNext(tmp.getNext());
		// now set this node's next-node reference to the new node
		tmp.setNext(newNode);
		listCount++;// increment the number of elements variable
	}
	
	
	
	public int get(int index)
	// post: returns the element at the specified position in this list.
	{
		if(index < 0 || index>=listCount)
		{
			System.out.println("The index is out of bound");
		}
		
		Node current = head;
		for(int i = 0; i < index; i++)
		{
			current = current.getNext();
		}
		return current.getData();
	}
	
	
	
	
	public boolean delete(int index)
	// post: removes the element at the specified position in this list.
	{
		// if the index is out of range, exit
		if(index < 0 || index >= size())
			return false;
		
		Node current = head;
		// locate the node at index-1
		for(int i = 0; i < index-1; i++)
		{
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--; // decrement the number of elements variable
		return true;
	}
	
	
	
	public int size()
	// post: returns the number of elements in this list.
	{
		return listCount;
	}
	
	
	
	public String toString()
	{
		Node current = head;
		String output = "";
		while(current != null)
		{
			output += "[" + current.getData() + "]";
			current = current.getNext();
		}
		return output;
	}
	
}