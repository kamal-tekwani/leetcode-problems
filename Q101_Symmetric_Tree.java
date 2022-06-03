package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/symmetric-tree/
 *  Solution Link : https://leetcode.com/problems/symmetric-tree/discuss/33054/Recursive-and-non-recursive-solutions-in-Java
 */

public class Q101_Symmetric_Tree 
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */

	public boolean isSymmetric(TreeNode root)
	{
		return root == null || isSymmetricHelp(root.left, root.right);
	}

	public boolean isSymmetricHelp(TreeNode left,TreeNode right)
	{
		if(left == null || right == null)
			return left == right;

		if(left.val != right.val)
			return false;

		return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right,right.left);
	}
}
