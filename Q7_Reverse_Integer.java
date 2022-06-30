package com.home.leetcode.medium;

/*
 * Problem link : https://leetcode.com/problems/reverse-integer/
 * Solution Link : https://leetcode.com/problems/reverse-integer/discuss/4060/My-accepted-15-lines-of-code-for-Java
 */

public class Q7_Reverse_Integer 
{
	public int reverse(int x)
	{
		int result = 0;

		while(x != 0)
		{
			int remainder = x % 10;
			int number = result * 10 + remainder;

			if((number - remainder) / 10 != result)
				return 0;

			result = number;
			x = x / 10;
		}

		return result;
	}
}
