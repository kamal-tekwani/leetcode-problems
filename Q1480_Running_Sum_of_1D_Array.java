package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/running-sum-of-1d-array/
 * Solution Link : https://leetcode.com/problems/running-sum-of-1d-array/discuss/688613/Java-clean-and-simple-solution
 */

public class Q1480_Running_Sum_of_1D_Array
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public static int[] runningSum(int[] nums) 
	{
		int length = nums.length;
		// modify the input array, adding n[i] with n[i-1]
		for(int i=1; i<length ; i++)
			nums[i] += nums[i-1];
		// return the modified array
		return nums;
	}

	public static void main(String[] args)
	{
		int nums[] = {1,2,3,4};
		int result[] = runningSum(nums);
		for(int i :  result)
			System.out.print(" "+i+" ");
	}
}
