package com.basic.problem;

public class Sum_Array {

	public static void main(String[] args) {
		
		int[] arr = {2,5,6,7,3,7,0};
		int sum=0;
		
		for(int i: arr) {
			
			sum+=i;
		}
          
		System.out.println(sum);
	}

}
