package com.home.leetcode.easy;

public class Q724_Find_Pivot_Index
{
	public int pivotIndex(int[] nums) 
	{
		int total = 0;
		int sum = 0;
		
		int length = nums.length;
		
		for(int i : nums)
			total += i;
		
		/*
		 * sum will be carrying the summation of left array and (total - nums[i]) will carry the summation of right index.
		 */
		
		for(int i=0 ; i<length ; i++)
		{
			if(sum * 2 == total - nums[i])
				return i;
			sum += nums[i];
		}
		return -1;
	}
}
