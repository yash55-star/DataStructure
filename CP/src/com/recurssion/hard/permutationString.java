package com.recurssion.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class permutationString {
	
	
	static List<String> permute(String s , String ans)
	{   
	    if (s.length() == 0)
	    {
	        System.out.print(ans + "  ");
	        return new ArrayList<>(Collections.singleton(ans));
	    }
	    List<String> stringList = new ArrayList<>();
	    for(int i = 0 ;i < s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        String left_substr = s.substring(0, i);
	        String right_substr = s.substring(i + 1);
	        String rest = left_substr + right_substr;
	        stringList.addAll(permute(rest, ans + ch));
	    }
	    return stringList;
	   
	}
	  
	// Driver code
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
	    String s;
	     String ans = ""; 
	    System.out.print("Enter the string : ");
	    s = scan.next();
	    String a = "";
	    String[] s1 = permute(s,ans).toArray(new String[0]);
	    System.out.print("\nAll possible strings are : " + s1);
	}

}
