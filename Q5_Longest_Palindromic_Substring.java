package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/longest-palindromic-substring/
 * Solution Link : https://www.youtube.com/watch?v=UflHuQj6MVA
 */

public class Q5_Longest_Palindromic_Substring
{
	/*
	 * Time Complexity : O(N^2)
	 * Space Complexity : O(N^2)
	 */

	public String longestPalindrome(String s)
	{
		int length = s.length();

		int dp[][] = new int[length][length];

		int maxLength = 1;
		for(int i=0 ; i<length ; i++)
			dp[i][i] = 1;

		int start = 0;
		for(int i=0 ; i<length-1 ; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				dp[i][i+1] = 1;
				start = i;
				maxLength = 2;
			}
		}

		for(int k=3 ; k<=length ; k++)
		{
			for(int i=0 ; i<length-k+1 ; i++)
			{
				int j = i+k-1;
				if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1)
				{
					dp[i][j]= 1;
					if(k>maxLength)
					{
						start = i;
						maxLength = k;
					}
				}
			}
		}

		return s.substring(start,start+maxLength);
	}
}
