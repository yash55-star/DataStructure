package com.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraverseTwoDimentionalArray2 {

	public static List<Integer> spiralTraverse(int[][] array) {

		List<Integer> result = new ArrayList<>();
		int startRow = 0;
		int endRow = array.length - 1;
		int startColumn = 0;
		int endColumn = array[0].length - 1;

		while (startRow <= endRow && startColumn <= endColumn) {
			
			
			for(int i = startColumn ; i<=endColumn ; i++)
			{
				System.out.println(array[startRow][i]);
				result.add(array[startRow][i]);
			}
			
			startRow++;
			
			if(startRow>endRow)
			{
				break;	
			}
			
			for(int i = startRow;i<=endRow;i++)
			{
				System.out.println(array[i][endColumn]);
				result.add(array[i][endColumn]);
			}
			endColumn --;
			
			if(startColumn > endColumn)
			{
				break;
			}
			
			
			for(int i = endColumn;i>=startColumn;i--)
			{
				System.out.println(array[endRow][i]);
				result.add(array[endRow][i]);
			}
			
			endRow--;
			
			
			for(int i = endRow;i>=startRow;i--)
			{
				System.out.println(array[i][startColumn]);
				result.add(array[i][startColumn]);
			}
			
			startColumn++;

		}
		return result;

	}

	public static void main(String[] args) {

		int[][] i1 = { {1, 2, 3, 4},
			    {12, 13, 14, 5},
			    {11, 16, 15, 6},
			    {10, 9, 8, 7} };
		SpiralTraverseTwoDimentionalArray2.spiralTraverse(i1);
	}

}
