package com.string.interview;

public class RemoveSpecialchar {

	public static void main(String[] args) {

		String input = "%J$*@*A1VA";

		String plainstr = input.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(plainstr);

	}

}
