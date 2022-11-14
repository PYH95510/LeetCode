package practicing;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle141 {
	
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	
	public class Solution {
		public boolean hasCycle(ListNode head) {
		       Set<ListNode>cycle = new HashSet<ListNode>();
		        
		        while(head!=null){
		            if(cycle.contains(head))return true;
		            
		            cycle.add(head);
		            head = head.next;
		        }
		        
		        return false;
		        
		    }
	}

}
