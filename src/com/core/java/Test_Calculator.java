package com.core.java;


class MathOperation{
	
 static int add(int a, int b) {
		
		return a+b;
		
	}
	
  static double add(double a, double b) {
		
		return a+b;
		
	}
}

public class Test_Calculator {

	public static void main(String[] args) {
	    
		System.out.println(MathOperation.add(10.30, 23.70));
		
		
		System.out.println(MathOperation.add(100, 70));
		
	}

}
