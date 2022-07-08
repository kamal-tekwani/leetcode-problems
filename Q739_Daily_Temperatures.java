package com.home.leetcode.medium;

import java.util.Stack;

/*
 * Problem Link : https://leetcode.com/problems/daily-temperatures/
 * Solution Link : https://www.youtube.com/watch?v=ekFs9Nb2RNQ
 */

public class Q739_Daily_Temperatures 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public int[] dailyTemperatures(int[] temperatures) 
	{
		Stack<Integer> stack = new Stack<Integer>();

		int length = temperatures.length-1;
		int result[] = new int[length+1];

		while(length >= 0)
		{
			/*
			 * Popping all the indexes with a lower or equal temperature than
			 * the current index
			 */
			while(!stack.isEmpty() && temperatures[length] >= temperatures[stack.peek()])
				stack.pop();

			/*
			 * If the stack still has elements, 
			 * then the next warmer temperature exists.
			 */
			if(!stack.isEmpty())
				result[length] = stack.peek()-length;

			// Inserting current index in the stack.
			stack.push(length);

			length--;
		}
		return result;
	}
}
