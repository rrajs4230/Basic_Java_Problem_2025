package com.core.java.interview;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int reverse = 0;

        
        while (number != 0) {
            int remainder = number % 10; 
            reverse = reverse * 10 + remainder;
           
            number = number / 10; 
        }

        System.out.println("After reverse: " + reverse);
        
        
        scanner.close();
    }
}