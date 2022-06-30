package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/merge-k-sorted-lists/
 * Solution Link : https://leetcode.com/problems/merge-k-sorted-lists/discuss/429518/JAVA-SUMMARY-of-all-solutions-(B-F-minPQ-Divide-And-Conquer)
 */

public class Q23_Merge_k_Sorted_Lists
{
	/*
	 * Time Complexity : O(k * N)
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

	public ListNode mergeKLists(ListNode[] lists) 
	{
		int i=0;
		int j=lists.length;

		while(i<j)
		{
			lists[i] = merge(lists[i],lists[j]);
			i++;
			j--;
			if(i>=j)
				i=0;
		}
		return lists[0];
	}

	public ListNode merge(ListNode list1,ListNode list2)
	{
		ListNode head = new ListNode(0);
		ListNode dummy = head;

		while(list1 != null && list2 != null)
		{
			if(list1.val < list2.val)
			{
				head.next = list1;
				list1 = list1.next;
			}
			else
			{
				head.next = list2;
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

}
