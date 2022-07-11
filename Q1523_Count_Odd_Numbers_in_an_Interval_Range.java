package com.home.leetcode.easy;

/*
 * Problem Link : leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 * Solution Link : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/discuss/2266483/Java-Solution-oror-easy-to-understand-oror-without-using-loop
 */

public class Q1523_Count_Odd_Numbers_in_an_Interval_Range 
{
	/*
	 * Time Complexity : O(1)
	 * Space Complexity : O(1)
	 */

	public int countOdds(int low, int high) 
	{
		if(low%2 == 0 && high % 2 == 0)
			return (high-low)/2;
		else
			return (high-low)/2 + 1;
	}
}
