package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * Solution Link : https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/discuss/2262579/java-solution-100-fast-O(n)
 */

public class Q1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(1)
	 */

	public double average(int[] salary)
	{  
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double sum = 0;
		for(int i : salary)
		{
			sum += i;
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		return (sum-min-max) / (double)(salary.length-2); 
	}
}
