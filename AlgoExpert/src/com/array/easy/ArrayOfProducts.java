package com.array.easy;

public class ArrayOfProducts {

	public static int[] arrayOfProducts(int[] array) {

		int[] list = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			int next = i + 1;
			int product = 1;
			// left side
			for (int j = i-1; j >= 0; j--) {
				product = product * array[j];
			}
			// right side
			for (int j = next; j < array.length;j++) {
				product = product * array[j];
			}

			list[i] = product;

		}
		
		return list;
	}

	public static void main(String[] args) {
		ArrayOfProducts.arrayOfProducts(new int[] { 5, 1, 4, 2 });
	}

}
