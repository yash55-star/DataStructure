package com.mirrorpattern;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		int i = 1;
		int totalRows = n * 2 + 1;
		int num = totalRows / 2 + 1;
		System.out.println("*");
		while (i < num) {
			System.out.print("*");

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
			System.out.print("*");

			System.out.println();
			i++;
		}
		i = 1;
		int n1 = num - 1;
		while (i < num - 1) {
			System.out.print("*");
			// increasing num
			int j = 1;
			int p = 1;
			while (j < n1) {
				System.out.print(p);
				j++;
				p++;
			}
			// decreasing num
			int k = j-1;
			p = j-2;
			j = 1;
			while (j < k) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.print("*");
			System.out.println();
			i++;
			n1--;

		}
		System.out.println("*");

		sc.close();
	}

}
