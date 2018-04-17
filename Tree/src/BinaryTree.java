
public class BinaryTree {
	
	//Node -> Key(data)
	//  -> 2 children that a node can contain: left child, right child
	
	Node root;
	
	//add nodes to binary tree
	public void add(int data)
	{
		
		Node nodeToAdd = new Node(data);
				
				if(root == null)
					root = nodeToAdd;
				
				//if data is less than node, traverse left child, else traverse right 
				//child until we get to a node we can't traverse...insert new node
				
				traverseAndAddNode(root, nodeToAdd);
				
	}
	private void traverseAndAddNode(Node node, Node nodeToAdd)
	{
		if(nodeToAdd.data < node.data)
		{
			if(node.leftChild == null)
			{
				nodeToAdd.parent = node;
				node.leftChild = nodeToAdd;
			}
			else
			{
				traverseAndAddNode(node.leftChild, nodeToAdd);
			}
			
		}
		else if(nodeToAdd.data > node.data)
		{
			if(node.rightChild == null)
			{
				nodeToAdd.parent = node;
				node.rightChild = nodeToAdd;
			}
			else
			{
				traverseAndAddNode(node.rightChild, nodeToAdd);
			}
		}
	}
	
	public boolean delete (int val)
	{
		// case 1: node has no children
		//case 2: node has one child
		//case 3: node has two children
		
		Node nodeToBeDeleted = find(val);
		
		if(nodeToBeDeleted != null)//we found something
		{
			
			if(nodeToBeDeleted.leftChild == null && nodeToBeDeleted.rightChild == null)//check to see if have children
			{
				
				deleteCase1(nodeToBeDeleted);
				
			}
			else if(nodeToBeDeleted.leftChild != null && nodeToBeDeleted.rightChild == null)
			{
				//case3: node has both children populated
				deleteCase3(nodeToBeDeleted);
			}
			else if(nodeToBeDeleted.leftChild != null)
			{
				//case 2 where left child should be deleted
				
				deleteCase2(nodeToBeDeleted);
				
			}
			else if(nodeToBeDeleted.rightChild != null)
			{
				//case 2 where right child should be deleted
				
				deleteCase2(nodeToBeDeleted);
				
			}
			
		}
		
		return false;
	}
	
	private void deleteCase2(Node nodeToBeDeleted) 
	{
		//            50
		// del->    25   75
		//       10         80     50 would point to 10 when 25 is deleted
		
		if(nodeToBeDeleted.parent.leftChild == nodeToBeDeleted)
		{
			if(nodeToBeDeleted.leftChild != null)
			{
				
				nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.leftChild;
			}
			
		}
		else if(nodeToBeDeleted.rightChild != null)
		{
			
			nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.rightChild;
		}
	//}
		else if(nodeToBeDeleted.parent.rightChild == nodeToBeDeleted)
		{
			if(nodeToBeDeleted.leftChild != null)
			{
				
				nodeToBeDeleted.parent.rightChild = nodeToBeDeleted.leftChild;
			}
			
		}
		else if(nodeToBeDeleted.rightChild != null)
		{
			
			nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.rightChild;
		}
	}
		
//}
	
	private void deleteCase3(Node nodeToBeDeleted)
	{
		//           50
		//              75  <--delete
		//            60   80
		//               77   90
		//             76 <--should replace what has been deleted
		
		Node minNode = minLeftTraversal(nodeToBeDeleted.rightChild);
		
		deleteCase2(minNode);
		
		minNode.parent = nodeToBeDeleted.parent;
		minNode.leftChild = nodeToBeDeleted.leftChild;
		minNode.rightChild = nodeToBeDeleted.rightChild;
		
		nodeToBeDeleted.parent.rightChild = minNode;
		if(nodeToBeDeleted.parent == null)
		{
			
			root = minNode;
			
		}
		else
		{	
			if(nodeToBeDeleted.parent.leftChild == nodeToBeDeleted)
		{
			
			nodeToBeDeleted.parent.leftChild = minNode;
			
		}
		else if(nodeToBeDeleted.parent.rightChild == nodeToBeDeleted)
		{
			
			nodeToBeDeleted.parent.rightChild = minNode;
			
		}
		
		
	}
}
	
	private Node minLeftTraversal(Node node)
	{
		
		if(node.leftChild == null)
		{
			return node;
		}
		
		return minLeftTraversal(node.leftChild);
		
	}
	private void deleteCase1(Node nodeToBeDeleted)
	{

		//checks if the node to be deleted is the left or right child of the parent of the node
		//                    5     <---parent
		//                  /   \
		// leftchild       6     1     <----rightchild
		
		if(nodeToBeDeleted.parent.leftChild == nodeToBeDeleted)
		{
			
			nodeToBeDeleted.parent.leftChild = null;
			
		}
		else if(nodeToBeDeleted.parent.rightChild == nodeToBeDeleted)
		{
			
			nodeToBeDeleted.parent.rightChild = null;
			
		}
		
	}
	
	public Node find(int val)
	{
		
		if(root != null)
		{
			
			return findNode(root, new Node(val));
			
		}
		
		return null;
		
	}
	
	private Node findNode(Node search, Node node)
	{
		
		if(search == null) //nothing can do at this point
		{
			
			return null;
			
		}
		
		if(search.data == node.data)//if node's data is what we're looking for and equal
		{
			
			return search;//return search data and not node data
			
		}
		else
		{
			
			Node returnNode = findNode(search.leftChild, node);//recursive call back to itself to find
			//node based on root's left node
			
			if(returnNode == null)
			{
				
				returnNode = findNode(search.rightChild, node);
				
			}
			
			return returnNode;
			
		}
			
		
	}
	
	public void traverse()
	{
		//pre-order traversal , in-order traversal, post-order traversal
		
		if(root != null)//make sure the root is not equal to null
		{
			
			Node nodeToTraverse = root;
			
			if(nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null)
			{
				
				System.out.println(nodeToTraverse.data);
				
			}
			else
			{
				if(nodeToTraverse.leftChild != null)
					
				{
					
					inOrderTraversal(nodeToTraverse.leftChild);//going down the left side of tree
					
				}
						
				
			}
			
			if(nodeToTraverse.rightChild != null)
			{
				
				inOrderTraversal(nodeToTraverse.rightChild);
				
			}
			
		}
	}
	
	
	private void inOrderTraversal(Node node)
	{
		if(node.leftChild != null)//recursive call over and over until hit far left node
			
		{
			
			inOrderTraversal(node.leftChild);
			
		}
		
		System.out.println(node.data);//prints out data	
			
			if(node.rightChild != null)//checks to see if node has right child
				
			{
				
				inOrderTraversal(node.rightChild);//traverse with the right child
				
			}
			
			//System.out.println(node.data);
			
	  }

}
