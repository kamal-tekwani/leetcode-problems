package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/isomorphic-strings/
 * Solution Link : https://leetcode.com/problems/isomorphic-strings/discuss/57796/My-6-lines-solution
 */

public class Q205_Isomorphic_Strings 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public boolean isIsomorphic(String s, String t) 
	{
		int length = s.length();

		int m1[] = new int[256];
		int m2[] = new int[256];

		for(int i=0 ; i<length ; i++)
		{
			if(m1[s.charAt(i)] != m2[s.charAt(i)])
				return false;
			m1[s.charAt(i)] = i+1;
			m2[s.charAt(i)] = i+1;
		}
		return true;
	}
}
