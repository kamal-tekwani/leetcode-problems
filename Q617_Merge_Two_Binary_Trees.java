package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/merge-two-binary-trees/
 *  Solution Link : https://leetcode.com/problems/merge-two-binary-trees/discuss/104299/Java-Solution-6-lines-Tree-Traversal
 */

public class Q617_Merge_Two_Binary_Trees 
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */

	public TreeNode mergeTrees(TreeNode root1, TreeNode root2)
	{
		if(root1 == null && root2 == null)
			return null;

		int val = (root1 == null ? 0 : root1.val) + (root2 == null ? 0 : root2.val);

		TreeNode root = new TreeNode(val);
		root.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
		root.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);
		return root;
	}
}
