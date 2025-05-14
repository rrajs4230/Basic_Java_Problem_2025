package com.core.java.interview;

public class RemoveSpacialchar {

	public static void main(String[] args) {
		
		String input = "%J$*@*A1VA";
		
		String plainString =input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainString );

	}

}
