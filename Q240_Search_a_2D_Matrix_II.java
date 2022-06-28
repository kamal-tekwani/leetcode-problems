package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/search-a-2d-matrix-ii/
 * Solution Link : https://leetcode.com/problems/search-a-2d-matrix-ii/discuss/66140/My-concise-O(m%2Bn)-Java-solution
 */

public class Q240_Search_a_2D_Matrix_II 
{
	/*
	 * Time Complexity : O(m+n)
	 * Space Complexity : O(1) 
	 */

	public boolean searchMatrix(int[][] matrix, int target) 
	{
		if(matrix == null || matrix.length < 1 || matrix[0].length < 1)
			return false;

		int i = 0;
		int j = matrix[0].length-1;

		int rows = matrix.length;

		while(i<rows && j>=0)
		{
			if(matrix[i][j] == target)
				return true;
			else if(matrix[i][j] > target)
				j--;
			else if(matrix[i][j] < target)
				i++;
		}

		return false;
	}
}
