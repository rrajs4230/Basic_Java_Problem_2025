package com.basic.problem;

import java.util.Scanner;

public class Swaping_Two_Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of a:");
		int a = scan.nextInt();
		System.out.print("Enter value of b:");
		int b = scan.nextInt();
		int c = 0;
		
		c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("After swap value of "+"a="+a +" and "+ "b="+ b);
		
		
		
		

	}

}
