package com.core.java.interview;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String str = "programming";

		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			int index = str.indexOf(ch, i + 1);
			
			if(index==-1) {
				
				sb2.append(ch);
			}
		}
		
		System.out.println(sb2);

	}

}
