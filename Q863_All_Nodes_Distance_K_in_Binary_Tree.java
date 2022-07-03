package com.home.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
 * Solution Link : https://www.youtube.com/watch?v=f-oTsCUCiXk
 */

public class Q863_All_Nodes_Distance_K_in_Binary_Tree
{
	class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val)
		{
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public List<Integer> distanceK(TreeNode root, TreeNode target, int k)
	{
		List<Integer> list = new ArrayList<Integer>();
		findNodesAtK(root,target,k,list);
		return list;
	}

	public int findNodesAtK(TreeNode root,TreeNode target,int k,List<Integer> list)
	{
		if(root == null)
			return -1;

		if(root == target)
		{
			findSubtreeNodesAtK(root,k,list);
			return 0;
		}

		int dl = findNodesAtK(root.left, target, k, list);
		if(dl != -1)
		{
			if(dl + 1 == k)
				list.add(root.val);
			else
				findSubtreeNodesAtK(root.right, k-dl-2, list);

			return dl+1;
		}

		int dr = findNodesAtK(root.right, target, k, list);
		if(dr != -1)
		{
			if(dr + 1 == k)
				list.add(root.val);
			else
				findSubtreeNodesAtK(root.left, k-dr-2, list);

			return dr+1;
		}

		return -1;
	}

	public void findSubtreeNodesAtK(TreeNode root, int k, List<Integer> list)
	{
		if(root == null || k<0)
			return;

		if(k==0)
		{
			list.add(root.val);
			return;
		}

		findSubtreeNodesAtK(root.left, k-1, list);
		findSubtreeNodesAtK(root.right, k-1, list);
	}
}
