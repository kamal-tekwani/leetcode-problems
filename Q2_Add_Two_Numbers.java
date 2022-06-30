package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/add-two-numbers/
 * Solution Link : https://leetcode.com/problems/add-two-numbers/discuss/1059/My-accepted-Java-solution
 */

public class Q2_Add_Two_Numbers
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1) 
	 */

	class ListNode
	{
		int val;
		ListNode next;

		public ListNode(int  val)
		{
			this.val = val;
			this.next = null;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		if(l1 == null && l2 == null)
			return null;

		int sum = 0;
		int carry = 0;

		ListNode head = new ListNode(-1);
		ListNode previous = head;

		while(l1 != null || l2 != null || carry != 0)
		{
			sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
			ListNode node = new ListNode(sum % 10);
			carry = sum / 10;
			previous.next = node;
			previous = node;
			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}

		return head.next;
	}
}
