package com.core.java.interview;

public class ContainElement {

	public static void main(String[] args) {
		
		int[] arr= {1,10,0,6,8};
		int ele=4;
		boolean isContain=false;
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]==ele) {
				
				isContain=true;
				break;
			}
			
		}
		if(isContain) {
			
			System.out.println(ele+":"+"Contain");
			
		}
		else
		System.out.println(ele+":"+"Not Contain");

	}

}
