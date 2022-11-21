package com.mirrorpattern;

import java.util.Scanner;

public class oddSquarPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int i = 1;
		while (i <= rows) {
			int j = i - 1;
			while (j < rows) {
				System.out.print(j * 2 + 1 + "");
				j++;
			}
			int k = 0;
			while (k < i - 1) {
				System.out.print(k * 2 + 1 + "");
				k++;
			}
			System.out.println();
			i++;
		}

		sc.close();
	}

}
