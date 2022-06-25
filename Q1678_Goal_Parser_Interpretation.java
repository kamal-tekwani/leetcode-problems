package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/goal-parser-interpretation/
 * Solution Link : https://leetcode.com/problems/goal-parser-interpretation/discuss/975844/Java-Solution-in-9-lines-faster-than-100-submissions
 */

public class Q1678_Goal_Parser_Interpretation
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */

	public String interpret(String command)
	{
		StringBuilder sb = new StringBuilder();

		int length = command.length();

		for(int i=0 ; i<length ; i++)
		{
			if(command.charAt(i) == '(')
			{
				if(i+1 < length && command.charAt(i+1) == ')')
				{
					sb.append("o");
					i++;
				}
				else if(i+1 < length && command.charAt(i+1) == 'a')
				{
					sb.append("al");
					i+=3;
				}
			}	
			else
				sb.append(command.charAt(i));
		}

		return sb.toString();
	}
}
