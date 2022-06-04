package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/richest-customer-wealth/
 * Solution Link : https://leetcode.com/problems/richest-customer-wealth/discuss/953267/Java-C%2B%2B-C-JavaScript-C-100-easy-to-understand
 */


public class Q1672_Richest_Customer_Wealth
{
	/*
	 * Time Complexity : O(M*N)
	 * Space Complexity : O(1)
	 */

	public int maximumWealth(int[][] accounts)
	{
		int row = accounts.length;
		int column = accounts[0].length;
		int max = 0;
		for(int i=0 ; i<row ; i++)
		{
			int sum = 0;
			for(int j=0 ; j<column ; j++)
				sum += accounts[i][j];
			max = Math.max(max, sum);
		}
		return max;
	}
}
