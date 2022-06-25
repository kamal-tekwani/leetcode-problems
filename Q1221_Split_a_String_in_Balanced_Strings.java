package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * Solution Link : https://leetcode.com/problems/split-a-string-in-balanced-strings/discuss/403836/C%2B%2BJavaPython-Easy-Solution
 */

public class Q1221_Split_a_String_in_Balanced_Strings
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int balancedStringSplit(String s)
	{
		int result = 0;
		int count = 0;

		for(int i=0 ; i<s.length() ; i++)
		{
			count += s.charAt(i) == 'L' ? 1 : -1;
			if(count == 0)
				result++;
		}

		return result;
	}
}
