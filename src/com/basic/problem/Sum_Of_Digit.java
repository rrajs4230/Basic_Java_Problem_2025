package com.basic.problem;

import java.util.Scanner;

public class Sum_Of_Digit {

	public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the Digit:");
            int digit = scan.nextInt();
            int sum=0;
            
            while(digit!=0) {
            int lastdigit = digit%10;
            sum = sum+lastdigit;
            digit = digit/10;
            
	}
            
            System.out.println("Sum of Digit:"+sum);
	}

}
