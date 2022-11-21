package com.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallestDifference_Problem2 {

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i <= arrayOne.length - 1; i++) {
			for (int j = 0; j <= arrayTwo.length - 1; j++) {

				int diff = arrayOne[i] - arrayTwo[j];
				if (arrayTwo[j] > arrayOne[i]) {
					diff = arrayTwo[j] - arrayOne[i];
				}
				if (diff > 0) {

					List<Integer> l = new ArrayList<Integer>();
					l.add(arrayOne[i]);
					l.add(arrayTwo[j]);
					map.put(diff, l);
				}

			}
		}
		List<Integer> result2 = new ArrayList();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> result2.add(x.getKey()));

		int[] i2 = new int[2];
		i2[0] = map.get(result2.get(0)).get(0);
		i2[1] = map.get(result2.get(0)).get(1);
		return i2;
	}

	public static void main(String[] args) {

		int[] i1 = { 10, 0, 20, 25 };
		int[] i2 = { 1005, 1006, 1014, 1032, 1031 };

		System.out.println(SmallestDifference_Problem2.smallestDifference(i1, i2));
	}

}
