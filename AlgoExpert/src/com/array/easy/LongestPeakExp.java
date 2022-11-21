package com.array.easy;

import java.util.ArrayList;
import java.util.List;

public class LongestPeakExp {

	public static int longestPeak(int[] array) {

		int peak = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < array.length - 1; i++) {

			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				peak = i;
				List<Integer> list1 = new ArrayList<Integer>();
				List<Integer> list2 = new ArrayList<Integer>();
				// left side
				for (int j = peak; j > 0; j--) {
					if (array[j] > array[j - 1]) {
						list1.add(array[j - 1]);
					} else {
						break;
					}
				}
				list1.add(array[i]);

				// right side
				for (int j = peak; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) {
						list2.add(array[j + 1]);
					} else {
						break;
					}
				}
				list1.addAll(list2);
				if (list.size() < list1.size()) {
					list.clear();
					list.addAll(list1);
				}

			}

		}
		System.out.println(list.size());
		return list.size();
	}

	public static void main(String[] args) {

		LongestPeakExp.longestPeak(new int[] { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 });

	}

}
