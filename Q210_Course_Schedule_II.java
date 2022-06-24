package com.home.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/*
 *	Problem Link : https://leetcode.com/problems/course-schedule-ii/
 *  Solution Link : (1) https://leetcode.com/problems/course-schedule-ii/discuss/1642354/C%2B%2BPython-Simple-Solutions-w-Explanation-or-Topological-Sort-using-BFS-and-DFS
 *                  (2) https://www.youtube.com/watch?v=rZv_jHZva34    ---> Topological Sort (Breadth First Search) 
 */


public class Q210_Course_Schedule_II 
{
	/*
	 * Time Complexity : 
	 * Space Complexity : 
	 */

	public int[] findOrder(int numCourses, int[][] prerequisites) 
	{
		int matrix[][] = new int[numCourses][numCourses];
		int inDegree[] = new int[numCourses];
		int order[] = new int[numCourses];
		int count = 0;
		int index = 0;

		for(int i=0 ; i<prerequisites.length ; i++)
		{
			int course = prerequisites[i][0];
			int pre = prerequisites[i][1];
			if(matrix[pre][course] == 0)
			{
				inDegree[course]++;
				matrix[pre][course] = 1;
			}
		}

		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0 ; i<inDegree.length ; i++)
			if(inDegree[i] == 0)
				queue.offer(i);

		while(!queue.isEmpty())
		{
			int course = queue.poll();
			order[index++] = course;
			count++;
			for(int i=0 ; i<numCourses ; i++)
			{
				if(matrix[course][i] != 0)
				{
					if(--inDegree[i] == 0);
					queue.offer(i);
				}
			}
		}
		return count== numCourses ? order : new int[] {};
	}
}
