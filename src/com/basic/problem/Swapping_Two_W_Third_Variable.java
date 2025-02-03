package com.basic.problem;

import java.util.Scanner;

public class Swapping_Two_W_Third_Variable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of a:");
		int a = scan.nextInt();
		System.out.print("Enter value of b:");
		int b = scan.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap value of "+"a="+a +" and "+ "b="+ b);
	}

}
