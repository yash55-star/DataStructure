package com.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_number_sum {

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

		List<Integer[]> list = new ArrayList<Integer[]>();
		Arrays.sort(array);

		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {

				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == targetSum) {
						Integer[] select = new Integer[3];
						select[0] = array[i];
						select[1] = array[j];
						select[2] = array[k];
						list.add(select);
						break;
					}
				}
			}
		}

		return list;
	}

	public static void main(String[] args) {
		System.out.print("");

		int[] i1 = { 12, 3, 1, 2, -6, 5, 0, -8, -1, 6, -5 };
		List<Integer[]> list = Three_number_sum.threeNumberSum(i1, 0);
	}

}
