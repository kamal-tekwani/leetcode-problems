package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 * Problem link : https://leetcode.com/problems/subtree-of-another-tree/
 * Solution Link : https://leetcode.com/problems/subtree-of-another-tree/discuss/102724/Java-Solution-tree-traversal
 */

public class Q572_Subtree_of_Another_Tree 
{
	/*
	 * Space Complexity :
	 * Time Complexity :
	 */

	public boolean isSubtree(TreeNode root, TreeNode subRoot) 
	{
		if(root == null)
			return false;

		if(isSame(root, subRoot))
			return true;

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	public boolean isSame(TreeNode root,TreeNode subRoot)
	{
		if(root == null && subRoot == null)
			return true;

		if(root == null || subRoot == null)
			return false;

		if(root.val != subRoot.val)
			return false;

		return  isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
	}
}
