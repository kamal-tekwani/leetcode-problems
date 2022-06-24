package com.home.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem Link : https://leetcode.com/problems/rotting-oranges/
 * Solution Link : https://www.youtube.com/watch?v=pUAPcVlHLKA
 */

public class Q994_Rotting_Oranges 
{
	/*
	 * Time Complexity : O(N*N)
	 * Space Complexity : O(N*N)
	 */

	class Pair
	{
		int x;
		int y;

		public Pair(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	public int orangesRotting(int[][] grid)
	{
		int total = 0;
		int count = 0;
		int minCount = 0;
		int rows = grid.length;
		int columns = grid[0].length;
		Queue<Pair> queue = new LinkedList<Pair>();

		/*
		 * Put the position of all the rooten oranges in the queue.
		 * count the number of fresh oranges.
		 */
		for(int i=0 ; i<rows ; i++)
		{
			for(int j=0 ; j<columns ; j++)
			{
				if(grid[i][j] != 0)
					total++;
				if(grid[i][j] == 2)
					queue.offer(new Pair(i, j));
			}
		}

		if(total == 0)
			return 0;

		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};

		// BFS starting from initially rotten oranges.
		while(!queue.isEmpty())
		{
			int size = queue.size();
			count += size;

			while(size-- > 0)
			{
				Pair pair = queue.poll();
				for(int j=0 ; j<4 ; j++)
				{
					int x = pair.x + dx[j];
					int y = pair.y + dy[j];

					/*
					 * Checking the boundary cases,
					 * and if the no oranges is present or rotten orange is present,
					 * we don't need to process it further.
					 */
					if(x<0 || y<0 || x>=rows || y>=columns || grid[x][y] == 0 || grid[x][y] == 2)
						continue;

					// Make it rotten and add it in the queue.
					grid[x][y]=2;
					queue.offer(new Pair(x, y));
				}
			}

			if(!queue.isEmpty())
				minCount++;
		}

		/*
		 * total is the count of oranges (fresh and rotten)
		 * count is the number of oranges are processed to become rotten.
		 */
		return count == total ? minCount : -1;
	}
}
