package com.string.interview;

public class ReverseString {

	public static void main(String[] args) {

		/*
		 * We can Reverse in four ways 1. Using toCharArray() method 2. Using charAt(int
		 * index) method 3. Using java.lang.StringBuffer class provided reverse() method
		 * 4. Using java.lang.StringBuilder class provided reverse() method
		 * 
		 */
		System.out.println("-Approcah1-");
		// Approach-1
		String str = "hello";

		char[] chArr = str.toCharArray();

		for (int i = chArr.length - 1; i >= 0; i--) {

			System.out.print(chArr[i]);

		}
		System.out.println();
		// Approach-2
		System.out.println("-Approach2-");
		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}

		// Approach-3
		System.out.println();
		System.out.println("-Approach3-");
		StringBuffer buf = new StringBuffer(str);
		System.out.println(buf.reverse());

		System.out.println();
		System.out.println("-Approach4-");

		StringBuilder sbuilder = new StringBuilder(str);
		System.out.println(sbuilder.reverse());

	}

}
