package com.pattern.programm;

import java.util.Scanner;

public class Downward_Triangle_Star_Pattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Row:");
		int rowCount = scan.nextInt();

		for (int i = 0; i < rowCount; i++) {

			for (int j = rowCount; j > i; j--) {

				System.out.print("*");

			}
			System.out.println();

		}


	}

}
