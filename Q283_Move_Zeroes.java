package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/move-zeroes/
 * Solution Link : https://leetcode.com/problems/move-zeroes/discuss/172432/THE-EASIEST-but-UNUSUAL-snowball-JAVA-solution-BEATS-100-(O(n))-%2B-clear-explanation
 */

public class Q283_Move_Zeroes 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public void moveZeroes(int[] nums) 
	{
		int snowBall = 0;
		int length = nums.length;

		for(int i=0 ; i<length ; i++)
		{
			if(nums[i] == 0)
				snowBall++;
			else if(snowBall > 0)
			{
				int temp = nums[i];
				nums[i] = 0;
				nums[i-snowBall] = temp;
			}
		}
	}
}
