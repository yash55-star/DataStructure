package com.array;

import java.util.Arrays;

public class Arrangeorder {

	public static void arrange(int[] arr, int n) {

		arr = new int[n];

		int startindex = 0;
		int endindex = arr.length - 1;

		int val = 1;
		for (int i = 0; i < arr.length; i++) {

			
			arr[startindex] = val;
			if (val == n) {
				break;
			}
			val++;

			arr[endindex] = val;
			if (val == n) {
				break;
			}
			val++;

			startindex++;
			endindex--;

		}
		int[] copy = Arrays.copyOf(arr, arr.length);
		for (int i = 0; i < n; i++) {
			System.out.print(copy[i] + " ");
		}

	}

	public static void main(String[] args) {

		int[] arr = {};
		Arrangeorder.arrange(arr, 9);

	}

}
