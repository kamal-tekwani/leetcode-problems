package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 * Solution Link : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/discuss/1473083/Simple-java-and-java-8-Solution
 */


public class Q2011_Final_Value_of_Variable_After_Performing_Operations
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public static int finalValueAfterOperations(String[] operations) 
	{
		int i=0;
		for(String s : operations)
			if(s.charAt(1) == '+')
				i++;
			else
				i--;
		return i;
	}

	public static void main(String[] args)
	{
		String operations[] = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(operations));
	}


}
