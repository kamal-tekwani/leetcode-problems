package com.home.leetcode.medium;

/*
 * Problme Link : https://leetcode.com/problems/copy-list-with-random-pointer/
 * Solution Link : (1) https://leetcode.com/problems/copy-list-with-random-pointer/discuss/43491/A-solution-with-constant-space-complexity-O(1)-and-linear-time-complexity-O(N) 
 *                 (2) https://www.youtube.com/watch?v=VNf6VynfpdM
 */

public class Q138_Copy_List_with_Random_Pointer 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	class Node
	{
		int val;
		Node next;
		Node random;

		public Node(int val)
		{
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	public Node copyRandomList(Node head)
	{
		Node current = head;
		Node front = head;

		while(current != null)
		{
			front = current.next;
			Node node = new Node(current.val);
			current.next = node;
			node.next = front;
			current = front;
		}

		current = head;

		while(current != null)
		{
			if(current.random != null)
				current.next.random = current.random.next;
			current = current.next.next;
		}

		current = head;
		Node dummy = new Node(-1);
		Node copy = dummy;


		while(current != null)
		{
			front = current.next.next;
			copy.next = current.next;
			current.next = front;
			copy = copy.next;
			current = current.next;
		}

		return dummy.next;
	}
}
