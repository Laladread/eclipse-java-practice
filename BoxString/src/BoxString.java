/**
 * Prints a string in a box
 * contents of the string to enclsose in a box
 */

/**
 * @author LalaDread
 *
 */
public class BoxString {
	
	
	
	public static void boxString(String contents)
	{
		int n = contents.length();
		
		for (int i = 0; i < n +2; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println("!" + contents + "!");
		
		for (int i = 0; i < n + 2; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
		
}
