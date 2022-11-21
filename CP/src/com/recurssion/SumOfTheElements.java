package com.recurssion;

public class SumOfTheElements {

	public static int sum(int input[]) {
		if (input.length <= 0)
			return 0;
		int[] smallarray = new int[input.length - 1]; // n-1 array
		for (int i = 0; i < input.length-1; i++) {
			smallarray[i] = input[i];
		}
		int sum = sum(smallarray) + input[input.length - 1];
		return (sum);

	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 9 };
		System.out.println(sum(arr));
	}
}
