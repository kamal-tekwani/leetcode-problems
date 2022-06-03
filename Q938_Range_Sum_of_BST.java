package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 * Program Link : https://leetcode.com/problems/range-sum-of-bst/
 * Solution Link : https://leetcode.com/problems/range-sum-of-bst/discuss/192019/JavaPython-3-3-similar-recursive-and-1-iterative-methods-w-comment-and-analysis 
 */

public class Q938_Range_Sum_of_BST
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */
	
	public int rangeSumBST(TreeNode root, int low, int high)
	{
		if(root == null)
			return 0;
		/* 
		 * if root value is lesser than low and high, 
		 * it means we will jump to right part because going 
		 * left makes no sense, all child values will be smaller.
		 */
		if(root.val < low && root.val < high)
			return rangeSumBST(root.right, low, high);
		/*
		 * if root value is greater than low and high,
		 * it means we will jump to left partt because going
		 * right makes no sense, all child nodes will be greater.
		 */

		else if(root.val > low && root.val > high)
			return rangeSumBST(root.left, low, high);
		else
			return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
	}
}
