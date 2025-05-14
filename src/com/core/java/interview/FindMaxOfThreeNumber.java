package com.core.java.interview;

import java.util.Scanner;

public class FindMaxOfThreeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int a = scanner.nextInt();
		System.out.print("Enter Second Number: ");
		int b = scanner.nextInt();
		System.out.print("Enter Third Number: ");
		int c = scanner.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a + " is greater");
		} else if (b >= c) {
			System.out.println(b + " is greater");
		} else {
			System.out.println(c + " is greater");
		}

		scanner.close();
	}
}