package com.core.java.interview;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 4, 1, 10 };

        Set<Integer> set = new HashSet<>();
        int duplicate = -1; 

        for (int i = 0; i < arr.length; i++) {
           
            boolean isAdded = set.add(arr[i]);

           
            if (!isAdded) {
                duplicate = arr[i]; 
                break; 
            }
        }

        if (duplicate != -1) {
            System.out.println("Duplicate Number: " + duplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}