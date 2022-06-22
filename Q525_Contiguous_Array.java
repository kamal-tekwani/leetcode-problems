package com.home.leetcode.medium;

import java.util.HashMap;

/*
 * Problem Link : https://leetcode.com/problems/contiguous-array/
 * Solution Link : (1) https://leetcode.com/problems/contiguous-array/discuss/1743637/C%2B%2B-with-Explanation-oror-Easy-to-Understand-oror-Unordered_Map 
 *                 (2) https://www.youtube.com/watch?v=9ZyLjjk536U
 * 
 */

public class Q525_Contiguous_Array
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity  : O(N)
	 */
	public int findMaxLength(int[] nums)
	{
		int subArray = 0;
		int sum = 0;
		int length= nums.length;
		HashMap<Integer, Integer> hmpMap = new HashMap<Integer, Integer>();

		for(int i=0 ; i<length ; i++)
		{
			sum += nums[i] == 0 ? -1 : 1;

			/*
			 * if sum is equal to zero, then from start of array the number of 0's and 1's are equal.
			 */
			if(sum == 0)
				subArray = Math.max(subArray, i+1);
			/*
			 * if sum already exist in the map, so we can get the subArray by current index - map index
			 */
			else if(hmpMap.get(sum) != null)
				subArray = Math.max(subArray, i-hmpMap.get(sum));
			// if sum is not present in the map, then put it in the map.
			else
				hmpMap.put(sum, i);
		}
		return subArray;
	}


	public static void main(String Args[])
	{
		HashMap<Integer, Integer> hmpMap = new HashMap<Integer, Integer>();
		hmpMap.put(1, 0);
		hmpMap.put(2, 0);
		System.out.println(hmpMap.get(3));
	}

}
