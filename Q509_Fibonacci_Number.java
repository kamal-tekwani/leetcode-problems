package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/fibonacci-number/
 * Solution Link : https://leetcode.com/problems/fibonacci-number/discuss/215992/Java-Solutions
 */

public class Q509_Fibonacci_Number
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */
	
	public int fib(int n) 
	{
		int a = 0;
		int b = 1;
		
		if(n<=1)
			return n;
		
		for(int i=2 ; i<=n ; i++)
		{
			int temp = a+b;
			a = b;
			b = temp;
		}
		return b;
	}
}