package com.home.leetcode.easy;

import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/decompress-run-length-encoded-list/
 * Solution Link : https://leetcode.com/problems/decompress-run-length-encoded-list/discuss/521777/Java-100-time
 */

public class Q1313_Decompress_Run_Length_Encoded_List 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */
	
	/*
	public int[] decompressRLElist(int[] nums) 
	{
		int length = nums.length;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0 ; i<length ; i+=2)
		{
			int frequency = nums[i];
			int value = nums[i+1];
			while(frequency-- > 0)
				list.add(value);
		}
		
		int result[] = new int[list.size()];
		
		for(int i=0 ; i<list.size() ; i++)
			result[i] = list.get(i);
		return result;
	}
	*/
	
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */
	
	public int[] decompressRLElist(int[] nums) 
	{
		int length = nums.length;
		int arrSize = 0;
		for(int i=0 ; i<length ; i+=2)
			arrSize += nums[i];
		
		int result[] = new int[arrSize];
		int startIndex = 0;
		
		for(int  i=0 ; i<length ; i+=2)
		{
			Arrays.fill(result, startIndex, startIndex+nums[i], nums[i+1]);
			startIndex += nums[i];
		}
		return result;
	}
}
