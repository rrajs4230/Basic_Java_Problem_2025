package com.core.java.interview;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		
		String str = " j a v a";
		
		str=str.replaceAll("\\s", "");
		
		System.out.println(str);
		

	}

}
