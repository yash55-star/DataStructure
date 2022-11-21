package com.TWODarray;

public class TotalSumArray {

	public static void totalSum(int[][] arr) {

		int requiredSum = 0;
        
        // Traverse arr[][]
        // Loop from i to N-1 for rows
        for (int i = 0; i < arr.length; i++) {
     
            // Loop from j = N-1 for columns
            for (int j = 0; j < arr[0].length; j++) {
     
                // Condition for diagonal
                // elements
                if (i == j || (i + j) == arr[0].length - 1) {
                    requiredSum += arr[i][j];
                }
     
                // Condition for Boundary
                // elements
                else if (i == 0 || j == 0 || i == arr[0].length - 1|| j == arr[0].length - 1) {
                    requiredSum += arr[i][j];
                }
            }
        }
     
        // Print the final Sum
        System.out.println(requiredSum);
	}

	public static void main(String[] args) {
		int[][] arr = { { 1 ,2 ,3 ,10 }, { 4 ,5 ,6 ,11}, { 7 ,8 ,9 ,12}, { 13 ,14 ,15 ,16 }};
		TotalSumArray.totalSum(arr);
	}

}
