package com.home.leetcode.medium;

/*
 * 	Problem Link : https://leetcode.com/problems/number-of-islands/
 * 	Solution Link : https://www.youtube.com/watch?v=__98uL6wst8
 */

public class Q200_Number_of_Islands 
{
	/*
	 * 	Water - '0'
	 * 	Land - '1'
	 *  Visited - '2'
	 */

	/*
	 *   Time Complexity : O(N)
	 * 	 Space Complexity : O(1)
	 */

	public int numIslands(char[][] grid)
	{
		int row = grid.length;
		/* If row count is zero, 
		 * then the grid is empty so we will return number of islands as zero.
		 */
		if(row == 0)
			return 0;
		int column = grid[0].length;
		int count=0;

		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
				/*
				 *  For every element in the grid, i.e grid[i][j], 
				 *  we will check if it is a land (value = 1), if yes, 
				 *  then call dfs method
				 */

				if(grid[i][j] == '1')
				{
					dfs(grid, i, j, row, column);
					count++;
				}
			}
		}
		return count;
	}

	public void dfs(char grid[][],int i, int j, int row, int column)
	{
		/* Checking the boundary cases, and 
		 * if the element value is 0 (Water) or 2 (Visited), 
		 * then we will simply return
		 * else will process the node and its adjacents
		 */
		if(i<0 || i>=row || j<0 || j>=column || grid[i][j] != '1')
			return;

		// We are marking the node as visited by setting the value 2
		grid[i][j] = '2';

		// Top Move
		dfs(grid, i-1, j, row, column);

		// Right Move
		dfs(grid, i, j+1, row, column);

		// Down Move
		dfs(grid, i+1, j, row, column);

		// Left Move
		dfs(grid, i, j-1, row, column);
	}

}
