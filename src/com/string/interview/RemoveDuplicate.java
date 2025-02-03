package com.string.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		/*
		 * Using Java 8 Using indexOf() Using charachter Array Using set Interface
		 * method
		 */

		String str = "programming";

		// Approach-1

		StringBuilder sbuilder = new StringBuilder();

		str.chars().distinct().forEach(c -> sbuilder.append((char) c));

		System.out.println(sbuilder);

		// Approach-2

		System.out.println();

		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			int index = str.indexOf(ch, i + 1);

			if (index == -1) {

				sb2.append(ch);
			}

		}

		System.out.println(sb2);

		// Approach-3
		System.out.println();
		char[] chArr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();

		for (int i = 0; i < chArr.length; i++) {

			boolean b = false;

			for (int j = i + 1; j < chArr.length; j++) {

				if (chArr[i] == chArr[j]) {

					b = true;

					break;

				}

			}

			if (!b) {

				sb3.append(chArr[i]);

			}

		}

		System.out.println(sb3);

		// Approach-4

		StringBuilder sb4 = new StringBuilder();

		Set<Character> set = new LinkedHashSet();

		for (int i = 0; i < str.length(); i++) {

			set.add(str.charAt(i));

		}

		for (Character c : set) {

			sb4.append(c);

		}

		System.out.println(sb4);

	}

}
