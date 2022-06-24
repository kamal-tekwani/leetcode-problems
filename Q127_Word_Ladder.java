package com.home.leetcode.hard;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/*
 * Program Link : https://leetcode.com/problems/word-ladder/
 * Solution Link : (1) https://leetcode.com/problems/word-ladder/discuss/1764371/A-very-highly-detailed-EXPLANATION 
 *      	       (2) https://www.youtube.com/watch?v=ZVJ3asMoZ18
 */

public class Q127_Word_Ladder
{
	/*
	 * Time Complexity : O(M^2 * N)
	 * where M is the size of Dequeue word and N is the size of word list.
	 * 
	 * Space Complexity : O(M * N)
	 * M is the number of characters that we had in our string and N is the size of the word list.
	 */

	public int ladderLength(String beginWord, String endWord, List<String> wordList)
	{
		/*
		 * Putting all the words from the list  into a set inorder to avoid duplicates usage
		 */
		Set<String> set = new HashSet<String>(wordList);

		int changes = 1;

		/* 
		 * If word list or set does not contains the endWord, 
		 * then we can't reached the target string.
		 */

		if(!set.contains(endWord))
			return 0;

		Queue<String> queue = new LinkedList<String>();
		// Pushing the begin word into the queue.
		queue.offer(beginWord);

		while(!queue.isEmpty())
		{
			int size = queue.size();
			for(int i=0 ; i<size ; i++)
			{
				String word = queue.poll();
				if(word.equals(endWord))
					return changes;
				/*
				 * For each alphabet position, we are just iterating
				 * and finding if combination string is present in the 
				 * set, if it is present then we will simply push into 
				 * the queue and remove it from the set so that
				 * it won't be considered twice.
				 */
				for(int j=0 ; j<word.length() ; j++)
				{
					for(int k='a' ; k<='z'; k++)
					{
						char array[] = word.toCharArray();
						array[j] = (char) k;
						String words = new String(array);
						if(set.contains(words))
						{
							queue.offer(words);
							set.remove(words);
						}

					}
				}
			}
			++changes;
		}
		return 0;
	}


}
