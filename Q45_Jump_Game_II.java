package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/jump-game-ii/
 * Solution Link : https://leetcode.com/problems/jump-game-ii/discuss/18014/Concise-O(n)-one-loop-JAVA-solution-based-on-Greedy
 */

public class Q45_Jump_Game_II 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int jump(int[] nums)
	{
		int length = nums.length;

		int jumps = 0;
		int currentEnd = 0;
		int currentFarthest = 0;

		for(int i=0 ; i<length-1 ; i++)
		{
			currentFarthest = Math.max(currentFarthest, nums[i]+i);
			if(i == currentEnd)
			{
				jumps++;
				currentEnd = currentFarthest;
			}
		}
		return jumps;
	}
}
