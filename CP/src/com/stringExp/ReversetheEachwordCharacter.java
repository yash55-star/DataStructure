package com.stringExp;

public class ReversetheEachwordCharacter {

	public static String reverseEachWord(String str) {

		String answer = "";
		int currentWordStart = 0;
		int i = 0;
		for (; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {

				int currentWordend = i - 1;
				String reverseWord = "";
				for (int j = currentWordStart; j <= currentWordend; j++) {
					reverseWord = str.charAt(j) + reverseWord;
				}

				answer += reverseWord + " ";
				currentWordStart = i+1;
			}
		}
		
		int currentWordend = i - 1;
		String reverseWord = "";
		for (int j = currentWordStart; j <= currentWordend; j++) {
			reverseWord = str.charAt(j) + reverseWord;
		}

		answer += reverseWord ;

		return answer;
	}
	
	public static void main(String[] args) {
		ReversetheEachwordCharacter.reverseEachWord("Welcome to Coding Ninjas");
	}

}
