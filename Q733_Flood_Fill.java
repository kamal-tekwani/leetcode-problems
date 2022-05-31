package com.home.leetcode.easy;

/*
 * 	Problem Link : https://leetcode.com/problems/flood-fill/
 * 	Solution Link : https://www.youtube.com/watch?v=RwozX--B_Xs
 */

public class Q733_Flood_Fill
{
	/*
	 * Time Complexity : O(m*n)
	 * Space Complexity : O(1)
	 */

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
	{
		/* Checking if Pixel at coordinate (sr,sc) is of same color,
		 * then simply return the image matrix,
		 * else, process the image
		 */
		
		if(newColor == image[sr][sc])
			return image;

		int rows = image.length;
		int columns = image[0].length;
		int source = image[sr][sc];

		// Processing the image
		dfs(image, sr, sc, newColor, rows, columns, source);

		return image;
	}

	public void dfs(int image[][],int sr,int sc,int newColor,int rows,int columns, int source)
	{
		// Checking the boundary cases
		if(sr<0 || sr>= rows || sc<0 || sc>= columns)
			return;

		/* Checking if pixel at coordinate (sr,sc) should be same as source
		 * in order to process with New Color 
		 * else it should simply return (nothing to process or change color)
		 */

		else if(image[sr][sc] != source)
			return;

		// Assigning the New Color to the adjacent coordinates, 4-directionally 
		image[sr][sc] = newColor;

		// Top Move
		dfs(image, sr-1, sc, newColor, rows, columns, source);

		// Right Move
		dfs(image, sr, sc+1, newColor, rows, columns, source);  

		// Down Move
		dfs(image, sr+1, sc, newColor, rows, columns, source);

		// Left Move
		dfs(image, sr, sc-1, newColor, rows, columns, source);	
	}

}
