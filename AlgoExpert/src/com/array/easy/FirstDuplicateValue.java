package com.array.easy;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {

	public int firstDuplicateValue(int[] array) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < array.length; i++) {
			if (!set.add(array[i])) {
				return array[i];
			}
		}
		return -1;
	}

}
