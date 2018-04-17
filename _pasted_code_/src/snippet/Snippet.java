package snippet;
import java.util.Scanner;

public class Snippet {
	
	public static boolean checkB(String w1,int ctr)
	{
		
		int ctr1=0;
		ctr=ctr*3;
		boolean x=false;
		
		
		if(w1.contains("A")||w1.contains("a"))
		{
			x=false;
		}
		
		
		else
		{
			char arr[]=w1.toCharArray();
			for(int i=0;i<w1.length();i++)
				
			{
				if(arr[i]=='B'||arr[i]=='b')
					
				{
					ctr1++;
				}
	}
			
			if(ctr1==ctr)
			{
				x=true;
			}
	}
		
		
		return x;
	}
	
	
	public static boolean IsIn(String w)
	
	{
		int ctr=0,sm=0;
		boolean y = false;
		
		char arr[] =w.toCharArray();
		for(int i=0;i<w.length();i++)
			
		{
			if(arr[i]=='A'||arr[i]=='a')
			{
				ctr++;
			}
			
			else
			{
				sm=i;
				break;
			}
	}
		
		
		y=checkB(w.substring(sm,w.length()),ctr);
		return y;
	}
	
	public static void main(String args[])
	
	{
		
	String str1;
	Scanner s = new Scanner(System.in);
	System.out.println ("Enter the String:");
	str1 = s.nextLine();
	
	
	
	if(IsIn(str1))
	{
		System.out.println("The string " + str1 + " is in the language.");
	}
	
	else
	{
		System.out.println("The string " + str1 + " is in NOT the language.");
	}
	
	}
	
}


