package com.recurssion;

public class CheckNumber {

	public static boolean checkNumber(int input[], int x) {

		if (input.length <= 0) {
			return false;
		}

		if (input[input.length - 1] == x) {
			return true;
		}
		int[] smallarray = new int[input.length - 1]; // n-1 array
		for (int i = 0; i < input.length - 1; i++) {
			smallarray[i] = input[i];
		}

		boolean check = checkNumber(smallarray, x);
		return check;

	}
	
	public static void main(String[] args) {
		int[] p = {9 ,8 ,10};
		checkNumber(p,8);
		
		
	}

}
