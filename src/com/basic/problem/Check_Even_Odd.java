package com.basic.problem;

import java.util.Scanner;

public class Check_Even_Odd {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the +ve number:");
		int n=scan.nextInt();
		
		if(n!=0) {
			
		 if(n%2==0) {
			 
			 System.out.println(n +" is Even Number");
		 }
		 else
		 System.out.println(n +" is ODD Number");
		 
		} 
		else
		System.out.println("0 Not Allowed");
		
		
		
	}

}
