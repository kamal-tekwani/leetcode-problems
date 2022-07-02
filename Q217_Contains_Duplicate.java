package com.home.leetcode.easy;

import java.util.HashMap;

/*
 * Problem Link : https://leetcode.com/problems/contains-duplicate/
 * Solution Link : https://leetcode.com/problems/contains-duplicate/discuss/60858/Possible-solutions.
 */

public class Q217_Contains_Duplicate 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public boolean containsDuplicate(int[] nums) 
	{
		int length = nums.length;

		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		for(int i=0 ; i<length ; i++)
			if(hmp.containsKey(nums[i]))
				return true;
			else
				hmp.put(nums[i], 1);
		return false;
	}
}
