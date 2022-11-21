package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);l.add(2);l.add(3);l.add(4);l.add(5);l.add(6);
		reverseArray.reverseArray(l, 3);
		
	}
	
	public static void reverseArray(ArrayList<Integer> arr, int m)
    {
		List<Integer> l1 = arr.subList(0, m+1);
		List<Integer> l2 = arr.subList(m+1, arr.size());
		Collections.sort(l2,Collections.reverseOrder());
		l1.addAll(l2);
		
		for(Integer i : l1)
		{
			
			System.out.print(i+" ");
		}
		
		
    }

}
