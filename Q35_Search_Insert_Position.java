package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/search-insert-position/
 * Solution Link : https://leetcode.com/problems/search-insert-position/discuss/15101/C%2B%2B-O(logn)-Binary-Search-that-handles-duplicate
 */

public class Q35_Search_Insert_Position 
{
	/*
	 * Time Complexity : O(log N)
	 * Space Complexity : O(1)
	 */

	public int searchInsert(int[] nums, int target)
	{
		int left = 0;
		int right = nums.length-1;

		while(left <= right)
		{
			int mid = left + (right-left)/2;

			if(nums[mid] == target)
				return mid;
			else if(nums[mid] > target)
				right  = mid-1;
			else
				left = mid+1;
		}
		return left;
	}
}
