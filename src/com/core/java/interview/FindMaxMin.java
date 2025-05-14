package com.core.java.interview;

public class FindMaxMin {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 40, 10, 20 };

		int maX = Integer.MIN_VALUE;
		int miN = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]>maX) {
				
				maX =arr[i];
			}
			if(arr[i]<miN) {
				
				miN=arr[i];
			}
			
			
			
		}
		System.out.println(maX);
		System.out.println(miN);

	}

}
