package com.stringExp;

public class CompressedString {

	public static String getCompressedString(String str) {
		String output = "";
		String[] s1 = str.split("");
		int ocuurance = 1;
		char s = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (output.isEmpty()) {
				s = str.charAt(i);
				output += str.charAt(i);
			} else if (s == str.charAt(i)) {
				// output += s1[i];
				ocuurance++;
			} else {
				s = str.charAt(i);
				if(ocuurance>1)
				{
					output += ocuurance;
				}
				else
				{
					output += "";
				}
				output += str.charAt(i);
				ocuurance = 1;
			}
		}
		
		if(ocuurance>1)
		{
			output += ocuurance;
		}
		else
		{
			output += "";
		}

		return output;
	}

	public static void main(String[] args) {
		CompressedString.getCompressedString("aabbb");
	}

}
