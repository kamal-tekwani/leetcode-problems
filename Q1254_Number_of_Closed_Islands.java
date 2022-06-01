package com.home.leetcode.medium;

/*
 * 	Problem Link : https://leetcode.com/problems/number-of-closed-islands/
 * 	Solution Link : https://www.youtube.com/watch?v=MnD8KhBHgRo
 */


public class Q1254_Number_of_Closed_Islands
{
	/*
	 *  Land - 0
	 *  Water - 1
	 *  Visited - 2
	 */

	/*
	 *  Time Complexity : O(m*n)
	 *  Space Complexity : O(1)
	 */

	public int closedIsland(int[][] grid)
	{
		int count = 0;
		int row = grid.length;

		/*
		 * If row count is zero, 
		 * then the grid is empty so we will return number of islands as zero.
		 */

		if(row == 0)
			return count;

		int column = grid[0].length;

		/*
		 *  We will be checking for land from the next row and column, 
		 *  i.e land on perimeter cannot form closed island,
		 *  else just access the adjacents nodes.
		 */

		for(int i=1 ; i<row ; i++)
		{
			for(int j=1 ; j<column ; j++)
			{
				if(grid[i][j] == 0 && dfs(grid, i, j, row, column))
					count++;
			}
		}
		return count;
	}

	public boolean dfs(int grid[][],int i,int j,int row,int column)
	{
		/*
		 *  If the node is visited(2) or water(1),  
		 *  then will simply  return true because it forms a closed island.
		 */
		if(grid[i][j] == 2 || grid[i][j] == 1)
			return true;

		/*
		 * If the land(1) node is on perimeter,
		 * then it cannot form a closed island.
		 */

		if(onPerimeter(i, j, row, column))
			return false;

		// Mark the Node as Visited by assigning value 2
		grid[i][j] = 2;

		//Top Move
		boolean top = dfs(grid, i-1, j, row, column);

		// Right Move
		boolean right = dfs(grid, i, j+1, row, column);

		// Down Move
		boolean down = dfs(grid, i+1, j, row, column);

		// Left Move
		boolean left = dfs(grid, i, j-1, row, column);


		/* 
		 * All the adjacents nodes should be surrounded
		 * by water in order to form a closed island.
		 */
		return top && right && down && left;
	}

	public boolean onPerimeter(int i,int j,int row,int column)
	{
		// Checking the if the coordinates(i,j) of land (0) lie on the perimeter 
		return (i==0 || i==row-1 || j==0 || j==column-1);
	}
}
