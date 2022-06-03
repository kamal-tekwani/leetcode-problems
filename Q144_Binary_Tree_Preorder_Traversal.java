package com.home.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/binary-tree-preorder-traversal/
 *  Solution Link : https://www.youtube.com/watch?v=Bfqd8BsPVuw
 */

public class Q144_Binary_Tree_Preorder_Traversal
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */

	/*
	 * Iterative Approach
	 */

	/*
	public List<Integer> preorderTraversal(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();

		if(root == null)
			return list;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(root);

		while(!stack.isEmpty())
		{
			root = stack.pop();
			list.add(root.val);
			if(root.right != null)
				stack.add(root.right);
			if(root.left != null)
				stack.add(root.left);
		}
		return list;
	}
	 */

	/*
	 * Recursive Approach 
	 */

	public List<Integer> preorderTraversal(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();
		preOrderTraversal(root, list);
		return list;
	}

	public void preOrderTraversal(TreeNode root,List<Integer> list)
	{
		if(root != null)
		{
			list.add(root.val);
			preOrderTraversal(root.left, list);
			preOrderTraversal(root.right, list);
		}
	}
}
