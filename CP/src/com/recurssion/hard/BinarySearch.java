package com.recurssion.hard;

public class BinarySearch {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {

		int index = binarySearch(input, 0, input.length-1,element);
		return index;

	}
	
	public static int binarySearch(int a[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(a[midIndex]==x){
            return midIndex;
        }else if(a[midIndex]<x){
            return binarySearch(a,midIndex+1,ei,x);
        }else{
            return binarySearch(a,si,midIndex-1,x);
        }
    }
	
	public static void main(String[] args) {
		
		int[] input = new int[] {2 ,3 ,4 ,5, 6, 8};
		
		System.out.println(binarySearch(input, 8));
	}

}
