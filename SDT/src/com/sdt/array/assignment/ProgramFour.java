package com.sdt.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramFour {
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

		
		for(int i=0;i<size/2;i++){
			int temp = array[i];
			array[i]=array[size-(i+1)];
			array[size-(i+1)]=temp;
		}
		System.out.println("Reverse array is: "+Arrays.toString(array));
		sc.close();
	}
}
