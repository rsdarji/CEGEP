package com.sdt.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Ravi
 * Add +1 to Even Positions. Add +2 to Odd Position. Position 0 is ignored.
 */
public class ProgramFive {
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

		for(int i=1;i<size;i++){
			if(i%2==1){
				//odd add +2
				array[i]=array[i]+2;
			}else if(i%2==0){
				//even add +1
				array[i]=array[i]+1;
			}
		}
		System.out.println("After operation Array is: "+Arrays.toString(array));
		sc.close();
	}
}
