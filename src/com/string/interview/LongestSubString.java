package com.string.interview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abbc";
		String LongestSubstring = null;
		int LongestSubstringLength=0;
		
		System.out.println("The longest substring:" + LongestSubstring);
		System.out.println("The longest substring Length:" + LongestSubstringLength);
		
		Map<Character , Integer>   map = new HashMap<>();
		
	    char[] charArr = str.toCharArray();
	          
	       
	          for(int i=0; i<charArr.length; i++) {
	        	  
	        	  char ch = charArr[i];
	        	  
	        	  if(!map.containsKey(ch)) {
	        		  
	        		  map.put(ch,i);
	        	  }
	        	  else {
	        		  
	        		 i= map.get(ch);
	        	  }
	        	  
	        	  
	          }
	    	  
	      }
		                   
		
		
	}

}
