
public class ArrayString {

	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[0]);
		
		String[] fruits = {"apple", "banana","pear","kiwi"};
		
		for(String fruit: fruits)
		{
			System.out.println(fruit);
		}
		
		int value = 0;
		String text = null;
		
		System.out.println(text);
		
		//String[] texts = new String[2];
		
		//System.out.println(texts[0]);
		
		//texts[0] = "one";
		/*
		 * This code will loop through the array and check one by one if an element is equal to the item 
		 * being searched for
		 */
		String[] thisIsAStringArray = {"Apple", "Banana", "Orange"};
		String stringToSearch = "Banana";
		boolean found = false;
		for (String element:thisIsAStringArray)
		{
		    if ( element.equals( stringToSearch )) 
		    {
		        found = true;
		    }
		}
		
		if (found)
		{
		    System.out.println( "The array contains the string: " + stringToSearch );
		    
		} else {
			
		    System.out.println( "The array does not contains the string: " + stringToSearch );
		}
		
	}

}
