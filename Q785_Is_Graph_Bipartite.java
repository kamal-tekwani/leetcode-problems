package com.home.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  Problem Link : https://leetcode.com/problems/is-graph-bipartite/
 *  Solution Link : https://leetcode.com/problems/is-graph-bipartite/discuss/115487/Java-Clean-DFS-solution-with-Explanation
 */

public class Q785_Is_Graph_Bipartite
{
	/*
	 * Time Complexity :
	 * Space Complexity : 
	 */
	
	public boolean isBipartite(int[][] graph) 
	{
		int length = graph.length;

		/*
		 *  Haven't Color Yet : 0
		 *  Blue Color : 1
		 *  Red Color : -1
		 */

		int color[] = new int[length];

		for(int i=0 ; i<length ; i++)
		{
			if(color[i] != 0)
				continue;

			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(i);
			color[i] = 1;   // Blue: 1; Red: -1.

			while(!queue.isEmpty())
			{
				int current = queue.poll();
				int adjacents[] = graph[current];

				for(int next : adjacents)
				{
					// If this node hasn't been colored;
					if(color[next] == 0)
					{
						// Color it with a different color;
						color[next] = -color[current];
						queue.add(next);
					}
					// If it is colored and its color is different, return false;
					else if(color[next] != -color[current])
						return false;
				}
			}
		}
		return true;
	}
}
