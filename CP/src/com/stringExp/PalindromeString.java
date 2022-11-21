package com.stringExp;

public class PalindromeString {

	public static boolean Palindrome(String str) {

		int i = 0;
		int j = str.length()-1;
		
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Palindrome("abba"));
	}

}
