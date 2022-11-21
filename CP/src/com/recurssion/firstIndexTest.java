package com.recurssion;

public class firstIndexTest {

	public static int firstIndex(int input[], int x) {

		return findFirstIndex(input, x, 0);

	}

	public static int findFirstIndex(int input[], int x, int startIndex) {

		if (startIndex >= input.length - 1) { // base cond
			return -1;
		}

		if (x == input[startIndex]) {
			return startIndex;
		}

		return findFirstIndex(input, x, startIndex + 1); // recurssion

	}

	public static void main(String[] args) {

		int[] p = { 9, 8, 10, 8 };
		System.out.println(firstIndex(p, 8));
	}

}
