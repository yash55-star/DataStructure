package com.mirrorpattern;

import java.util.Scanner;

public class invertedTrianglePattern4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = n;
			int num = n-i+1;
			while (j>=i) {
				System.out.print(num);
				j--;
			}
			/*
			 * j = 1; while (j <= i) { System.out.print(" "); j++; }
			 */
			System.out.println();
			i++;
		}

		sc.close();

	}
}
