package com.home.leetcode.medium;

import java.util.*;

/*
 * Problem Link : https://leetcode.com/problems/word-break/
 * Solution Link : https://leetcode.com/problems/word-break/discuss/43790/Java-implementation-using-DP-in-two-ways
 */

public class Q139_Word_Break 
{
	/*
	 * Time Complexity : O(N^2)
	 * Space Complexity : O(N)
	 */

	public boolean wordBreak(String s, List<String> wordDict)
	{
		boolean flag[] = new boolean[s.length()+1];
		flag[0] = true;

		int length = s.length();
		for(int i=1 ; i<=length ; i++)
		{
			for(int j=0 ; j<i ; j++)
				if(flag[j] && wordDict.contains(s.substring(j,i)))
				{
					flag[i] = true;
					break;
				}
		}
		return flag[length];
	}
}