package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndicesTest {

	public static int[] allIndexes(int input[], int x) {

		List<Integer> list = new ArrayList<Integer>();
		
		list = findAllindexIndex(input, x, 0, list);
		
		int[] primitive = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
		
		return primitive;

	}

	public static List<Integer> findAllindexIndex(int input[], int x, int startIndex, List<Integer> list) {

		if (startIndex > input.length - 1) { // base cond
			return list;
		}

		if (x == input[startIndex]) { /// process
			list.add(startIndex);
		}

		return findAllindexIndex(input, x, startIndex + 1, list); // recurssion

	}

	public static void main(String[] args) {

		int[] p = { 9, 8, 10, 8 };
		System.out.println(allIndexes(p, 8));
	}

}
