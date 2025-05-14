package com.core.java.interview;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = scanner.nextInt();
		int reverse = 0;
		int palidromeNumber = number;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;

			number = number / 10;
		}

		if (reverse == palidromeNumber) {
			
			System.out.println("Number is Palimdrome");

		}
		else
			System.out.println("Number not is Palimdrome");

	}

}
