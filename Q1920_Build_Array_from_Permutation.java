package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/build-array-from-permutation/
 * Solution Link : https://leetcode.com/problems/build-array-from-permutation/discuss/1316500/Java-solution-using-O(1)-space-with-explanation
 */

public class Q1920_Build_Array_from_Permutation 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	/*
	public static int[] buildArray(int[] nums)
	{
		int length = nums.length;
		int result[] = new int[length];
		for(int i=0 ; i<length ; i++)
			result[i] = nums[nums[i]];
		return result;    
	}
	 */

	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */
	public static int[] buildArray(int nums[])
	{
		int length = nums.length;

		for(int i=0 ; i<length ; i++)
			/*
			 * this is done to keep both old and new value together. 
			 * going by the example of [5,0,1,2,3,4]
			 * after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
			 * now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
			 * if we want to get just he new value of num[0], we can get it by num[0]/6 = 29/6 = 4
			 */
			nums[i] = nums[i] + length * (nums[nums[i]] % length);

		for(int i=0 ; i<length ; i++)
			nums[i] = nums[i]/length;

		return nums;
	}

	public static void main(String[] args)
	{
		int nums[] = {5,0,1,2,3,4};
		int result[] = buildArray(nums);
		for(int i : result)
			System.out.print(" "+i+" ");
	}

}
