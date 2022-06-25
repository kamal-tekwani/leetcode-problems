package com.home.leetcode.easy;

/*
 * Problem Link : https://leetcode.com/problems/remove-vowels-from-a-string/
 * Solution Link : https://leetcode.com/problems/remove-vowels-from-a-string/discuss/452476/Java-StringBuffer-0ms-with-written-approach-to-answering-in-interview.
 */

public class Q1119_Remove_Vowels_from_a_String
{
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */
	
	public String removeVowels(String s) 
	{
		int length = s.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ; i<length ; i++)
        	if(!isVowel(s.charAt(i)))
        		sb.append(s.charAt(i));
        
        return sb.toString();
    }
	
	public boolean isVowel(char c)
	{
		if(c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u')
    		return true;
		return false;
	}
}
