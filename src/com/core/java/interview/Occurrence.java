package com.core.java.interview;

import java.util.HashMap;

import java.util.Map;

public class Occurrence {

	public static void main(String[] args) {

		String str = "Programming";

		char[] chArr = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < chArr.length; i++) {

			if (!map.containsKey(chArr[i])) {

				map.put(chArr[i], 1);

			}

			else {

				int count = map.get(chArr[i]);

				map.put(chArr[i], count + 1);
			}

		}
		
	     System.out.println(map);

	}

}
