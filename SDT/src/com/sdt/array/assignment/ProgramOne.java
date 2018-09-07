package com.sdt.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

//Sort Array in Ascending Order, Print Before, During Swaps and After finished

public class ProgramOne {
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

		int count = 1;
		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					System.out.println(count + " swap: " + Arrays.toString(array));
					count++;
				}
			}
		}
		count = 0;
		System.out.println("Sorted array is: " + Arrays.toString(array));
		sc.close();
	}
}
