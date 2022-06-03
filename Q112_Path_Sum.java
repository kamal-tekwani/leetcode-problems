package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/path-sum/
 *  Solution Link : https://leetcode.com/problems/path-sum/discuss/36378/AcceptedMy-recursive-solution-in-Java
 */

public class Q112_Path_Sum 
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */
	
	public boolean hasPathSum(TreeNode root, int targetSum)
	{
        if(root == null)
        	return false;
        
        if(root.left == null && root.right == null && targetSum-root.val == 0)
        	return true;
        
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
}
