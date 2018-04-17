/*
 * Latriss King
 * Extra Credit 1
 * The idea is to get pointer to the last node of list. And then traverse the list starting from the 
 * head node and move the even valued nodes from their current position to end of the list.
 */


public class ListNode {
	
	int val;
	ListNode next;
	ListNode(int x) 
		{
			val = x;
		}
	}
// solution class 
	public class Solution 	
	{
		void oddEvenList(ListNode head)
		{
		ListNode end = head;
		ListNode prev = null;
		ListNode curr = head;

		/* Get pointer to last ListNode */
		while (end.next != null)
		end = end.next;

		ListNode new_end = end;

		// Consider all even ListNodes before getting first odd ListNode
		
		while (curr.data %2 ==0 && curr != end)
		{
			new_end.next = curr;
			curr = curr.next;
			new_end.next.next = null;
			new_end = new_end.next;
		}

		
		// do following steps only if there is an odd ListNode
		if (curr.data %2 !=0)
		{
			head = curr;

		// now curr points to first odd ListNode
		while (curr != end)
		{
			if (curr.data % 2 != 0)
				
		{
				prev = curr;
				curr = curr.next;
		}
			
		else
		{
		/* Break the link between prev and curr*/
			prev.next = curr.next;

		/* Make next of curr as null */
			curr.next = null;

		/*Move curr to end */
			new_end.next = curr;

		/*Make curr as new end of list */
			new_end = curr;

		/*Update curr pointer */
			curr = prev.next;
		}
	}
}

		/* We have to set prev before executing rest of this code */
		else prev = curr;

		if (new_end != end && end.data %2 == 0)
		{
			prev.next = end.next;
			end.next = null;
			new_end.next = end;
		}
	}
}

