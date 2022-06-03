package com.home.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/binary-tree-postorder-traversal/
 *  Solution Link : https://www.youtube.com/watch?v=NzIGLLwZBS8
 */

public class Q145_Binary_Tree_Postorder_Traversal 
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */

	/*
	 * Iterative Approach 
	 */

	public List<Integer> postorderTraversal(TreeNode root) 
	{
		List<Integer> list = new ArrayList<Integer>();
		postOrderTraversal(root,list);
		return list;
	}

	public void postOrderTraversal(TreeNode root,List<Integer> list)
	{
		if(root != null)
		{
			postOrderTraversal(root.left,list);
			postOrderTraversal(root.right, list);
			list.add(root.val);
		}
	}

	/*
	 * Recursive Approach
	 */

	/*
	public List<Integer> postorderTraversal(TreeNode root) 
	{
		List<Integer> list = new ArrayList<Integer>();

		if(root == null)
			return list;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current  = root;
		TreeNode temp = null;

		while(current != null || !stack.isEmpty())
		{
			if(current != null)
			{
				stack.add(current);
				current = current.left;
			}
			else
			{
				temp = stack.peek().right;
				if(temp == null)
				{
					temp = stack.pop();
					list.add(temp.val);
					while(!stack.isEmpty() && temp ==  stack.peek().right)
					{
						temp = stack.pop();
						list.add(temp.val);
					}
				}
				else
					current = temp;
			}
		}
		return list;
	}
	 */
}
