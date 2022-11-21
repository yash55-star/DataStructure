package com.stringExp;

public class PrintAllSubString {

	public static void printSubstrings(String str) {

		for (int startindex = 0; startindex < str.length(); startindex++) {

			System.out.println(str.substring(startindex));
			for (int endindex = startindex+1; endindex < str.length(); endindex++) {
				System.out.println(str.substring(startindex, endindex));
			}

		}
		

	}

	public static void main(String[] args) {
		printSubstrings("abc");
	}

}
