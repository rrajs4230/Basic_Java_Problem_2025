package com.core.java.interview;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int numberOfTerms = scanner.nextInt();

   
        int first = 0;
        int second = 1;

        
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(first + " ");
            int next = first + second; 
            first = second;
            second = next; 
        }

        
        scanner.close();
    }
}