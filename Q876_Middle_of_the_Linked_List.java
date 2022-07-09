package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/middle-of-the-linked-list/	
 * Solution Link : https://leetcode.com/problems/middle-of-the-linked-list/discuss/154619/C%2B%2BJavaPython-Slow-and-Fast-Pointers
 */

public class Q876_Middle_of_the_Linked_List 
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
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public ListNode middleNode(ListNode head) 
    {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
    }
}
