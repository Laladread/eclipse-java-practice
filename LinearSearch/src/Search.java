/**
 * sequential search inspects the elements in a sequence
 * You often need to search for the position of a specific element in an array
 * so that you can replace or remove it.
 * Visit all elements until you have found a match or you have come to the end 
 * of the array
 */

/**
 * @author LalaDread
 *
 */
public class Search {
	
	int searchedValue = 100;
	int pos = 0;
	boolean found = false;
	while(pos < values.length && !found)
	{
		if(values[pos] == searchedValue)
		{
			found = true;
		}else{
			pos++;
		}
	}
	if(found)
	{
		System.out.println("Found at position: " + pos);
	}else{
		System.out.println("Not found");
	}

}
}
