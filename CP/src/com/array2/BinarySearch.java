package com.array2;

public class BinarySearch {

	public static int binarySearch(int[] arr, int x) {

		int match = -1;
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				match = mid;
				break;
			} else if (x > arr[mid]) {
				start = mid + 1;
				;

			} else if (x < arr[mid]) {
				end = mid - 1;

			}

		}

		return match;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 9, 11, 12, 45 };
		System.out.println(BinarySearch.binarySearch(arr, 11));
	}

}
