package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/is-subsequence/
 * Solution Link : https://leetcode.com/problems/is-subsequence/discuss/1811180/C%2B%2B-oror-Easy-oror-3-Approaches-oror-Brute-Force-oror-Recursive-oror-Memoization
 */

public class Q392_Is_Subsequence
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1) 
	 */

	public boolean isSubsequence(String s, String t)
	{
		int index = 0;
		int sLength = s.length();
		int tLength = t.length();

		for(int j=0 ; j<tLength && index<sLength ; j++)
			if(t.charAt(j) == s.charAt(index))
				index++;
		return index == sLength;
	}
}
