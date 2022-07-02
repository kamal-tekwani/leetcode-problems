package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/reverse-linked-list/
 * Solution Link : https://leetcode.com/problems/reverse-linked-list/discuss/58125/In-place-iterative-and-recursive-Java-solution
 */

public class Q206_Reverse_Linked_List 
{
	class ListNode
	{
		int val;
		ListNode next;

		public ListNode(int val)
		{
			this.val = val;
			this.next = null;
		}
	}

	/*
	 * Iterative Approach
	 * 
	 * Time Complexity : 
	 * Space Complexity : 
	 */

	public ListNode reverseList(ListNode head) 
	{
		ListNode previous = null;
		ListNode current = head;

		while(current != null)
		{
			ListNode temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		return previous;
	}

}
