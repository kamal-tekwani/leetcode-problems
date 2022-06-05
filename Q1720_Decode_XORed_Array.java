package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/decode-xored-array/
 * Solution Link : https://leetcode.com/problems/decode-xored-array/discuss/1009844/JavaC%2B%2BPython-Easy-and-Concise
 */

public class Q1720_Decode_XORed_Array 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public int[] decode(int[] encoded, int first) 
	{
		int length = encoded.length;
		int result[] = new int[length+1];

		for(int i=0 ; i<length ; ++i)
			result[i+1] = result[i] ^ encoded[i];
		return result;
	}
}
