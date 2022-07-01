package com.home.leetcode.easy;

/*
 * Problem Link :https://leetcode.com/problems/palindrome-number/
 * Solution Link : 
 */

public class Q9_Palindrome_Number 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */


	public boolean isPalindrome(int x) 
	{
		if(x<0)
			return false;

		int result = 0;
		int original = x;

		while(x != 0)
		{
			int remainder = x %  10;
			result = result * 10 + remainder;
			x = x / 10;
		}

		return original == result;
	}
}
