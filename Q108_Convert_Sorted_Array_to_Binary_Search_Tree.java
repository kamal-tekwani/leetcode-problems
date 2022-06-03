package com.home.leetcode.easy;

import com.home.leetcode.easy.Binary_Tree.TreeNode;

/*
 *  Problem Link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *  Solution Link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/discuss/35220/My-Accepted-Java-Solution
 */

public class Q108_Convert_Sorted_Array_to_Binary_Search_Tree
{
	/*
	 *  Time Complexity : 
	 *  Space Complexity : 
	 */

	public TreeNode sortedArrayToBST(int[] nums) 
	{
		if(nums.length == 0)
			return null;
		return createBST(nums, 0, nums.length-1);
	}

	public TreeNode createBST(int nums[],int left,int right)
	{
		if(left > right)
			return null;
		int mid = left + (right-left)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = createBST(nums, left, mid-1);
		root.right = createBST(nums, mid+1, right);
		return root;
	}

}
