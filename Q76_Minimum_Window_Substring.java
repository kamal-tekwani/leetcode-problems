package com.home.leetcode.hard;

import java.util.HashMap;

/*
 * Problem Link : https://leetcode.com/problems/minimum-window-substring/
 * Solution Link : https://leetcode.com/problems/minimum-window-substring/discuss/26810/Java-solution.-using-two-pointers-%2B-HashMap
 */

public class Q76_Minimum_Window_Substring 
{
	/*
	 * Time Complexity : O(M+N)
	 * Space Complexity : O(N)
	 */

	public String minWindow(String s, String t)
	{
		if(s==null || s.length()<t.length() || s.length() == 0)
			return "";

		int left = 0;
		int minLeft = 0;
		int minLength = s.length()+1;
		int count = 0;

		HashMap<Character, Integer> hmpMap = new HashMap<Character, Integer>();

		for(char c : t.toCharArray())
			if(hmpMap.containsKey(c))
				hmpMap.put(c, hmpMap.get(c)+1);
			else
				hmpMap.put(c, 1);

		for(int right=0 ; right<s.length() ; right++)
		{
			if(hmpMap.containsKey(s.charAt(right)))
			{
				hmpMap.put(s.charAt(right), hmpMap.get(s.charAt(right))-1);
				if(hmpMap.get(s.charAt(right)) >= 0)
					count++;

				while(count == t.length())
				{
					if(right-left+1 < minLength)
					{
						minLeft = left;
						minLength = right-left+1;
					}

					if(hmpMap.containsKey(s.charAt(left)))
					{
						hmpMap.put(s.charAt(left), hmpMap.get(s.charAt(left))+1);
						if(hmpMap.get(s.charAt(left)) > 0)
							count--;
					}
					left++;
				}	
			}
		}

		if(minLength > s.length())
			return "";

		return s.substring(minLeft,minLeft+minLength);
	}

}
