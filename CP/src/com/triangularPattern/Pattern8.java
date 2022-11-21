package com.triangularPattern;

import java.util.Scanner;

public class Pattern8 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n)
		{
			int j=1;
			int k = i;
			while(j <= i)
			{
				System.out.print(k);
				k--;
				j++;
			}
			System.out.println();
			i++;
		}
		
		sc.close();
	}

}
