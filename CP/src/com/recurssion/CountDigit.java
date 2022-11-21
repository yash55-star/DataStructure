package com.recurssion;

public class CountDigit {

	public static int count(int n) {
		{
			if (n == 0)
				return 0;
			else {

				int small = count(n / 10);
				small++;
				return small;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(CountDigit.count(4));
	}
}
