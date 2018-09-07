package com.sdt.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Ravi Find duplicate number in Array
 */
public class ProgramTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter size of array: ");
		int size = sc.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			sc = new Scanner(System.in);
			System.out.print("Please enter array[" + i + "] value");
			int value = sc.nextInt();
			array[i] = value;
		}
		System.out.println("Input array is: " + Arrays.toString(array));
		int[] duplicateArray = new int[size / 2];
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j] && !existInDuplicateArray(array[i], duplicateArray)) {
					flag = true;
					System.out.println("Duplicate number is: " + array[i]);
					duplicateArray[count] = array[i];
					count++;
				}
			}
		}
		if (!flag) {
			System.out.println("No duplicate number available");
		}
		sc.close();
	}

	static boolean existInDuplicateArray(int currentIndexValue, int[] duplicateArray) {
		boolean flag = false;
		for (int a : duplicateArray) {
			if (a == currentIndexValue) {
				flag = true;
			}
		}

		return flag;

	}
}
