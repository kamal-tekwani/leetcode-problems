package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * Solution Link : https://leetcode.com/problems/search-in-rotated-sorted-array-ii/discuss/1890199/C%2B%2B-oror-Algorithm-oror-Binary-Search
 */

public class Q81_Search_in_Rotated_Sorted_Array_II 
{
	/*
	 * Time Complexity : O(log N)
	 * Space Complexity : O(1)
	 */

	public boolean search(int[] nums, int target) 
	{
		int low = 0;
		int high = nums.length-1;

		while(low <= high)
		{
			int mid = low + (high-low)/2;

			if(nums[mid] == target)
				return true;

			if((nums[low] == nums[mid]) && (nums[high]== nums[mid]))
			{
				low++;
				high--;
			}
			else if(nums[low] <= nums[mid])
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
		return false;
	}
}
