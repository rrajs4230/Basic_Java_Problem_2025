package com.core.java.interview;

import java.util.Scanner;

public class LeftAngleTrangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Row:");
        
		 int rowCount = scan.nextInt();
		 
		 for (int i = 0; i < rowCount; i++) {
			 
			 for (int j = 0; j <=i; j++) {
				 
				 System.out.print("*");
				
			}
			 System.out.println();
			
		}
		 
		             

	}

}
