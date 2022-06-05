package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/shuffle-string/
 * Solution Link : https://leetcode.com/problems/shuffle-string/discuss/755914/Java-Simple-Easy-to-Understand-Do-as-Question-says-O(n)
 */

public class Q1528_Shuffle_String 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public String restoreString(String s, int[] indices)
	{
		int length = s.length();
		char ch[] = new char[length];

		for(int i=0 ; i<length ; i++)
			ch[indices[i]] = s.charAt(i);

		s = new String(ch);
		return s;
	}
}
