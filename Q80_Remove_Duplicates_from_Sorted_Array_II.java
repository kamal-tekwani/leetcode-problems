package com.home.leetcode.medium;

/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Solution Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/discuss/27987/Short-and-Simple-Java-solution-(easy-to-understand)
 */

public class Q80_Remove_Duplicates_from_Sorted_Array_II 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1) 
	 */

	public int removeDuplicates(int[] nums) 
	{
		int index = 0;

		for(int i : nums)
			if(index<2 || i > nums[index-2])
				nums[index++] = i;

		return index;
	}
}
