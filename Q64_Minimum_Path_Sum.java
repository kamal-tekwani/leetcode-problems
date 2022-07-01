package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/minimum-path-sum/
 * Solution Link : https://leetcode.com/problems/minimum-path-sum/discuss/23647/My-8-lines-simple-solution
 */

public class Q64_Minimum_Path_Sum 
{
	/*
	 * Time Complexity : O(M * N)
	 * Space Complexity : O(1)
	 */

	public int minPathSum(int[][] grid) 
	{
		int row = grid.length;
		int column = grid[0].length;

		for(int i=0 ; i<row ; i++)
			for(int j=0 ; j<column ; j++)
				if(i == 0 && j == 0)
					grid[i][j] = grid[i][j];
				else if(i != 0 && j == 0)
					grid[i][j] = grid[i-1][j] + grid[i][j];
				else if(i == 0 && j != 0)
					grid[i][j] = grid[i][j-1] + grid[i][j];
				else
					grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];

		return grid[row-1][column-1];
	}
}
