package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/zigzag-conversion/discuss/
 * Solution Link : https://leetcode.com/problems/zigzag-conversion/discuss/3403/Easy-to-understand-Java-solution
 */

public class Q6_Zigzag_Conversion 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(numRows)
	 */

	public String convert(String s, int numRows) 
	{
		StringBuilder sb[] = new StringBuilder[numRows];
		for(int i=0 ; i<numRows ; i++)
			sb[i] = new StringBuilder();

		int i=0;
		int length = s.length();

		while(i<length)
		{
			for(int index=0 ; index<numRows && i<length ; index++)
				sb[index].append(s.charAt(i++));
			for(int index=numRows-2 ; index>=1 && i<length ; index--)
				sb[index].append(s.charAt(i++));
		}

		for(i=1 ; i<sb.length ; i++)
			sb[0].append(sb[i]);

		return sb.toString();
	}
}
