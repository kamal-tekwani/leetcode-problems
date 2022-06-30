package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/maximum-subarray/
 * Solution Link : (1) https://www.youtube.com/watch?v=w_KEocd__20 
 *                 (2) https://leetcode.com/problems/maximum-subarray/discuss/1595097/JAVA-or-Kadane's-Algorithm-or-Explanation-Using-Image
 */

public class Q53_Maximum_Subarray 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int maxSubArray(int[] nums) 
	{
		int sum = 0;
		int max = 0;

		for(int i : nums)
		{
			sum += i;
			if(sum < 0)
				sum = 0;
			max = Math.max(sum, max);
		}
		return max;
	}
}
