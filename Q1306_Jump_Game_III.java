package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/jump-game-iii/
 * Solution Link : (1) https://leetcode.com/problems/jump-game-iii/discuss/1619031/C%2B%2BPython-Simple-Solution-w-Explanation-or-DFS-and-BFS-Traversals
 */

public class Q1306_Jump_Game_III 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public boolean canReach(int[] arr, int start)
	{
		if(start<0 || start>=arr.length || arr[start]<0)
			return false;

		if(arr[start] == 0)
			return true;

		arr[start] = -arr[start];

		return canReach(arr, start+arr[start]) || canReach(arr, start-arr[start]);
	}
}
