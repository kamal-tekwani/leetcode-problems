package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/container-with-most-water/
 * Solution Link : https://leetcode.com/problems/container-with-most-water/discuss/6100/Simple-and-clear-proofexplanation
 */

public class Q11_Container_With_Most_Water
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */
	
	public int maxArea(int[] height) 
	{
		int left = 0;
		int right = height.length-1;
		
		int result = 0;
		
		while(left < right)
		{
			result = Math.max(Math.min(height[left], height[right]) * (right-left), result);
			
			if(height[left] < height[right])
				left++;
			else
				right--;
		}
		return result;
	}

}
