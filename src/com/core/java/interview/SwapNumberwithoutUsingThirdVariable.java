package com.core.java.interview;

import java.util.Scanner;

public class SwapNumberwithoutUsingThirdVariable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter firstValue:");
		int a = scan.nextInt();
		System.out.print("Enter secondValue:");
		int b = scan.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.print("After Swapping:"+"a:"+a+" "+"b:"+b);

	}

}
