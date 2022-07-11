package com.home.leetcode.easy;

/*
 * Problem Link : leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * Solution Link : leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/discuss/2267366/Faster-that-100-Java-Solution-oror-Very-Easy-Question-oror-Don't-Waste-time
 */

public class Q1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public int subtractProductAndSum(int n) 
	{
		int sum = 0;
		int product = 1;

		while(n != 0)
		{
			int remainder = n % 10;
			product *= remainder;
			sum += remainder;
			n /= 10;
		}
		return product - sum;
	}
}
