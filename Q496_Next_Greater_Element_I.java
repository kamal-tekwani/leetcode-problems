package com.home.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

/*
 * Problem Link : https://leetcode.com/problems/next-greater-element-i/
 * Solution Link : https://leetcode.com/problems/next-greater-element-i/discuss/991295/Java-%3A-O(N)-Time-%2B-O(N)-Space-using-Monotonic-Stack-with-explanation
 */

public class Q496_Next_Greater_Element_I 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public int[] nextGreaterElement(int[] nums1, int[] nums2) 
	{
		int result[] = new int[nums1.length];

		HashMap<Integer, Integer> hmpMap = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();

		for(int num : nums2)
		{
			while(!stack.isEmpty() && num > stack.peek())
				hmpMap.put(stack.pop(), num);
			stack.push(num);
		}

		int index = 0;
		for(int num : nums1)
			result[index++] = hmpMap.getOrDefault(num, -1);
		return result;
	}

}
