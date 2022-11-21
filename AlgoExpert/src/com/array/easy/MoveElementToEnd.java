package com.array.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveElementToEnd {

	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

		int left = 0;
		int right = array.size() - 1;
		Collections.sort(array);
		while (left < right) {
			if (array.get(left) == toMove && array.get(right) != toMove) {
				array.set(left, array.get(right));
				array.set(right, toMove);
				left++;
				right--;
			} else if (array.get(left) != toMove) {
				left++;
			} else if (array.get(right) == toMove) {
				right--;
			}

		}

		return array;
	}

	public static void main(String[] args) {

		int[] i1 = { 12, 3, 1, 2, -6, 5, 0, -8, -1, 6, -5 };
		List<Integer> list1 = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
		MoveElementToEnd.moveElementToEnd(list1, 2);
	}

}
