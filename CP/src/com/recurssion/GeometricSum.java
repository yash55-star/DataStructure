package com.recurssion;

public class GeometricSum {
	
	
	
	public static double findGeometricSum(int n){
		 // base case
        if (n == 0)
            return 1;
 
        // calculate the sum each time
        double ans = 1 / (double)Math.pow(2, n) + findGeometricSum(n - 1);
 
        // return final answer
        return ans;

	}
	
	public static void main(String[] args) {
		
		
		String s = "pip";
		
		s = s.substring(2,5);
		System.out.println(s);
		System.out.println(findGeometricSum(3));
		
	}

}
