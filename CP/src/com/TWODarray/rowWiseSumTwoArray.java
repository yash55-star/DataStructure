package com.TWODarray;

public class rowWiseSumTwoArray {

	public static void rowWiseSum(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
				
			}
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) {
		  int[][] arr = { { 1, 2 }, { 3, 4 } }; 
		    System.out.println(arr[0][0]+arr[1][1]); 
	}

}
