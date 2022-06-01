package com.home.leetcode.medium;

/*
 * 	Problem Link : https://leetcode.com/problems/max-area-of-island/
 * 	Solution Link : https://www.youtube.com/watch?v=W8VuDt0eb5c
 */

public class Q695_Max_Area_of_Island
{
	/*
	 *  Land = 1
	 *  Water = 0
	 */
	
	/*
	 * 	Time Complexity : O(N)
	 *  Space Complexity : O(1)
	 */
	
	public int maxAreaOfIsland(int grid[][])
	{
		int  max = 0;
		
		int row = grid.length;
		
		/*
		 * If row count is zero, 
		 * then the grid is empty so we will return number of islands as zero.
		 */
		
		if(row == 0)
			return  max;
		
		int column = grid[0].length;
		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
				/*
				 *  For every element in the grid, i.e grid[i][j], 
				 *  we will check if it is a land (value = 1), if yes, 
				 *  then call dfs method and compare with current maximum area;
				 */
	
				if(grid[i][j] == 1)
					max = Math.max(max, dfs(grid, i, j, row, column));
			}
		}
		return max;
	}

	public int dfs(int grid[][],int i,int j,int row,int column)
	{
		/* Checking the boundary cases, and 
		 * if the element value is 0 (Water), 
		 * then we will simply return area as 0 
		 * else will process the node and its adjacents
		 */
		
		if(i<0 || i>=row || j<0  || j>=column || grid[i][j] == 0)
			return 0;
		
		// We are marking the node as visited by setting the value 0
	
		grid[i][j] = 0;
		
		// Area of each node will be one.
		int count  = 1;
		
		// Area will be summation of all island forming nodes i.e 1's
		
		// Top Move
		count += dfs(grid, i-1, j, row, column);
		
		// Right Move
		count += dfs(grid, i, j+1, row, column);
		
		// Down Move 
		count += dfs(grid, i+1, j, row, column);
		
		// Left Move
		count += dfs(grid, i, j-1, row, column);
		
		return count;
	}
}
