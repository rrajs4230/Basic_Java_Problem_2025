package com.basic.problem;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Vlaue of n:");

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <n-i-1; j++) {

				System.out.print(" ");

			}

			for (int k = 0; k <= i * 1 + i; k++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
