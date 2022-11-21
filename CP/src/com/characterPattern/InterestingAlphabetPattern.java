package com.characterPattern;

import java.util.Scanner;

public class InterestingAlphabetPattern {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		char startingpoint = (char)((n-1)+65);
		while(i<=n)
		{
			int j=1;
			char printc = startingpoint;
			while(j <= i)
			{
				
				System.out.print(printc);
				printc = (char)(printc+1);
				j++;
			}
			startingpoint = (char)(startingpoint-1);
			System.out.println();
			i++;
		}
		sc.close();
		
	}

}
