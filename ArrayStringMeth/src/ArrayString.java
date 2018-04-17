import java.util.Arrays;

/*
 * 

public static boolean contains(String[] stringArray, String stringToSearch)
{
 for (String element:stringArray) {
     if ( element.equals( stringToSearch )) {
           result = true;
           break;
       }
    }
    return result;
}
public static void main( String[] args )
{
    String[] thisIsAStringArray = {"Apple", "Banana", "Orange"};
    System.out.println( "The array contains the string Apple: " + contains(thisIsAStringArray, "Apple") );
    System.out.println( "The array contains the string Carrots: " + contains(thisIsAStringArray, "Carrots") );
}
 */
class Array{
	
public static void main( String[] args ) {
	
    String[] thisIsAStringArray = { "Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum" };
    Arrays.sort(thisIsAStringArray );
    for ( String element : thisIsAStringArray ) 
    {
        System.out.println(element);
    }
  }
}