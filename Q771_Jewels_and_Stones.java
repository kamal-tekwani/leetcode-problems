package com.home.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem Link : https://leetcode.com/problems/jewels-and-stones/
 * Solution Link : https://leetcode.com/problems/jewels-and-stones/discuss/113553/C%2B%2BJavaPython-Set-Solution-O(J-%2B-S)
 */

public class Q771_Jewels_and_Stones
{
	/*
	 * Time Complexity : O(J+S)
	 * Space Complexity : O(J)
	 */

	public int numJewelsInStones(String jewels, String stones)
	{
		int count = 0;
		Set<Character> set = new HashSet<Character>();

		for(char c : jewels.toCharArray())
			set.add(c);

		for(char c : stones.toCharArray())
			if(set.contains(c))
				count++;
		return count;
	}
}
