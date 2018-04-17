/*
 * Latriss King   Lab 11
 * I will add three methods:
 * public void delete(int m); // delete the node with key m
 * public int countNodes();// count number of nodes in the tree
 * public btNode search(int m);// search for a node with key m and return it
 */


public class binaryTree {

   protected btNode root;

   /* Constructor */

   public binaryTree()

   {

       root = null;

   }

   /* Function to check if tree is empty */

   public boolean isEmpty()

   {

       return root == null;

   }

   /* Functions to insert data */

   public void insert(int data)

   {

       root = insert(root, data);

   }

   /* Function to insert data recursively */

   private btNode insert(btNode node, int data)

   {

       if (node == null)

           node = new btNode(data);

       else

       {

           if (data <= node.getData())

               node.left = insert(node.left, data);

           else

               node.right = insert(node.right, data);

       }

       return node;

   }

   /* Function for preorder traversal */

   public void preorder()

   {

       preorder(root);

   }

   private void preorder(btNode r)

   {

       if (r != null)

       {

           System.out.print(r.getData() +" ");

           preorder(r.getLeft());

           preorder(r.getRight());

       }

   }

   /*

   * Students in the LAB should complete three methods as follows

   */

    //Function for inorder traversal *//////////////////////////////////////////////////

  /* public void inorder()

   {

       //TO DO by students

       inorder(root);

   }

   private void inorder(btNode r)

   {

       if (r != null)

       {

           inorder(r.getLeft());

           System.out.print(r.getData() +" ");

           inorder(r.getRight());

       }

   }

   /* Function for postorder traversal *//////////////////////////////////////////////////

  /* public void postorder()

   {

       //TO DO by students

       postorder(root);

   }

   private void postorder(btNode r)

   {

       if (r != null)

       {

           postorder(r.getLeft());

           postorder(r.getRight());

           System.out.print(r.getData() +" ");

       }

   }

   /* Recursive approach to find height of binary tree *//////////////////////////////////////////////////

  /* public int findHeight(btNode root) {

       // TO DO by students

       if (root == null)

           return 0;

       else

       {

           /* compute the depth of each subtree */

          /* int lDepth = maxDepth(root.getLeft());

           int rDepth = maxDepth(root.getLeft());

           /* use the larger one */

          // if (lDepth > rDepth)

               //return (lDepth + 1);

          // else

             //  return (rDepth + 1);

 ////////////////////////////////////////////LAB 11////////////////////////////////////////////////// 
////////////////////////////////////////////LAB 11//////////////////////////////////////////////////      
////////////////////////////////////////////LAB 11//////////////////////////////////////////////////      

       public void delete(int val)
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
   		
   		return;
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
       
       /* Functions to count number of nodes */
       public int countNodes()
       {
    	   return countNodes(root);
       }
       
       /* Function to count number of nodes recursively */
       private int countNodes(BSTNode r)
       {
    	   if (r == null)
    	   {
    		   return 0;
    	   }
    	   else
    		   {
    		   		int l = 1;
    		   		l += countNodes(r.getLeft());
    		   		l += countNodes(r.getRight());
    		   		return l;
    		   }
       }
       
       
       
       /* Function to search for an element recursively */
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
 }