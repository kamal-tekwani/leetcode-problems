package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * Solution Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/discuss/524996/JAVA-beats-100-O(n)
 */

public class Q1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number 
{
	/*
	 * Time Complexity : O(N^2)
	 * Space Complexity : O(N)
	 */

	/*
	public int[] smallerNumbersThanCurrent(int[] nums)
	{
		int length = nums.length;
		int result[] = new int[length];
		
		for(int i=0 ; i<length  ; i++)
		{
			int count = 0;
			for(int j=0 ; j<length ; j++)
				if(i != j && nums[j] < nums[i])
					count++;
			result[i] = count;
		}
		return result;
	}
	*/
	
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N) 
	 */
	public int[] smallerNumbersThanCurrent(int[] nums)
	{
		int length = nums.length;
		int count[] = new int[101];
		int result[] = new int[length];
		
		for(int i=0 ; i<length ; i++)
			count[nums[i]]++;
		
		for(int i=1 ; i<101 ; i++)
			count[i] += count[i-1];
		
		for(int i=0 ; i<length ; i++)
			if(nums[i] == 0)
				result[i]=0;
			else
				result[i] = count[nums[i]-1];
		return result;
	}
}
