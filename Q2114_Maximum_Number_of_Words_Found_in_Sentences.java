package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 * Solution Link : https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/discuss/1662598/2ms-99-or-Easy-Explanation-or-Java
 */

public class Q2114_Maximum_Number_of_Words_Found_in_Sentences 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int mostWordsFound(String[] sentences) 
	{
		int max = 0;
		for(String sentence : sentences)
			max =  Math.max(max, sentence.split(" ").length);
		return max;
	}
}
