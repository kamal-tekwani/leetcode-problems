package com.home.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
 * Solution Link : https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/discuss/1823819/JavaPython-3-Simple-code-w-analysis.
 */

public class Q2194_Cells_in_a_Range_on_an_Excel_Sheet 
{
	/*
	 * Time Complexity : O( (c2 - c1 + 1) * (r2 - r1 + 1) ) 
	 * Space Complexity : O(1)
	 */

	public List<String> cellsInRange(String s)
	{
		List<String> list = new ArrayList<String>();

		for(int i=(int)s.charAt(0) ; i<=(int)s.charAt(3) ; i++)
			for( int j=Integer.parseInt(s.charAt(1)+"") ; j<=Integer.parseInt(s.charAt(4)+"") ; j++) 
				list.add( (char)i +""+ j  );
		System.out.println(list);
		return list;
	}
}
