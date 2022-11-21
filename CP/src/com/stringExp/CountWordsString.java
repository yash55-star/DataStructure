package com.stringExp;

public class CountWordsString {

	public static int countWords(String str) {

		if (str.isEmpty()) {

			return 0;
		} else if (str.length() == 1 && str.contains(" ")) {
			return 2;
		}
		String[] s1 = str.split(" ");
		return s1.length;
	}

	public static void main(String[] args) {
		System.out.println(countWords(" "));
	}

}
