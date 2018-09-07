package com.sdt.array.assignment;

import java.util.Scanner;

/**
 * 
 * @author Ravi
 * Ask the user for a word. Say if the word is a palindrome or not.
 */
public class ProgramSix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = sc.nextLine();
		String reverseWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + word.charAt(i);
		}
		if(word.equalsIgnoreCase(reverseWord)){
			System.out.println("word is palindrome");
		}else{
			System.out.println("word is not a palindrome");
		}
		sc.close();
	}
}
