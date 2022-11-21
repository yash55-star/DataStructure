package com.recurssion;

public class ReplaceCharacter {

	public static String replaceCharacter(String input, char c1, char c2) {

		if (input.length() == 0) {
			return input;
		}

		String str = "";
		if (input.charAt(0) == c1) {
			str = str + c2;
		} else {
			str = str + input.charAt(0);
		}

		return str + replaceCharacter(input.substring(1), c1, c2);

	}
	
	public static void main(String[] args) {
		System.out.println(replaceCharacter("abcabc", 'a', 'x'));
	}

}
