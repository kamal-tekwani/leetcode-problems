package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/max-consecutive-ones/
 * Solution Link : https://leetcode.com/problems/max-consecutive-ones/discuss/96693/Java-4-lines-concise-solution-with-explanation
 */

public class Q485_Max_Consecutive_Ones 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */
	
	public static int findMaxConsecutiveOnes(int[] nums) 
	{
		int count = 0;
		int maxCount = 0;
		for(int i : nums)
		{
			if(i == 0)
				count=0;
			else
			{
				count++;
				maxCount = Math.max(maxCount, count);
			}
		}
		return maxCount;
	}
	
	public static void main(String Args[])
	{
		int nums[] = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
		
	}
}
