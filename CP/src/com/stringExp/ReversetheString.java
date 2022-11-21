package com.stringExp;

public class ReversetheString {
	
	
	

	public static String countWords(String str) {

		String reverseString = "";
		for(int i= 0; i<str.length();i++)
		{
			reverseString = str.charAt(i) + reverseString;
		}
		return reverseString ;
	}

	public static void main(String[] args) {
		System.out.println(countWords("abcd"));
	}

}
