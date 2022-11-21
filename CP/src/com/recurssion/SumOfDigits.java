package com.recurssion;

public class SumOfDigits {

	public static int sumOfDigits(int input) {
		return findSumOfDigits(input, 0);

	}

	public static int findSumOfDigits(int input, int count) {

		int small = input % 10;
		count = small + count;
		int large = input / 10;
		if (large == 0)
			return count;
		return findSumOfDigits(large, count);

	}
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));
	}

}
