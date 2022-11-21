package com.recurssion;

public class LastIndexTest {

	public static int lastIndex(int input[], int x) {

		return findLastIndex(input, x, 0, -1);

	}

	public static int findLastIndex(int input[], int x, int startIndex, int lastmatch) {

		if (startIndex > input.length - 1) { // base cond
			return lastmatch;
		}

		if (x == input[startIndex]) {
			lastmatch = startIndex;
		}

		return findLastIndex(input, x, startIndex + 1, lastmatch); // recurssion

	}

	public static void main(String[] args) {

		int[] p = { 9, 8, 10, 8 };
		System.out.println(lastIndex(p, 8));
	}

}
