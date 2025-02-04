package com.basic.problem;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of term:");
		int term = scan.nextInt();
		int t1 = 0;
		int t2 = 1;
		int next=0;
		System.out.print("Sum of n term FibonacciSeries:");
		for (int i = 1; i <= term; i++) {
			System.out.print(t1);
			next = t1 + t2;
			t1 = t2;
			t2 = next;
			

		}
		
		
		

	}

}
