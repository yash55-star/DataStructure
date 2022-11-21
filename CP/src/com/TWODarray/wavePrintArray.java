package com.TWODarray;

public class wavePrintArray {

	public static void totalSum(int[][] arr) {

		// Loop to traverse matrix
		if (arr.length != 0) {

			for (int j = 0; j < arr[0].length; j++) {

				// If the current column
				// is even indexed, print
				// it in forward order
				if (j % 2 == 0) {
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i][j] + " ");
					}
				}

				// If the current column
				// is odd indexed, print
				// it in reverse order
				else {
					for (int i = arr.length - 1; i >= 0; i--) {
						System.out.print(arr[i][j] + " ");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1 , 2  ,3  ,4 }};
		wavePrintArray.totalSum(arr);
	}

}
