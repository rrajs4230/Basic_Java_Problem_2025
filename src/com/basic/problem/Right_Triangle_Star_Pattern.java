package com.basic.problem;

import java.util.Scanner;

public class Right_Triangle_Star_Pattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Vlaue of n:");

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
	}

}
