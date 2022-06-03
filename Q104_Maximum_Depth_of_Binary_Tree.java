package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *  Solution Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/discuss/1770060/C%2B%2B-oror-Recursive-oror-DFS-oror-Example-Dry-Run-oror-Well-Explained
 */

public class Q104_Maximum_Depth_of_Binary_Tree 
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */
	
	public int maxDepth(TreeNode root)
	{
		if(root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right)+1;
	}
}
