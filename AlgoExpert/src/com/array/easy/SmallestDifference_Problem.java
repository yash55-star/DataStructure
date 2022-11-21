package com.array.easy;

import java.util.Arrays;

public class SmallestDifference_Problem {

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);

		int idxOne = 0;
		int idxtwo = 0;
		int Smallest = Integer.MAX_VALUE;
		int current = 0;
		int[] smallestPair = new int[2];
		while (idxOne <= arrayOne.length - 1 && idxtwo <= arrayTwo.length - 1) {

			int firstnum = arrayOne[idxOne];
			int secondNum = arrayTwo[idxtwo];
			if (firstnum < secondNum) {
				current = secondNum - firstnum;
				idxOne++;
			} else if (secondNum < firstnum) {
				current = firstnum - secondNum;
				idxtwo++;
			} else {
				return new int[] { firstnum, secondNum };
			}
			if (Smallest > current) {
				Smallest = current;
				smallestPair = new int[] { firstnum, secondNum };
			}

		}
		
		return smallestPair;

	}

	public static void main(String[] args) {

		int[] i1 = { -1, 5, 10, 20, 28, 3};
		int[] i2 = { 26, 134, 135, 15, 17 };
SmallestDifference_Problem.smallestDifference(i1, i2);
	}

}
