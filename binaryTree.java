package binaryTreeLAB;
/*
 * CSC 2720, Mar.22, 2017
 * Lab Instructor : Zhuojun Duan
 * 
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

   /* Function for inorder traversal *//////////////////////////////////////////////////

   public void inorder()

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

   public void postorder()

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

   public int findHeight(btNode root) {

       // TO DO by students

       if (root == null)

           return 0;

       else

       {

           /* compute the depth of each subtree */

           int lDepth = maxDepth(root.getLeft());

           int rDepth = maxDepth(root.getLeft());

           /* use the larger one */

           if (lDepth > rDepth)

               return (lDepth + 1);

           else

               return (rDepth + 1);

       }

   }

}