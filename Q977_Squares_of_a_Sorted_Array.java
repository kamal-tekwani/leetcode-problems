package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/
 * Solution Link : https://leetcode.com/problems/squares-of-a-sorted-array/discuss/221922/Java-two-pointers-O(N)
 */

public class Q977_Squares_of_a_Sorted_Array
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public int[] sortedSquares(int[] nums) 
	{
		int length = nums.length;

		int result[] = new int[length];

		int i = 0;
		int j = length-1;
		int k = length-1;

		while(i<j)
		{
			if(nums[i] * nums[i] < nums[j] * nums[j])
			{
				result[k--] = nums[j]*nums[j];
				j--;
			}
			else 
			{
				result[k--] = nums[i]*nums[i];
				i++;
			}
		}

		return result;

	}

}
