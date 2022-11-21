package com.mirrorpattern;

import java.util.Scanner;

public class parallalogramPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		System.out.println("*");
		while (i <= n) {

			int j = 1;
			while (j < i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while (j <= n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		sc.close();
	}

}
