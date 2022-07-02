package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/merge-two-sorted-lists/
 * Solution Link : https://leetcode.com/problems/merge-two-sorted-lists/discuss/1826666/C%2B%2B-oror-Easy-To-Understand-oror-2-Approaches-oror-Recursive-oror-Iterative
 */

public class Q21_Merge_Two_Sorted_Lists 
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

	/*
	public ListNode mergeTwoLists(ListNode list1, ListNode list2)
	{
		if(list1 == null && list2 == null)
			return null;

		if(list1 == null)
			return list2;

		if(list2 == null)
			return list1;

		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;

		while(list1 != null && list2 != null)
		{
			if(list1.val <= list2.val)
			{
				ListNode node = new ListNode(list1.val);
				head.next = node;
				list1 = list1.next;

			}
			else 
			{
				ListNode node = new ListNode(list2.val);
				head.next = node;
				list2 = list2.next;
			}
			head = head.next;
		}

		if(list1 != null)
			head.next = list1;

		if(list2 != null)
			head.next = list2;

		return dummy.next;
	}
	 */

	/*
	 * Recursive Approach
	 * 
	 * Time Complexity : 
	 * Space Complexity : 
	 */

	public ListNode mergeTwoLists(ListNode list1, ListNode list2)
	{
		if(list1 == null && list2 == null)
			return null;

		if(list1 == null)
			return list2;

		if(list2 == null)
			return list1;

		if(list1.val < list2.val)
		{
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		}
		else
		{
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
	}

}
