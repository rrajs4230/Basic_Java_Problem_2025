package com.basic.problem;

public class Duplicate_arr {

	public static void main(String[] args) {

		int[] arr = { 5, 18, 7, 7, 10, 0 };

		int dupValue = 0;

		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==arr[i+1]) {
				
				dupValue=arr[i];
				   break;
			}
			
		}
		
            System.out.println("Duplicate Value:"+dupValue);
	}

}
