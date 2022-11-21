package com.recurssion;

public class ConvertStringToInt {

	// Return the changed string
	public static int convertStringToInt(String input) {

		return inputconvertStringToInt(input, 0);

	}

	private static int inputconvertStringToInt(String input, int x) {
		if (input.length() == 1) {
			x = (x * 10) + Integer.parseInt(input.substring(0, 1));
			return x;
		} else {
			x = (x * 10) + Integer.parseInt(input.substring(0, 1));
			return inputconvertStringToInt(input.substring(1, input.length()), x);

		}
	}

	public static void main(String[] args) {
		System.out.println(convertStringToInt("0001234"));
	}

}
