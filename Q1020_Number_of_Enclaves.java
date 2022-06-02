package com.home.leetcode.medium;

/*
 *  Program Link : https://leetcode.com/problems/number-of-enclaves/
 *  Solution Link : https://www.youtube.com/watch?v=TXyKxUmj5XU
 */

public class Q1020_Number_of_Enclaves 
{
	public int numEnclaves(int[][] grid)
	{
		/*
		 *  Time Complexity : O(m*n)
		 *  Space Complexity : O(1)
		 */

		/*
		 * Sea Cell : 0
		 * Land Cell : 1
		 */

		int count = 0;
		int row = grid.length;
		if(row == 0)
			return 0;

		int column = grid[0].length;

		for(int i=0 ; i<row ; i++)
		{
			for(int  j=0 ; j<column ; j++)
			{
				/*
				 *  We will be iterating over the boundary of grid in order to find the land cell (1),
				 *  and make the connected land cell to 0 (4-directionally).
				 */

				if((i==0 || j==0 || i==row-1 || j==column-1) && (grid[i][j] == 1))
				{
					dfs(grid, i, j, row, column);
				}		
			}
		}

		/*
		 *  All the left over 1's will be the land cell which are not connected to any of the boundary (4-directionally),
		 *  we will count those land cells (1's) in the grid.
		 */

		for(int i=0 ; i<row ; i++)
			for(int j=0 ; j<column ; j++)
				if(grid[i][j] == 1)
					count++;

		return count;
	}

	public void dfs(int grid[][],int i,int j,int row,int column)
	{

		/* 
		 * Checking the boundary cases, and 
		 * if the element value is 0 (Sea cells), 
		 * then we will simply return
		 * else will process the node and its adjacents
		 */

		if(i<0 || i>= row || j<0 || j>= column || grid[i][j] == 0)
			return;

		// Mark the visited node to the zero, by assigning coordinates(i,j) to zero

		grid[i][j] = 0;


		// Top Move
		dfs(grid, i-1, j, row, column);


		// Right  Move
		dfs(grid, i, j+1, row, column);


		// Down Move
		dfs(grid, i+1, j, row, column);


		// Left Move
		dfs(grid, i, j-1, row, column);
	}
}
