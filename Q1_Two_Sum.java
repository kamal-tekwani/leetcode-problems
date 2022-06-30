package com.home.leetcode.easy;

import java.util.HashMap;

/*
 * Problem Link : https://leetcode.com/problems/two-sum/
 * Solution Link : https://leetcode.com/problems/two-sum/discuss/3/Accepted-Java-O(n)-Solution
 */

public class Q1_Two_Sum 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */
	
	public int[] twoSum(int[] nums, int target)
	{
		HashMap<Integer, Integer> hmpMap = new HashMap<Integer, Integer>();

		int length = nums.length;
		for(int i=0 ; i<length ;  i++)
		{
			int remainder = target - nums[i];
			if(hmpMap.containsKey(remainder))
				return new int[] {hmpMap.get(remainder), i};
			else
				hmpMap.put(nums[i], i);
		}
		return new int[] {-1,-1};
	}
}
