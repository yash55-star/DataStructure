package com.mirrorpattern;

import java.util.Scanner;

public class diamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

// spaces
		int i = 1;
		int num = n / 2 + 1;
		while (i <= num) {
			int spaces = 1;
			while (spaces <= num - i) {
				System.out.print(" ");
				spaces++;
			}

// increasing num
			int j = 1;
			int p = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
				p++;
			}

			// decreasing num
			p = i - 1;
			j = 1;
			while (j <= i - 1) {
				System.out.print("*");
				p--;
				j++;
			}

			System.out.println();
			i++;
		}

		i = 1;
		while (i < num) {

			int spaces = 1;
			while (spaces <= i) {
				System.out.print(" ");
				spaces++;
			}

			int j = 1;
			while (j <= (num - spaces + 1)) {
				System.out.print("*");
				j++;
			}

			// decreasing num
			j = 1;
			while (j <= (num - spaces)) {
				System.out.print("*");
				j++;
			}

			System.out.println();
			i++;

		}

		sc.close();
	}

}
