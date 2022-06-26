package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/sorting-the-sentence/
 * Solution Link : https://leetcode.com/problems/sorting-the-sentence/discuss/1213443/Java-Simple-Solution-or-Runtime%3A-0-ms-or-O(N)
 */

public class Q1859_Sorting_the_Sentence 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public String sortSentence(String s) 
	{
		String words[] = s.split(" ");
		String result[] = new String[words.length];
		StringBuilder sb = new StringBuilder();

		int i=0;
		for(String word : words)
		{
			i = Integer.parseInt(word.charAt(word.length()-1)+"");
			result[i-1] = word.substring(0,word.length()-1);
		}

		for(i=0 ; i<result.length-1 ; i++)
			sb.append(result[i]+" ");
		sb.append(result[i]);

		return sb.toString();
	}
}
