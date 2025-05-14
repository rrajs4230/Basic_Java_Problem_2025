package com.string.interview;

import java.util.HashMap;
import java.util.Map;

public class OccurenceChar {

	public static void main(String[] args) {

		String input = "llllllo";

		System.out.println("Input value:" + input);

		Map<Character, Integer> map = new HashMap<>();

		char[] chArr = input.toCharArray();

		for (char ch : chArr) {

			if (!map.containsKey(ch)) {

				map.put(ch, 1);

			}
			else {
			      int count = map.get(ch);
			      map.put(ch, count+1);
			      
			}

		}
		
		for(Character key : map.keySet()) {
     	   
     	   System.out.println(key + ":" +map.get(key));
     	   
        }
		
	         

	}

}
