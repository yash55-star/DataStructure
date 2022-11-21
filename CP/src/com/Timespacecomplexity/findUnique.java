package com.Timespacecomplexity;

public class findUnique {
	
	public static int findUnique(int[] arr) {
		//Your code goes here
        return printDistinct(arr,arr.length);
	}
    
    static int printDistinct(int arr[], int n)
    {
    	int ans = 0;
        // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
     
            // If not printed earlier,
            // then print it
            if (i == j)
            	ans =  arr[i];
        }
        return ans;
    }

}
