package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/guess-number-higher-or-lower/
 * Solution Link : https://leetcode.com/problems/guess-number-higher-or-lower/discuss/84664/0ms-c%2B%2B-binary-search
 */

public class Q374_Guess_Number_Higher_or_Lower 
{

	// Provided by the System API
	public int guess(int item)
	{
		/** 
		 * Forward declaration of guess API.
		 * @param  num   your guess
		 * @return 	     -1 if num is higher than the picked number
		 *			      1 if num is lower than the picked number
		 *               otherwise return 0
		 * int guess(int num);
		 */

		return -1;
	}

	/*
	 * Time Complexity : O(log N)
	 * Space Complexity : O(1)
	 */

	public int guessNumber(int n) 
	{
		int left = 1;
		int right = n;

		while(left <= right)
		{
			int mid = left + (right-left)/2;

			int result = guess(mid);

			if(result == 0)
				return mid;
			else if(result == -1)
				right = mid-1;
			else 
				left = mid+1;
		}
		return -1;
	}
}
