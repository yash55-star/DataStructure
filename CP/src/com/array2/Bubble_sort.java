package com.array2;

public class Bubble_sort {

	public static int[] binarySearch(int[] arr, int x) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-1; j++) {

				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 13, 4, 1, 3, 6, 28 };
		System.out.println(Bubble_sort.binarySearch(arr, 11));
	}

}
