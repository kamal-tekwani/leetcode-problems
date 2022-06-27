package com.home.leetcode.medium;

import java.util.Arrays;

public class Q2271_Maximum_White_Tiles_Covered_by_a_Carpet 
{
	public int maximumWhiteTiles(int[][] tiles, int carpetLen)
	{
		int result = Integer.MIN_VALUE;
		Arrays.sort(tiles, (a,b)-> a[0]-b[0]);
		int j = 0;
		int cover = 0;
		int partial = 0;

		for(int i=0  ; i<tiles.length ; i++)
		{
			if(i==j || tiles[j][0] +  carpetLen >= tiles[i][1])
			{
				cover+= tiles[i][1] - tiles[i][0] + 1;
				result = Math.max(result, cover);
				i++;
			}
			else
			{
				partial =  Math.max(0, tiles[j][0] + carpetLen - tiles[i][0]);
				result = Math.max(result, cover+partial);
				cover -= tiles[j][1] - tiles[j][0] + 1;
				j++;
			}
		}
		return Math.min(result, carpetLen);
	}
}
