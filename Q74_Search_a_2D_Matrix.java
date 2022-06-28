package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/search-a-2d-matrix/
 * Solution Link : https://leetcode.com/problems/search-a-2d-matrix/discuss/1896422/Java-(-0ms-100-faster-)
 */

public class Q74_Search_a_2D_Matrix 
{
	/*
	 * Time Complexity : O(log N)
	 * Space Complexity : O(1) 
	 */
	public boolean searchMatrix(int[][] matrix, int target) 
	{
		int i=0;
		int j=matrix[0].length-1;

		int rows = matrix.length;

		while(i<rows && j>=0)
		{
			if(matrix[i][j] == target)
				return true;
			else if(matrix[i][j] > target)
				j--;
			else
				i++;
		}
		return false;
	}
}
