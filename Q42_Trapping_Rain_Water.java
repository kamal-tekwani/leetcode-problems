package com.home.leetcode.hard;

/*
 * Problem Link : https://leetcode.com/problems/trapping-rain-water/
 * Solution Link : https://leetcode.com/problems/trapping-rain-water/discuss/153992/Java-O(n)-time-and-O(1)-space-(with-explanations).
 */

public class Q42_Trapping_Rain_Water 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int trap(int[] height)
	{
		int total = 0;
		int maxLeft = 0;
		int maxRight = 0;

		int left = 0;
		int right = height.length-1;

		while(left < right)
		{
			if(height[left] < height[right])
			{
				if(height[left] >= maxLeft)
					maxLeft = height[left];
				else
					total += maxLeft - height[left];
				left++;
			}
			else
			{
				if(height[right] >= maxRight)
					maxRight = height[right];
				else
					total += maxRight - height[right];
				right--;
			}
		}
		return total;
	}

}
