package com.TWODarray;

import java.util.ArrayList;
import java.util.List;

public class findLargestColumnorRow {

	public static void findLargest(int mat[][]) {

		int columnMax = Integer.MIN_VALUE;
		int rowMax = Integer.MIN_VALUE;

		List<Integer> largestcolumn = new ArrayList<Integer>();
		List<Integer> largestRow = new ArrayList<Integer>();

		if (mat.length != 0) {

			for (int i = 0; i < mat[0].length; i++) {
				int columnSum = 0;
				for (int j = 0; j < mat.length; j++) {
					columnSum += mat[j][i];
				}

				if (columnMax < columnSum) {
					largestcolumn = new ArrayList<Integer>();
					columnMax = columnSum;
					largestcolumn.add(i);// index column
					largestcolumn.add(columnSum);// index column

				}

			}

			for (int i = 0; i < mat.length; i++) {
				int rowumnSum = 0;

				for (int j = 0; j < mat[0].length; j++) {
					rowumnSum += mat[i][j];
				}

				if (rowMax < rowumnSum) {
					largestRow = new ArrayList<Integer>();
					rowMax = rowumnSum;
					largestRow.add(i);// index row
					largestRow.add(rowumnSum);// index row

				}

			}
		}
		else
		{
			System.out.println("row" + " " + 0 + " " + rowMax);
		}

		if (!largestcolumn.isEmpty() && !largestRow.isEmpty()) {

			if (largestcolumn.get(1) > largestRow.get(1)) {
				System.out.println("column" + " " + largestcolumn.get(0) + " " + largestcolumn.get(1));
			} else {

				System.out.println("row" + " " + largestRow.get(0) + " " + largestRow.get(1));
			}
		}
	}

	public static void main(String[] args) {

		int[][] l1 = {};
		findLargestColumnorRow.findLargest(l1);

	}

}
