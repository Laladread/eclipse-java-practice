
public class BST {
	
	public static boolean binarySearchRecursive(int[] array, int x, int left, int right)
	//recursive BST method
	{
		if (left > right) //we know we have an error at this point
		{
			return false;
		}
		
		int mid = left + ((right - left) / 2);//mid point that prevents overflow
		if(array[mid] == x)//if array of mid is what looking for
		{
			return true;
		
		}else if(x < array[mid])//x is on the left side of mid, go search left side
		{
			return binarySearchRecursive(array, x, left, mid - 1);//right point
			
		}else
		{
			return binarySearchRecursive(array, x, mid + 1, right);//otherwise search the right side
		}
		
	}
	public static boolean binarySearchRecursive(int[] array, int x)
	{
		return binarySearchRecursive(array, x, 0, array.length - 1);//left being 0 and right is endpoint
	}




	
	public static boolean binarySearchIterative(int[] array, int x)
	//iterative BST method
	{
		int left = 0;
		int right = array.length - 1;//starts at right most position in array
		while (left <= right)//loop as long as left and right are in correct positions
		{
		
			int mid = left + ((right - left) / 2);//mid point that prevents overflow
			if(array[mid] == x)//if array of mid is what looking for
		{
			return true;
		
		}else if(x < array[mid])//x is on the left side of mid, go search left side
		{
			right = mid - 1;
			
		}else
		{
			left = mid + 1;//otherwise search the right side
		}
		
	}
		return false;//if exit here, haven't found it
	}
	}
	


