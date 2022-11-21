package com.characterPattern;

import java.util.Scanner;

public class AlphaPattern {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		
		while(i<=n)
		{
			int j=1;
			char statingpoint = (char)('A' + i -1);
			while(j <= i)
			{
				System.out.print(statingpoint);
				statingpoint = (char)(statingpoint+1);
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();
		
	}

}
