package com.recurssion;

public class MultiplyTwoIntegers {
	
	
	
	public static int multiplyTwoIntegers(int m, int n){
		
		if(m == 0) // base cond
		{
			return 0;
		}
		
		return multiplyTwoIntegers(m-1, n) + n; // recurssion
		
		
	
	}
	
	public static void main(String[] args) {
		System.out.println(multiplyTwoIntegers(3, 5));
		
	}

}
