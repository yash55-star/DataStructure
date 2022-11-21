package com.array2;

public class Insertion_sort {

	public static int[] binarySearch(int[] arr, int x) {

		int key, j;
		for (int i = 0; i < arr.length - 1; i++) {

			key = i + 1;
			j = i;
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = key;

		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 13, 4, 1, 3, 6, 28 };
		System.out.println(Insertion_sort.binarySearch(arr, 11));
	}

}
