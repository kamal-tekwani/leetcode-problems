package com.home.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/binary-tree-inorder-traversal/
 *  Solution Link : https://leetcode.com/problems/binary-tree-inorder-traversal/discuss/31213/Iterative-solution-in-Java-simple-and-readable
 */

public class Q94_Binary_Tree_Inorder_Traversal 
{
	/*
	 * Time Complexity : 
	 * Space Complexity : 
	 */

	/*
	 *  Recursive Approach
	 */

	/*
	public List<Integer> inorderTraversal(TreeNode root)
	{
        if(root == null)
        	return null;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode current = root;

        while(current != null || !stack.isEmpty())
        {
        	while(current != null)
        	{
        		stack.add(current);
        		current = current.left;
        	}

        	current = stack.pop();
        	list.add(current.val);
        	current = current.right;
        }

        return list;	
    }
	 */

	/*
	 *  Iterative Approach
	 * 
	 */

	public List<Integer> inorderTraversal(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();
		inOrder(root, list);
		return list;
	}

	public void inOrder(TreeNode root,List<Integer> list)
	{
		if(root != null)
		{
			inOrder(root.left, list);
			list.add(root.val);
			inOrder(root.right, list);
		}
	}
}
