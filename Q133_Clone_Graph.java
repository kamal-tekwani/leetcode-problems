package com.home.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/clone-graph/
 * Solution Link : https://leetcode.com/problems/clone-graph/discuss/1793436/Java-Simple-Code-With-Heavy-Comments-(No-HashMap)
 */

public class Q133_Clone_Graph
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	class Node 
	{
		public int val;
		public List<Node> neighbors;

		public Node() 
		{
			val = 0;
			neighbors = new ArrayList<Node>();
		}

		public Node(int val) 
		{
			this.val = val;
			this.neighbors = new ArrayList<Node>();
		}

		public Node(int val, ArrayList<Node> neighbors)
		{
			this.val = val;
			this.neighbors = neighbors;
		}
	}

	public void dfs(Node node , Node copy , Node[] visited)
	{
		// store the current node at it's val index which will tell us that this node is now visited
		visited[copy.val] = copy;

		// now traverse for the adjacent nodes of root node
		for(Node n : node.neighbors)
		{
			/*
			 * check whether that node is visited or not if it is not visited, there must be null
			 */
			if(visited[n.val] == null)
			{
				// so now if it not visited, create a new node
				Node newNode = new Node(n.val);

				// add this node as the neighbor of the prev copied node
				copy.neighbors.add(newNode);

				// make dfs call for this unvisited node to discover whether it's adjacent nodes are explored or not
				dfs(n , newNode , visited);
			}
			else
			{
				/*
				 * if that node is already visited, retrieve that node from visited array and,
				 * add it as the adjacent node of previous copied node 
				 * THIS IS THE POINT WHY WE USED NODE[] INSTEAD OF BOOLEAN[] ARRAY
				 */
				copy.neighbors.add(visited[n.val]);
			}
		}

	}
	public Node cloneGraph(Node node) 
	{
		// if the actual node is empty there is nothing to copy, so return null
		if(node == null) return null; 

		// create a new node , with same value as the root node(given node)
		Node copy = new Node(node.val); 

		/*
		 * in this question we will create an array of Node(not boolean) why ? ,
		 * because i have to add all the adjacent nodes of particular vertex, 
		 * whether it's visited or not, so in the Node[] initially null is stored, 
		 * if that node is visited, we will store the respective node at the index, and can retrieve that easily.
		 */
		Node[] visited = new Node[101];

		// initially store null at all places
		Arrays.fill(visited , null); 

		// make a dfs call for traversing all the vertices of the root node
		dfs(node , copy , visited); 

		// in the end return the copy node
		return copy; 
	}
}
