import java.util.Random;

/*
 * Latriss King
 * Data Structures Lab 11
 * 
 * The purpose of this program generate 50 random numbers ranging 
 * from 1  to 99 and store it in an array, take one number at a time 
 * sequentially starting from  the leftmost value 
 * Upon building the Binary Search Tree, they must follow the rule that LeftChild < Parent <= RightChild
 * Print out the values of this second array.
 */
//A binary tree node
class Node {

	int data;
	Node left, right;

	Node(int d) {
		data = d;
		left = right = null;
  }
}

public class BinaryTree {
	
	   static Node root;

	   /* A function that constructs Balanced Binary Search Tree
	   from a sorted array */
	   
	   
	   Node sortedArrayToBST(int arr[], int start, int end) {

	       /* Base Case */
	       if (start > end) 
	       {
	           return null;
	       }

	       /* Get the middle element and make it root */
	       int mid = (start + end) / 2;
	       Node node = new Node(arr[mid]);
	       

	       /* Recursively construct the left subtree and make it
	       left child of root */
	       node.left = sortedArrayToBST(arr, start, mid - 1);
	       

	       /* Recursively construct the right subtree and make it
	       right child of root */
	       node.right = sortedArrayToBST(arr, mid + 1, end);
	      
	       return node;
	   }

	   /* A utility function to print preorder traversal of BST */
	   void preOrder(Node node) {
		   
	       if (node == null) 
	       {
	           return;
	       }
	       
	       System.out.print(node.data + " ");
	       preOrder(node.left);
	       preOrder(node.right);
	   }



public static void main(String[] args) {
    
	BinaryTree tree = new BinaryTree();
    int[] arr = new int[50];


    Random r = new Random(); //Random Class object creation
    int Low = 1;    //low value
    int High = 99;  //define high value
    
    System.out.println("Random 50 Elements : \n ");  
    
    for(int i=0; i<50; i++)      //loop to create 50 random numbers
    {
    	arr[i] = r.nextInt(High-Low) + Low;
   
    	System.out.print(arr[i]+" ");   //Display random numbers
    }

    int n = arr.length;
    
    
    root = tree.sortedArrayToBST(arr, 0, n - 1);
    //array elements converted to bst with left,root,right constraint
    
    System.out.println("\nBST(left,root,right) : \n ");
    tree.preOrder(root);  //Display BST tree
}
}

