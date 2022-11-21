package com.mirrorpattern;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {

			int j = 1;
			while (j <= i) {
				System.out.print(j);
				if(j!=i)
				{
					System.out.print("+");
				}
				j++;
			}
			int k =1;
			int o = 0;
			while(k<=(j-1))
			{
				o = o + k;
				k++;
			}
			System.out.print("="+o);
			System.out.println();
			i++;
		}

		sc.close();
	}

}
