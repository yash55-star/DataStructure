package com.array.easy;

import java.util.Arrays;

public class Non_constructible_change {

	public int nonConstructibleChange(int[] coins) {

		Arrays.sort(coins);

		if (coins.length == 0)
			return 1;

		int change = 0;
		int min = 0;
		for (int i = 0; i <= coins.length - 1; i++) {
			int value = coins[i];
			if (value <= change + 1) {
				change = value + change;
			} else {
				//min = change + 1;
				break;
			}
		}
		return change + 1;

	}

	public static void main(String[] args) {
		Non_constructible_change change = new Non_constructible_change();

		int[] i = { 1, 5, 1, 1, 1, 10, 15, 20, 100 };
		System.out.println(change.nonConstructibleChange(i));
		;

	}

}
