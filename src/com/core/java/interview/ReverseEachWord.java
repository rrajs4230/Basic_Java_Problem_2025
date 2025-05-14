package com.core.java.interview;

public class ReverseEachWord {

	public static void main(String[] args) {

		String input = "java code";
		System.out.println("Original String :: " + input);

		String[] str = input.split(" ");
		String output = "";
		for (String word : str) {

			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {

				revWord = revWord + word.charAt(i);

			}
			
			output=output+revWord+" ";

		}
		
		System.out.println(output);

	}

}
