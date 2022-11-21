package com.array.easy;

public class MonotonicArray {

	public static boolean isMonotonic(int[] array) {

		boolean asc = false;
		boolean desc = false;
		boolean equal = false;
		boolean isMonotonic = true;

		int left = 0;
		int right = array.length - 1;

		for (int i = 0; i < array.length-1; i++) {

			int j = i+1;

				if (i == j)
					continue;
				if (array[i] < array[j]) {
					asc = true;
				} else if (array[i] > array[j]) {
					desc = true;
				}

			

			if ((asc&&desc)) {
				isMonotonic = false;
				break;
			}

		}
		return isMonotonic;

	}

	public static void main(String[] args) {

		int[] i1 = { 1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
		System.out.println(MonotonicArray.isMonotonic(i1));
	}

}
