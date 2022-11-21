package com.mirrorpattern;

import java.util.Scanner;

public class IsocelesPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
// spaces
		int i = 1;
		while (i <= n) {
			int spaces = 1;
			while (spaces <= n - i) {
				System.out.print(" ");
				spaces++;
			}
			
// increasing num
			int j = 1;
			int p = 1;
			while (j <= i) {
				System.out.print(p);
				j++;
				p++;
			}
// decreasing num
			p = i - 1;
			j = 1;
			while (j <= i - 1) {
				System.out.print(p);
				p--;
				j++;
			}

			System.out.println();
			i++;
		}

		sc.close();
	}

}
