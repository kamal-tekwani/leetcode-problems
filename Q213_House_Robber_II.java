package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/house-robber-ii/
 * Solution Link : https://www.youtube.com/watch?v=mFT2bIFKUFE
 */
public class Q213_House_Robber_II 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int rob(int[] nums) 
	{
		int length = nums.length;
		if(length == 1)
			return nums[0];
		return Math.max(rob_util(nums, 0, length-2), rob_util(nums, 1, length-1));
	}

	public int rob_util(int nums[],int left,int right)
	{
		int previousOne = 0;
		int previousTwo = 0;
		int max = 0;

		for(int i=left ; i<=right ; i++)
		{
			max = Math.max(previousTwo+nums[i], previousOne);
			previousTwo = previousOne;
			previousOne = max;
		}
		return max;
	}
}
