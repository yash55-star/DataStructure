package com.recurssion;

public class CountZeros {
	
	public static int countZerosRec(int input){
		return findcountZerosRec(input, 0);
	}

	public static int findcountZerosRec(int input, int count) {

		int small = input % 10;
		if (small == 0)
			count++;
		int large = input / 10;
		if (large == 0)
			return count;
		return findcountZerosRec(large, count);
	}

	public static void main(String[] args) {

		System.out.println(countZerosRec(0));

	}

}
