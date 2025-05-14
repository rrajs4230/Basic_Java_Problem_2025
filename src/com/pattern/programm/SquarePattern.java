package com.pattern.programm;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Row:");
		int rowCount = scan.nextInt();

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j <rowCount ; j++) {

				System.out.print("*");

			}
			System.out.println();

		}


	}

}
