package com.recurssion.hard;

public class Staircase_problem {

	public static int fib(int n) {

		if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;
 
        else
		return fib(n - 3) + fib(n - 2) + fib(n - 1);

	}

	public static int staircase(int n) {

		return fib(n);

	}

	public static void main(String[] args) {
		System.out.println(staircase(4));
	}

}
