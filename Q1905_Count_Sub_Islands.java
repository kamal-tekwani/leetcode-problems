package com.home.leetcode.medium;

/*
 *  Problem Link : https://leetcode.com/problems/count-sub-islands/
 *  Solution Link : https://leetcode.com/problems/count-sub-islands/discuss/1284319/JavaC%2B%2BPython-DFS-Solution
 */

public class Q1905_Count_Sub_Islands
{
	/*
	 *  Time Complexity : O(m*n)
	 *  Space Complexity : O(1)
	 * 
	 */
	
	/*
	 * Water Cell : 0
	 * Land Cell : 1
	 */

	public int countSubIslands(int[][] grid1, int[][] grid2)
	{
		// Counter variable for counting the number of subIslands.
		int count = 0;

		int row = grid2.length;
		
		/* If row count is zero, 
		 * then the grid is empty so we will return number of islands as zero.
		 */
		
		if(row == 0)
			return 0;
		
		int column = grid2[0].length;

		/*
		 *  Iterating all the cells in the grid2 and checking for the sub islands in grid1
		 */

		for(int i=0 ; i<row ; i++)
			for(int j=0 ; j<column ; j++)
				if(grid2[i][j] == 1)
					count += dfs(grid1, grid2, i, j, row, column);

		return count;
	}

	public int dfs(int grid1[][],int grid2[][],int i,int j,int row,int column)
	{
		int result = 1;

		/* 
		 * Checking the boundary cases, and 
		 * if the element value is 0 (Water cells) or 2 (Visited Cell), 
		 * then we will simply return 1
		 * else will process the node and its adjacents
		 */

		if(i<0 || i>=row || j<0 || j>=column || grid2[i][j] == 0 || grid2[i][j] == 2)
			return 1;

		// Mark  the node as visited by setting the value 2
		grid2[i][j] = 2;

		// Top Move
		result &= dfs(grid1, grid2, i-1, j, row, column);

		// Right Move
		result &= dfs(grid1, grid2, i, j+1, row, column);

		// Down Move
		result &= dfs(grid1, grid2, i+1, j, row, column);

		// Left Move
		result &= dfs(grid1, grid2, i, j-1, row, column);

		// Checking if it land (1) cell present at same location in grid1 
		return grid1[i][j] & result;
	}
}
