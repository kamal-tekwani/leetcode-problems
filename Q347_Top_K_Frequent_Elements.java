package com.home.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * Problem Link : https://leetcode.com/problems/top-k-frequent-elements/
 * Solution Link : (1) https://leetcode.com/problems/top-k-frequent-elements/discuss/81635/3-Java-Solution-using-Array-MaxHeap-TreeMap
 *                 (2) https://www.youtube.com/watch?v=Wh3A29psE_Y
 * 
 */

public class Q347_Top_K_Frequent_Elements 
{
	/*
	 * Time Complexity : O(k log N)
	 * Space Complexity : O(N)
	 */

	public int[] topKFrequent(int[] nums, int k) 
	{
		HashMap<Integer, Integer> hmpMap = new HashMap<Integer, Integer>();

		for(int n : nums)
			hmpMap.put(n, hmpMap.getOrDefault(n, 0)+1);

		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<Map.Entry<Integer,Integer>>((a,b) -> b.getValue() - a.getValue());
		for(Map.Entry<Integer, Integer> entry : hmpMap.entrySet())
			maxHeap.add(entry);

		int result[] = new int[k];
		int  index = 0;
		while(index < k)
		{
			Map.Entry<Integer, Integer> entry = maxHeap.poll();
			result[index++] = entry.getKey();
		}
		return result;
	}

}
