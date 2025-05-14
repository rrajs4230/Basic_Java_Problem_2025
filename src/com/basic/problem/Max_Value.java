package com.basic.problem;

public class Max_Value {

	public static void main(String[] args) {

      int[]  arr = {5,7,4,9,10,0};
      
       int maxValue=Integer.MIN_VALUE;
       
       for(int i=0; i<arr.length; i++) {
    	   
    	   if(arr[i]<maxValue) {
    		   
    		   maxValue=arr[i];
    	   }
    	    
    	  
       }
       
       System.out.println("MaxValue:"+maxValue);

	}

}
