package com.home.leetcode.medium;

import java.util.HashMap;

/*
 * Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Solution Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1729/11-line-simple-Java-solution-O(n)-with-explanation
 */

public class Q3_Longest_Substring_Without_Repeating_Characters
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public int lengthOfLongestSubstring(String s) 
	{
		if(s == null || s.isEmpty() || s == "")
			return 0;

		int i=0;
		int j=0;
		int count = 0;
		int length = s.length();
		HashMap<Character, Integer> hmpMap = new HashMap<Character, Integer>();

		for(j=0 ; j<length ; j++)
		{
			if(hmpMap.containsKey(s.charAt(j)))
				i = Math.max(i, hmpMap.get(s.charAt(j))+1);
			hmpMap.put(s.charAt(j), j);
			count = Math.max(count, j-i+1);
		}
		return count;
	}
}
