package com.home.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * Solution Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/discuss/608614/JavaPython-3-2-liners-O(n).
 */

public class Q1431_Kids_With_the_Greatest_Number_of_Candies 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
	{
		int max = 0;
		List<Boolean> list = new ArrayList<Boolean>();
		for(int i : candies)
			max = Math.max(i, max);

		for(int i : candies)
			list.add(i+extraCandies >= max);

		return list;
	}

}
