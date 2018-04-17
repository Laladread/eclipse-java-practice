/**
 * Binary Search cuts the sorted array size in half in each step
 */

/**
 * @author LalaDread
 *
 */
public class BinarySearch {

	boolean found = false;
	int low = 0;
	int high = values.length - 1;
	int pos = 0;
	while(low <= high && !found)
	{
		pos = (low + high) / 2;//Midpoint of the subsequence
		if(values[pos] == searchedNumber)
		{
			found = true;
		}
		else if(values[pos] < searchedNumber)
			{
				low = pos + 1;
			}//Look in second half
		else
			{
			high = pos - 1;
			}//Look in first half
	}
	if(found)
	{
		System.out.println("Found at position " + pos);
	}
	else
	{
		System.out.println("Not found. Insert before position " + pos);
	}
}
}
