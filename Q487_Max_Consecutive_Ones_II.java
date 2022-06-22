package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/max-consecutive-ones-ii/
 * Solution Link : (1) https://leetcode.com/problems/max-consecutive-ones-iii/discuss/247543/O(n)-Java-Solution-using-sliding-window
 * 				   (2) https://www.youtube.com/watch?v=Gl-8HLvV8bc
 */

public class Q487_Max_Consecutive_Ones_II 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */
	public static int longestOnes(int[] nums) 
	{
		int start = 0;
		int end = 0;
		int length = nums.length;
		int flipCount = 0;
		int subArrayLength = 0;

		System.out.println("I");

		for(end = 0 ; end < length ; end++)
		{
			if(nums[end] == 0)
				flipCount++;

			while(flipCount > 1)
			{
				if(nums[start] == 0)
					flipCount--;
				start++;
			}

			subArrayLength = Math.max(subArrayLength, end-start+1);
		}
		return subArrayLength;
	}
}
