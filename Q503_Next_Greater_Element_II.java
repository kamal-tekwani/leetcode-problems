package com.home.leetcode.medium;

import java.util.Stack;

/*
 * Problem Link :  https://leetcode.com/problems/next-greater-element-ii/
 * Solution Link : https://leetcode.com/problems/next-greater-element-ii/discuss/98273/Java-10-lines-and-C%2B%2B-12-lines-linear-time-complexity-O(n)-with-explanation
 */

public class Q503_Next_Greater_Element_II
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public int[] nextGreaterElements(int[] nums) 
	{
		int length = nums.length;

		int result[] = new int[length];

		Stack<Integer> stack = new Stack<Integer>();

		for(int i=0 ; i<2*length ; i++)
		{
			int num  = nums[i%length];

			while(!stack.isEmpty() && nums[stack.peek()] < num)
				result[stack.pop()] = num;
			if(i<length)
				stack.push(i);
		}
		return result;
	}

}
