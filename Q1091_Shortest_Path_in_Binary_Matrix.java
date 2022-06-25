package com.home.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem Link : https://leetcode.com/problems/shortest-path-in-binary-matrix/
 * Solution Link : https://www.youtube.com/watch?v=CABaqOkWbgQ
 */

public class Q1091_Shortest_Path_in_Binary_Matrix 
{
	/*
	 * Time Complexity : O(M*N)
	 * Space Complexity : O(M*N)
	 */

	class Pair
	{
		int x;
		int y;
		int distance;

		public Pair(int x,int  y,int distance)
		{
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
	}

	public int shortestPathBinaryMatrix(int[][] grid)
	{
		if(grid[0][0] == 1)
			return -1;

		int row = grid.length;
		int column = grid[0].length;

		Queue<Pair> queue = new LinkedList<Pair>();

		queue.add(new Pair(0, 0, 1));
		grid[0][0] = 1;

		int dx[] = {0,1,1,1,0,-1,-1,-1};
		int dy[] = {1,1,0,-1,-1,-1,0,1};

		while(!queue.isEmpty())
		{
			int size = queue.size();

			while(size-- > 0)
			{
				Pair pair = queue.poll();

				if(pair.x == row-1 && pair.y == column-1)
					return pair.distance;

				for(int i=0 ; i<8 ; i++)
				{
					int x = pair.x + dx[i];
					int y = pair.y + dy[i];

					if(x>=0 && y>=0 && x<row && y<column && grid[x][y] == 0)
					{
						queue.add(new Pair(x,y, pair.distance+1));
						grid[x][y] = 1;
					}
				}
			}
		}
		return -1;
	}
}
