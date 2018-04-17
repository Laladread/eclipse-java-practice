
public class Stack {
	public boolean TestL(String S)
	{
	       QueueReferenceBased queue = new QueueReferenceBased();
	       StackReferenceBased stack = new StackReferenceBased();
	       char qItem, sItem;
	       int index = 0;
	if (S.length() == 0)
	       return false; // empty string not in L
	else if (S.length() == 1)
	       return true;
	while (S.charAt(index) != '$')
	{ // save the first half of the string
	       queue.enqueue(S.charAt(index));
	       ++index;
	} // end while
	// index points to '$' or its value > than inputString.length()
	while (index < S.length()-1)
	// save the second half of the string
	{
	++index;
	       stack.push(S.charAt(index));
	} // end while
	do
	// match the first half of the string with the second half
	{
	       if ((queue.isEmpty() && !stack.isEmpty()) ||
	       (!queue.isEmpty() && stack.isEmpty()))
	       {
	             return false;
	       }
	       
	             qItem = queue.peek();
	             sItem = stack.peek();
	             
	             if (qItem != sItem) 
	             {
	                    return false;
	             }
	             
	             if (!queue.isEmpty()) 
	             {
	            	 queue.dequeue();
	             }
	                    
	             if (!stack.isEmpty())
	             {
	            	 stack.pop();
	            	 		
	             }
	} 
	while (!stack.isEmpty() || !queue.isEmpty());
	
	if (queue.isEmpty() && stack.isEmpty()) 
		{
	       return true;
	       }
	       
	} // end TestL
}