package com.basic.problem;

import java.util.Scanner;

public class GenerateTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Table Number:");
		
	    int n =scan.nextInt();
	    
	    generateTable(n);
		

	}
	
	public static void  generateTable(int n){
		
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n+"*"+i+"="+(n*i));
			
			
		}
		
		
	}

}
