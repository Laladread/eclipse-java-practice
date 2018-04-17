import java.util.Scanner;
public class Palindrome {
	
	public static boolean checkPalindrome(String s)
	{
		if(s.length() == 0 || s.length() == 1)
		{
			return true;
		}
		else 
		{
			if(s.charAt(0) == s.charAt(s.length() - 1))
				/*
				 * checks for first and last char of String
				 * if  they are the same then do the same thing for a substring
				 * I believe that the function is calling itself
				 */
			{
				return checkPalindrome(s.substring(1, s.length() - 1));
				/*
				 * If program control reaches this statement it means that the String is not a Palindrome
				 */
			}
			return false;
	}
}
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = scanner.nextLine();
		/*
		 * If function returns true then the string is palindrome
		 */
		if(checkPalindrome(str))
		{
			System.out.println(str + " is a palindrome");
		}
		else
		{
			System.out.println(str + " is not a palindrome");
			/*
			 * Sublime Text Editor
			 * ----- BEGIN LICENSE -----
Maximillian Naza
Single User License
EA7E-1009367
A585D696 D11003EF 19A439B0 7A833A99
63FE2289 DA874BFF 9E8D94BA 3FA39600
2EC4081F 17436F49 AC0B3E76 23E6F796
CDC31DDA E872F468 C1143CB3 0DFC8D0B
7E18963D 4CF0FF5E 2F13E9EC A01E6B37
9ACF918A 428358D9 85CE6988 A2535A61
1F4D317A 62404116 8E73746C C433C580
75B6E119 722561C3 05A074B5 65619F94
------ END LICENSE ------
			 */
		}
	}
}
