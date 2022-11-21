package com.stringExp;

public class RemoveAllOccurrencesOfCharTest {

	public static String removeAllOccurrencesOfChar(String str, char ch) {

		String[] s1 = str.split("");
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ch)
			output += s1[i];
		}

		return output;
	}

	public static void main(String[] args) {
		System.out.println(removeAllOccurrencesOfChar("aabccbaa", 'a'));
	}

}
