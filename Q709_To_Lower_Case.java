package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/to-lower-case/
 * Solution Link  :  https://leetcode.com/problems/to-lower-case/discuss/152248/Easy-C%2B%2B-Solution
 */
public class Q709_To_Lower_Case
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */
	public String toLowerCase(String s) 
	{
		int length = s.length();
		char result[] = s.toCharArray();

		for(int i=0 ; i<length ; i++)
			if(result[i] >= 'A' && result[i] <= 'Z')
				result[i] = (char) (result[i] + 32);

		s = new String(result);
		return s;
	}
}
