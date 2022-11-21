package com.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_number_sum2 {

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

		List<Integer[]> list = new ArrayList<Integer[]>();
		Arrays.sort(array);

		for (int i = 0; i < array.length - 2; i++) {
			int right = array.length - 1;
			int left = i + 1;

			while (array[left] < array[right]) {
				int sum = array[i] + array[left] + array[right];

				if (sum == targetSum) {
					Integer[] select = new Integer[3];
					select[0] = array[i];
					select[1] = array[left];
					select[2] = array[right];
					list.add(select);
					left++;
					right--;
				}
				else if (sum < targetSum)
				{
					left++;
				}
				else if (sum > targetSum)
				{
					right--;
				}
				

			}

		}

		return list;
	}


	public static void main(String[] args) {

		int[] i1 = { 12, 3, 1, 2, -6, 5, 0, -8, -1, 6, -5 };
		List<Integer[]> list = Three_number_sum2.threeNumberSum(i1, 0);
	}

}
