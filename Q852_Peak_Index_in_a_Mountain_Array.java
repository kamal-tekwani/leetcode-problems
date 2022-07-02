package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * Solution Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/discuss/1017868/C%2B%2B-O(n)-O(log(n))-Simple-and-Short-Solutions-detailed-explanations
 */

public class Q852_Peak_Index_in_a_Mountain_Array
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	/*
	public int peakIndexInMountainArray(int[] arr) 
	{
		int length = arr.length;
		int index = -1;
		for(int i=1 ; i<length ; i++)
			if(arr[i-1] > arr[i])
			{
				index = i-1;
				break;
			}
		return index;
	}
	 */

	/*
	 * Time Complexity : O(log N)
	 * Space Complexity : O(1)
	 */

	public int peakIndexInMountainArray(int[] arr) 
	{
		int left = 0;
		int right = arr.length-1;


		while(left <= right)
		{
			int mid = left + (right-left)/2;

			if(arr[mid] < arr[mid+1])
				left = mid+1;
			else
				right = mid-1;
		}
		return left;
	}

}
