package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/defanging-an-ip-address/
 * Solution Link : https://leetcode.com/problems/defanging-an-ip-address/discuss/328895/JavaPython-3-3-One-liners-%2B-one-wo-lib.
 */

public class Q1108_Defanging_an_IP_Address 
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */
	public String defangIPaddr(String address) 
	{
		StringBuilder sb = new StringBuilder();
		for(char c : address.toCharArray())
			sb.append(c == '.' ? "[.]" : c);
		return sb.toString();
	}
}
