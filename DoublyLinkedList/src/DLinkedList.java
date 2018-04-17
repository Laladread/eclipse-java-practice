
public class DLinkedList {
	int size =0;
    DNode head = null;
    DNode tail = null;

    // add a new node at the head of the doubly linked list
    public void addAtStart(DNode n){
        System.out.println("Adding DNode at the start");
        if(size==0)
        {
            head = n;
            tail = n;
        }else{
            n.setLinkNext(head);
            head.setLinkPrev(n);
            head = n;
        }
        size++;
        
    }

 // add a new node at the end of the doubly linked list
    public void addAtEnd(DNode n)
    {
        System.out.println("Adding DNode at the End");
        if(size==0){
            head = n;
            tail = n;
        }else{
            tail.setLinkNext(n);
            n.setLinkPrev(tail);
            tail =n;
        }
        size++;
        
    }
    
    // add a new node after the index
    public void addAfterIndex(int index, DNode n)
    {
    	
    	System.out.println("Adding DNode after the index: "+ index);
    	if(index==0)
    	{
    		this.addAtStart(n);
    	}
    	
    	else if(index>=size)
    	{
    		this.addAtEnd(n);
    	}
    	else{
    		DNode curr=this.get(index);
    		//store the next DNode of given node 
            DNode nextDNode = curr.getLinkNext();
            
          //make new node' next point to prevDNode
            n.setLinkNext(nextDNode);
            
          // make new node' prev point to the given node
            n.setLinkPrev(curr);
            
          //make  given node point to new DNode
            curr.setLinkNext(n); 
           
            //make nextDNode'  prev point to new DNode
            nextDNode.setLinkPrev(n);
            
            
            
    	}
    }


 // Delete the first node of the doubly linked list
    public void deleteFromStart()
    {
        if(size==0){
            System.out.println("\nList is Empty");
        }else{
            System.out.println("\ndeleting DNode " + head.getData() + " from start");
            head = head.getLinkNext();
            size--;
        }
    }

 // Delete the node at the end of the doubly linked list
    public void deleteFromEnd()
    {
        if(size==0){
            System.out.println("\nList is Empty");
        }else if(size==1){
            deleteFromStart();
        }else{
            
            DNode prevTail = tail.getLinkPrev();
            //detach the last DNode
            tail = prevTail;
            prevTail.setLinkNext(null);
            System.out.println("Last node is deleted");
            size--;
        }
    }

    
    // get a node with the given index 
    public DNode get(int index)
    {
        if(index >= size)
        {
            return null;
        }
        
        DNode n = head;
        
        int i=0;
        while(i<index)
        {
        	i++;
        	n=n.getLinkNext();
        	
        }
        return n;
    }

    //get Size
    public int getSize()
    {
        return size;
    }
    
    // display the nodes in the doubly linked list
    public void display()
    {
    	if(head.getLinkNext()==null)
    	{
    		System.out.println("the doubly linked list is empty");
    	}
    	else{
    		DNode curr=head;
    		while(curr!=null){
    			System.out.print(curr.getData()+" ");
    			curr=curr.getLinkNext();
    		}
    		System.out.println();
    		}
    	}
    
    
    

   
}
