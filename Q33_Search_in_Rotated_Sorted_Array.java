package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Solution Link : https://www.youtube.com/watch?v=r3pMQ8-Ad5s
 */

public class Q33_Search_in_Rotated_Sorted_Array 
{
	/*
	 * Time Complexity : O(log N)
	 * Space Complexity : O(1)
	 */

	public int search(int[] nums, int target)
	{
		int low = 0;
		int high = nums.length-1;

		while(low <= high)
		{
			int mid = low + (high-low)/2;

			if(nums[mid] == target)
				return mid;

			if(nums[low] <= nums[mid])
			{
				if(target >= nums[low] && target < nums[mid])
					high = mid-1;
				else
					low = mid+1;
			}
			else
			{
				if(target > nums[mid] && target <= nums[high])
					low = mid+1;
				else
					high = mid-1;
			}
		}
		return -1;
	}
}
