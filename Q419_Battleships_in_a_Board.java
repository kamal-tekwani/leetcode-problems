package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/battleships-in-a-board/
 * Solution Link : https://leetcode.com/problems/battleships-in-a-board/discuss/90902/Simple-Java-Solution
 */

public class Q419_Battleships_in_a_Board 
{
	/*
	 * Time Complexity : O(M * N)
	 * Space Complexity : O(1)
	 */

	public int countBattleships(char[][] board)
	{
		int count = 0;

		int row = board.length;

		if(row == 0)
			return 0;

		int column = board[0].length;

		for(int i=0 ; i<row ; i++)
		{
			for(int j=0 ; j<column ; j++)
			{
				if(board[i][j] == '.')
					continue;

				if(i>0 && board[i-1][j] == 'X')
					continue;

				if(j>0 && board[i][j-1] == 'X')
					continue;

				count++;
			}
		}
		return count;
	}
}
