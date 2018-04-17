import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Java ArrayList Examples - list of frequently used examples in ArrayList e.g. adding 
 * elements, removing elements, contains examples etc
 * @author
 */
public class ArrayList {

    public static void main(String args[]) {
      
        //How to create ArrayList in Java - example
        ArrayList<String> list = new ArrayList<String>();
      
        //Java ArrayList add Examples
        list.add("Apple");
        list.add("Google");
        list.add("Samsung");
        list.add("Microsoft");
    
        //Java ArrayList contains Example, equals method is used to check if
        //ArrayList contains an object or not
        System.out.println("Does list contains Apple :" + list.contains("Apple"));
        System.out.println("Does list contains Verizon :" + list.contains("Verizon"));
      
        //Java ArrayList Example - size
        System.out.println("Size of ArrayList is : " + list.size());
      
        //Java ArrayList Example - replacing an object
        System.out.println("list before updating : " + list);
        list.set(3, "Bank of America");
        System.out.println("list after update : " + list);
      
        //Java ArrayList Example - checking if ArrayList is empty
        System.out.println("Does this ArrayList is empty : " + list.isEmpty());
      
        //Java ArrayList Example - removing an Object from ArrayList
        System.out.println("ArrayList before removing element : " + list);
        list.remove(3); //removing fourth object in ArrayList
        System.out.println("ArrayList after removing element : " + list);
      
       //Java ArrayList Example - finding index of Object in List
        System.out.println("What is index of Apple in this list : " + list.indexOf("Apple"));
      
        //Java ArrayList Example - converting List to Array
        String[] array = list.toArray(new String[]{});
        System.out.println("Array from ArrayList : " + Arrays.toString(array));
      
        //Java ArrayList Example : removing all elements from ArrayList
        list.clear();
        System.out.println("Size of ArrayList after clear : " + list.size());
    } 
  
}
