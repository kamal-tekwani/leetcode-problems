package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Solution Link : (1) https://leetcode.com/problems/remove-duplicates-from-sorted-array/discuss/11780/5-lines-C%2B%2BJava-nicer-loops
 *                 (2) https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/discuss/27987/Short-and-Simple-Java-solution-(easy-to-understand)
 *               
 */

public class Q26_Remove_Duplicates_from_Sorted_Array
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1) 
	 */

	public int removeDuplicates(int[] nums) 
	{
		int index = 0;

		for(int i : nums)
			if(index == 0 || i > nums[index-1])    // if(index < 1 || i > nums[index-1])
				nums[index++] = i;

		return index;
	}
}
