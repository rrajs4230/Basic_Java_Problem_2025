package com.basic.problem;

import java.util.Scanner;

public class Greatest_Of_Three_Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first value:");
		int a = scan.nextInt();
		System.out.print("Enter the 2nd value:");
		int b = scan.nextInt();
		System.out.print("Enter the 3rd value:");
		int c = scan.nextInt();

		if (a > b) {

			if (a > c) {

				System.out.println(a + " is greater");
			} else

				System.out.println(c + " is greater");

		}
		if (b > c) {

			System.out.println(b + " is greater");

		} else

			System.out.println(c + " is greater");

	}

}
