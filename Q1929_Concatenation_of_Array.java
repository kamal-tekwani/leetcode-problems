package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/concatenation-of-array/
 * Solution Link : https://leetcode.com/problems/concatenation-of-array/discuss/1330265/Java-4-lines
 */

public class Q1929_Concatenation_of_Array
{
	/*
	 * Time Complexity : O(N) 
	 * Space Complexity : O(2*N)
	 */

	public static int[] getConcatenation(int[] nums)
	{
		int length = nums.length;

		int result[] = new int[length*2];

		for(int i=0 ; i<length ; i++)
			result[i] = result[i+length] = nums[i];

		/*
		 * i=0, r[0] = r[3] = 1
		 * i=1, r[1] = r[4] = 2
		 * i=2, r[2] = r[5] = 1
		 */

		return result;
	}

	public static void main(String[] args)
	{
		int nums[]  = {1,2,1};
		int result[] = getConcatenation(nums);
		for(int i : result)
			System.out.print(" "+i+" ");
	}
}
