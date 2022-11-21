package com.recurssion;

public class RemoveX {

	// Return the changed string
	public static String removeX(String input) {

		if (input.length() < 1) {
			return input;
		}

		if (input.charAt(0) == 'x' && input.length() > 1) {
			return removeX(input.substring(1, input.length()));
		}

		return input.charAt(0) + removeX(input.substring(1, input.length()));

	}
	
	// Return the changed string
		public static String removeX1(String input) {

			if (input.length()==0) { // base case
				return input;
			}
			String ans = ""; 	
			if (input.charAt(0) != 'x') { // processing steps
				ans = ans + input.charAt(0);
			}
			return ans + removeX1(input.substring(1)); // recurssion

		}


	public static void main(String[] args) {
		System.out.println(removeX1("xpi"));
	}

}
