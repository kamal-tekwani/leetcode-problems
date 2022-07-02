package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/binary-search/
 * Solution Link : https://leetcode.com/problems/binary-search/discuss/423162/Binary-Search-101
 */

public class Q704_Binary_Search
{
	/*
	 * Time Complexity  : O(log N)
	 * Space Complexity : O(1)
	 */
	
	public int search(int[] nums, int target)
	{
		int left = 0;
		int right = nums.length-1;
		
		while(left < right)
		{
			int mid = left + (right - left) / 2;
			
			if(nums[mid] == target)
				return mid;
			else if(nums[mid] > target)
				right = mid-1;
			else 
				left = mid+1;
		}
		return -1;
	}
}
