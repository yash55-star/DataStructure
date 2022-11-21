package com.recurssion.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintKeyPad {
	
	static Character[][] numberToCharMap;

	private static List<String> printWords(int[] numbers, int len, int numIndex, String s) {
		if (len == numIndex) {
			return new ArrayList<>(Collections.singleton(s));
		}

		List<String> stringList = new ArrayList<>();

		for (int i = 0; i < numberToCharMap[numbers[numIndex]].length; i++) {
			String sCopy = String.copyValueOf(s.toCharArray());
			sCopy = sCopy.concat(numberToCharMap[numbers[numIndex]][i].toString());
			stringList.addAll(printWords(numbers, len, numIndex + 1, sCopy));
		}
		return stringList;
	}

	public static void printKeypad(int numbers) {
		generateNumberToCharMap();
		int size = 0;
		int temp = numbers;
		while (numbers > 0) {
			// dividing the number by 10
			numbers = numbers / 10;
			// increments the count variable by 1
			size++;
		}
		int num[] = new int[size];
		while (temp > 0) {
			// finding the remainder
			num[size - 1] = temp % 10;
			temp = temp / 10;
			// decrements the digit by 1
			size--;
		}
		List<String> stringList = printWords(num, num.length, 0, "");
		stringList.stream().forEach(System.out::println);
	}

	private static void generateNumberToCharMap() {
		numberToCharMap = new Character[10][5];
		numberToCharMap[0] = new Character[] { '\0' };
		numberToCharMap[1] = new Character[] { '\0' };
		numberToCharMap[2] = new Character[] { 'a', 'b', 'c' };
		numberToCharMap[3] = new Character[] { 'd', 'e', 'f' };
		numberToCharMap[4] = new Character[] { 'g', 'h', 'i' };
		numberToCharMap[5] = new Character[] { 'j', 'k', 'l' };
		numberToCharMap[6] = new Character[] { 'm', 'n', 'o' };
		numberToCharMap[7] = new Character[] { 'p', 'q', 'r', 's' };
		numberToCharMap[8] = new Character[] { 't', 'u', 'v' };
		numberToCharMap[9] = new Character[] { 'w', 'x', 'y', 'z' };
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		PrintKeyPad.printKeypad(input);
		
	}

}
