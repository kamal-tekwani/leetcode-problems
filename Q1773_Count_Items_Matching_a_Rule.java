package com.home.leetcode.easy;

import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/count-items-matching-a-rule/
 * Solution Link : https://leetcode.com/problems/count-items-matching-a-rule/discuss/1093390/Java-easy-and-short-100-memory
 */

public class Q1773_Count_Items_Matching_a_Rule 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)  
	 */

	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
	{
		int count = 0;

		for(int i=0 ; i<items.size() ; i++)
		{
			if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
				count++;
			if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
				count++;
			if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
				count++;
		}
		return count;
	}
}
