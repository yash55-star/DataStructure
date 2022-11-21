package com.sorting;

public class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void quickSort(int[] input, int low, int high) {

		if (low < high) {

			int pivotindex = partition(input, low, high);

			// quick sort left
			quickSort(input, low, pivotindex - 1);
			// quick sort right
			quickSort(input, pivotindex + 1, high);

		}

	}

	private static int partition(int[] input, int low, int high) {

		// take pivot as last element
		int pivot = input[high];

		// take index at lowest
		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {

			if (input[j] < pivot) {

				i++;
				swap(input, i, j); // swap arr[i] = arr[j]

			}

		}
		swap(input, i + 1, high);
		return i + 1;
	}
	
	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
		
	}

	// Function to print an array
	static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);

	}

}
