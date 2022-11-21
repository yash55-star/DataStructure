package com.recurssion;

public class RemoveDuplicatesRecurssivly {

	public static String removeConsecutiveDuplicates(String input) {

		if (input.length() <= 1) {
			return input;
		}

		if (input.charAt(0) == input.charAt(1)) {
			return removeConsecutiveDuplicates(input.substring(1, input.length()));
		} else {

			return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1, input.length()));
		}

	}

	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("aabccba"));
	}

}
