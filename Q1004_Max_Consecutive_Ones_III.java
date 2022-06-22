package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/max-consecutive-ones-iii/
 * Solution Link : (1) https://leetcode.com/problems/max-consecutive-ones-iii/discuss/247543/O(n)-Java-Solution-using-sliding-window
 * 				   (2) https://www.youtube.com/watch?v=Gl-8HLvV8bc
 */

public class Q1004_Max_Consecutive_Ones_III 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */
	public static int longestOnes(int[] nums, int k) 
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

			while(flipCount > k)
			{
				if(nums[start] == 0)
					flipCount--;
				start++;
			}

			subArrayLength = Math.max(subArrayLength, end-start+1);
		}
		return subArrayLength;
	}

	public static void main(String Args[])
	{
		int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println(longestOnes(nums, k));
	}

}
