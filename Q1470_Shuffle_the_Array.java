package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/shuffle-the-array/
 * Solution Link : https://leetcode.com/problems/shuffle-the-array/discuss/1314638/JAVA-C%2B%2B-%3A-Simple-or-O(1)-Space-In-Place-or-100-Faster-or-Efficient-or-Explained
 */


public class Q1470_Shuffle_the_Array
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	/*
	public static int[] shuffle(int[] nums, int n)
	{
		int length = nums.length;
		int result[] = new int[length];
		int k = 0;

		for(int i=0 ; i<n ; i++)
		{
			result[k++] = nums[i]; 
			result[k++] = nums[i+n];
		}
		return result;     
	}
	 */

	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public static int[] shuffle(int[] nums, int n)
	{
		int length = nums.length;

		// to store the pair of numbers in right half of the original array

		for(int i=n ; i<length ;  i++)
			nums[i] = (nums[i] * 1024) + nums[i-n];

		/*
		 *  i=3, nums[3] = (3 * 1024) + 2;
		 *  i=4, nums[4] = (4 * 1024) + 5;
		 *  i=5, nums[5] = (7 * 1024) + 1;
		 */

		int index = 0;

		// to retrieve values from the pair of numbers and placing those retrieved value at their desired position

		for(int i = n; i < length; i++, index += 2) 
		{
			nums[index] = nums[i] % 1024;
			nums[index + 1] = nums[i] / 1024;
		}

		/*
		 *  i=3, nums[0] = [(3 * 1024) + 2] % 1024 = 2, nums[1] = [(3 * 1024) + 2] / 1024 = 3
		 *  i=4, nums[2] = [(4 * 1024) + 5] % 1024 = 5, nums[3] = [(4 * 1024) + 5] / 1024 = 4
		 *  i=5, nums[4] = [(7 * 1024) + 1] % 1024 = 1, nums[5] = [(7 * 1024) + 1] / 1024 = 7
		 */

		return nums;
	}



	public static void main(String[] args)
	{
		int nums[] = {2,5,1,3,4,7};
		int n = 3;
		int result[] = shuffle(nums, n);
		for(int i : result)
			System.out.print(" "+i+" ");
	}

}
