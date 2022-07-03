package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/jump-game/
 * Solution Link : https://leetcode.com/problems/jump-game/discuss/20923/Java-Solution-easy-to-understand
 */

public class Q55_Jump_Game
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public boolean canJump(int[] nums) 
	{
		int max = 0;

		int length = nums.length;

		for(int i=0 ; i<length ; i++)
		{
			if(i > max)
				return false;
			max = Math.max(max, nums[i] + i);
		}
		return true;
	}
}
