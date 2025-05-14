package com.basic.problem;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {

		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		arr = sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp) {
				
				  arr[j+1]  = arr[j];
				  
				  j--;
				
			}
			
			arr[j+1]=temp;

		}

		return arr;
	}

}
