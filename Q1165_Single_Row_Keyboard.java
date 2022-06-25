package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/single-row-keyboard/
 * Solution Link : https://leetcode.com/problems/single-row-keyboard/discuss/571602/Java-Easy-to-understand
 */


public class Q1165_Single_Row_Keyboard 
{
	/*
	 * Time Complexity : O(w * k)
	 * Space Complexity : O(1) 
	 */

	public static int calculateTime(String keyboard, String word)
	{
		int time = 0;
		int previous = 0;
		int distance = 0;
		for(char c : word.toCharArray())
		{
			distance = Math.abs(keyboard.indexOf(c) - previous);
			time += distance;
			previous = keyboard.indexOf(c);
		}
		return time;	
	}
}



