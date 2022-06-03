package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/same-tree/
 *  Solution Link : https://leetcode.com/problems/subtree-of-another-tree/discuss/102724/Java-Solution-tree-traversal
 */

public class Q100_Same_Tree 
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */
	
	public boolean isSameTree(TreeNode p, TreeNode q)
	{
        if(p == null && q == null)
        	return true;
        
        if(p == null || q == null)
        	return false;
        
        if(p.val != q.val)
        	return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
