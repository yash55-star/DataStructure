package com.stringExp;

public class ReversetheWordString {
	
	
public static String reverseWordWise(String input) {
		
		String output = "";
		String[] strarray = input.split(" ");
		for(int i = 0 ; i < strarray.length ; i++)
		{
			output = strarray[i] +" "+ output;
		}
		
		
		return output;
	}


	public static void main(String[] args) {
		System.out.println(reverseWordWise("Welcome to Coding Ninjas"));
	}

}
