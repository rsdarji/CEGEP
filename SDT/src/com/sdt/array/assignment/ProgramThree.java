package com.sdt.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Ravi
 * find smallest, biggest, Average & Sum of numbers in array
 *
 */

public class ProgramThree {
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

		int biggestNumber = array[0];
		int smallestNumber = array[0];
		double sum = 0;
		for (int i = 0; i < size; i++) {
			if(array[i]>biggestNumber){
				biggestNumber = array[i];
			}
			if(array[i]<smallestNumber){
				smallestNumber = array[i];
			}
			sum += array[i];
		}
		System.out.println("Biggest number is: "+biggestNumber);
		System.out.println("SmallestNumber number is: "+smallestNumber);
		System.out.println("Sum of all digit of array is: "+sum);
		double average = sum/size;
		System.out.println("Average of array's digit: "+average);
		
		sc.close();
	}
}

