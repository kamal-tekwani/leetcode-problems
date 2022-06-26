package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/house-robber/
 * Solution Link : (1) https://leetcode.com/problems/house-robber/discuss/55761/Java-0ms-solution-using-Dynamic-Programming
 *                 (2) https://leetcode.com/problems/house-robber-ii/
 */

public class Q198_House_Robber
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	/*
	public int rob(int[] nums) 
	{
		int length = nums.length;
		
		if(length == 0)
			return 0;
		
		// Initialize an arrays to store the money
		int amount[] = new int[length];
		
		
		// We can infer the formula from problem:mark[i]=max(num[i]+mark[i-2],mark[i-1]), so initialize two nums at first.
		 
		amount[0] = nums[0];
		if(length == 1)
			return amount[0];
		
		amount[1] = Math.max(nums[0], nums[1]);
		
		// Using Dynamic Programming to mark the max money in loop.
		for(int i=2 ; i<length ; i++)
			amount[i] = Math.max(amount[i-2] + nums[i], amount[i-1]);
		
		return amount[length-1];
	}
	*/
	
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */
	
	public int rob(int nums[])
	{
		int previousOne = 0;
		int previousTwo = 0;
		int max = 0;
		int length = nums.length;
		
		for(int i=0 ; i<length ; i++)
		{
			max = Math.max(previousTwo+nums[i], previousOne);
			previousTwo = previousOne;
			previousOne  = max;
		}
		return max;
	}
}
