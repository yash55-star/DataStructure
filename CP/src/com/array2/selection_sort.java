package com.array2;

public class selection_sort {

	public static int[] binarySearch(int[] arr, int x) {

		int start = 0;
		while (start < arr.length - 1) {

			int min = arr[start];
			int minindex = start;
			int i = start + 1;
			while (i < arr.length) {
				if (min > arr[i]) {
					min = arr[i];
					minindex = i;
				}
				i++;
			}

			arr[minindex] = arr[start];
			arr[start] = min;
			start++;

		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 13, 4, 1, 3, 6, 28 };
		System.out.println(selection_sort.binarySearch(arr, 11));
	}

}
