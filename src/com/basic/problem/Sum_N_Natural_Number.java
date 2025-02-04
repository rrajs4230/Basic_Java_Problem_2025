package com.basic.problem;

import java.util.Scanner;

public class Sum_N_Natural_Number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N Natural Number:");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;  i<=n;  i++) {
			
			sum+=i;
		}
		System.out.println("Sum of N Natural Number is:"+sum);

	}

}
