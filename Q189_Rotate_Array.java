package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/rotate-array/
 * Solution Link : https://leetcode.com/problems/rotate-array/discuss/54250/Easy-to-read-Java-solution 
 */

public class Q189_Rotate_Array
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public void rotate(int[] nums, int k) 
	{
		int length = nums.length;

		k = k % length;

		reverse(nums, 0, length-1);
		reverse(nums,0, k-1);
		reverse(nums, k, length-1);
	}

	public void reverse(int nums[],int low,int high)
	{
		while(low<high)
		{
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}
}
