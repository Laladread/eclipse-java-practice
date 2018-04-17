import java.util.ArrayList;
public class ArrayList {

	public static void main(String[] args) {
		
		//Create new ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		
		//Add three elements
		list.add(101);
		list.add(100);
		list.add(99);
		list.add(100);
		list.add(99);
		
		//When using indexOf and lastIndexOf it is important to test for -1
		//Search for values
		
		int index = list.indexOf(100); //sysout(index) = 1
		int lastIndex = list.lastIndexOf(100); //sysout(lastIndex)
		int notFound = list.indexOf(200); //sysout(notFound)
		
		//Display values
		for(int value : list)
			
		{
			System.out.println(value);
		}
		
		
		//Clear ArrayList
		list.clear();
		
		//It is now empty
		if(list.isEmpty())
		{
			System.out.println("empty");
		}
		
		//Remove first element
		list.remove(0);
		System.out.println(list);
		
		//Remove element with the value of bird
		list.remove(100);
		System.out.println(list);

	}

}

//Get size and display
/*int count = elements.size();
System.out.println("Count: " + count);

//Loop through the elements
for(int i = 0; i < elements.size(); i++)
{
	int value = elements.get(i);
	System.out.println("Element: " + value);
}
*/
