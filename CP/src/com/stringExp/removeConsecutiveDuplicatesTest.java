package com.stringExp;

public class removeConsecutiveDuplicatesTest {
	
	public static String removeConsecutiveDuplicates(String str) {
		
		String output = "";
		String[] s1 = str.split("");
		for(int i = 0 ; i < str.length() ; i++ )
		{
			if(output.isEmpty() || output.charAt(output.length()-1) != str.charAt(i))
			{
				output +=  s1[i];
			}
		}
		
		return output;
	}

	
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("aabccbaa"));
	}

}
