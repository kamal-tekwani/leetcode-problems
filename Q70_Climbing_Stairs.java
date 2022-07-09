package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/climbing-stairs/
 * Solution Link : https://leetcode.com/problems/climbing-stairs/
 */

public class Q70_Climbing_Stairs
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int climbStairs(int n) 
	{
		if(n<=2)
			return n;

		int a = 1;
		int b = 2;

		for(int i=3 ; i<=n ; i++)
		{
			int temp = a+b;
			a = b;
			b = temp;
		}
		return b;
	}

}
