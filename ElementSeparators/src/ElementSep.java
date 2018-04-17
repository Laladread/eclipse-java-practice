/**
 * 32 | 54 | 67.5 | 35
 */

/**
 * @author LalaDread
 *
 */
public class ElementSep {
	
	for(int i = 0; i < values.length; i ++)
	{
		if(i>0)
		{
			System.out.println(" | ");
		}
		System.out.println(values[i]);
	}
	

}
//If you want to use comma separators, you can use the Arrays.toString method. 
//The expression: Arrays.toString(values)
//returns a string describing the contents of the array values in the form
//[32,54,67.5,29,35]