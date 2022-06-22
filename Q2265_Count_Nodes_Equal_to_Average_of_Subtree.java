package com.home.leetcode.medium;

import com.home.leetcode.medium.Binary_Tree.TreeNode;

/*
 * Problem Link : https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
 * Solution Link : (1) https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/discuss/2017827/Java-or-DFS (2) https://www.youtube.com/watch?v=Zq8LYH3mTZo
 */

public class Q2265_Count_Nodes_Equal_to_Average_of_Subtree
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1) {O(N) : Due to Auxilliary Space used in stack}
	 */

	int count = 0;

	class Pair
	{
		int sum;
		int number;

		public Pair(int sum,int  number)
		{
			this.sum = sum;
			this.number = number;
		}
	}

	public Pair dfs(TreeNode root)
	{
		if(root == null)
			return new Pair(0,0);

		Pair left = dfs(root.left);
		Pair right = dfs(root.right);

		int sum = left.sum + right.sum + root.val;
		int number = left.number + right.number + 1;

		if(Math.round(sum / number) == root.val)
			count++;

		return new Pair(sum,number);
	}

	public int averageOfSubtree(TreeNode root)
	{
		dfs(root);
		return count;
	}

}
