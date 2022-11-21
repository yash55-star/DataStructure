package com.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraverseTwoDimentionalArray {

	public static List<Integer> spiralTraverse(int[][] array) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int startRow = 0; // [0][0]...[0][n]
		int startColumn = array.length - 1; // [0][n]...[n][n]
		int endRow = array.length - 1; // [n][n].....[n][0]
		int endColumn = 0; // [n][0] .... [0][0]
		int length = (array.length % 2 == 0) ? array.length / 2 : array.length / 2 + 1;
		for (int i = 0; i < length; i++) {

			for (int j = startRow; j <= startColumn; j++) {

				if (!list.contains(array[startRow][j]))
					list.add(array[startRow][j]);

			}

			for (int j = startRow; j <= startColumn; j++) {

				if (!list.contains(array[j][startColumn]))
					list.add(array[j][startColumn]);

			}

			for (int j = endRow; j >= endColumn; j--) {

				if (!list.contains(array[endRow][j]))
					list.add(array[endRow][j]);

			}

			for (int j = endRow; j >= endColumn; j--) {

				if (!list.contains(array[j][endColumn]))
					list.add(array[j][endColumn]);

			}

			startRow++;
			startColumn--;
			endRow--;
			endColumn++;

		}
		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {

		int[][] i1 = { { 1 } };
		List<Integer> list1 = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
		SpiralTraverseTwoDimentionalArray.spiralTraverse(i1);
	}

}
