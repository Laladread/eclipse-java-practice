import java.util.*;

public class ArrayList {
   public static void main(String args[]) {
	   
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	   
	   
	  ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
	  obj.add("Latriss");
	  obj.add("Nicholette");
	  obj.add("Xavier");
	  obj.add("Nnenna");
	  obj.add("Unknown");

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:" + obj);

	  /*Add element at the given index*/
	  obj.add(0, "Patricia");
	  obj.add(1, "JimK");

	  /*Remove elements from array list like this*/
	  obj.remove("Unknown");
	  obj.remove("JimK");

	  System.out.println("Current array list is:"+obj);

	  /*Remove element from the given index*/
	  obj.remove(1);

	  System.out.println("Current array list is:"+obj);
   }
}