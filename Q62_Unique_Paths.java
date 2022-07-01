package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/unique-paths/
 * Solution Link : https://leetcode.com/problems/unique-paths/discuss/22954/C%2B%2B-DP
 */

public class Q62_Unique_Paths
{
	/*
	 * Time Complexity : O(M*N)
	 * Space Complexity : O(M*N)
	 */

	public int uniquePaths(int m,int n)
	{
		int result[][] = new int[m][n];

		for(int i=0 ; i<m ; i++)
			result[i][0] = 1;

		for(int i=0 ; i<n ; i++)
			result[0][i] = 1;

		for(int i=1 ; i<m ; i++)
			for(int j=1 ; j<n ; j++)
				result[i][j] = result[i-1][j] + result[i][j-1];

		return result[m-1][n-1];
	}
}
