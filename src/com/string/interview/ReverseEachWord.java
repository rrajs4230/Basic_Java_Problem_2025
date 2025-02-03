package com.string.interview;

public class ReverseEachWord {

	public static void main(String[] args) {

		String input = "java code";
		System.out.println("Original String :: " + input);

		String[] words = input.split(" ");
		String output = "";
		for (String str : words) {
			String revWord = "";
			for (int i = str.length() - 1; i >= 0; i--) {

				revWord = revWord + str.charAt(i);

			}

			output = output + revWord + " ";

		}

		System.out.print(output);

	}

}
