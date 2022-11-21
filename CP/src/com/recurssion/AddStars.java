	package com.recurssion;

public class AddStars {

	// Return the changed string
	public static String addStars(String input) {

		if (input.length() <= 1) {
			return input;
		}

		if (input.length() >= 2 && input.charAt(0) == input.charAt(1)) {
			return input.charAt(0) + "*" + addStars(input.substring(1, input.length()));
		}

		return input.charAt(0) + addStars(input.substring(1, input.length()));

	}

	public static void main(String[] args) {
		System.out.println(addStars("aaaa"));
	}

}
