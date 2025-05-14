package com.pattern.programm;

import java.util.Scanner;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rowCount = scan.nextInt();

        for (int i = 0; i < rowCount; i++) {
            // Print spaces
            for (int j = rowCount - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scan.close();
    }
}