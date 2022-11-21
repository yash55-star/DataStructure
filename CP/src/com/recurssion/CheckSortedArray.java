package com.recurssion;

public class CheckSortedArray {

	public static boolean sorted(int[] arr) { // n array

		if (arr.length <= 1) {
			return true;
		}

		int[] smallarray = new int[arr.length - 1]; // n-1 array
		for (int i = 1; i < arr.length; i++) {
			smallarray[i - 1] = arr[i];
		}

		boolean small = sorted(smallarray);

		if (!small) {
			return false;
		}
		if (arr[0] <= arr[1]) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean sorted2(int[] arr) { // n array

		if (arr.length <= 1) {
			return true;
		}

		if (arr[0] > arr[1]) {
			return false;
		}

		int[] smallarray = new int[arr.length - 1]; // n-1 array
		for (int i = 1; i < arr.length; i++) {
			smallarray[i - 1] = arr[i];
		}

		boolean small = sorted(smallarray);
		return small;

	}

	public static void main(String[] args) {
		int input[] = { 2, 1, 3, 4, 5 };
		System.out.println(sorted(input));
	}

}
