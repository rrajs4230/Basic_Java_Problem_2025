package com.core.java;

class A {

	A() {
          
		System.out.println("Class A NSVs is initialized in " +this+ "object");
	}
}

class B extends A{

	B() {
        
		System.out.println("Class B NSVs is initialized in " +this+ "object");
		
	}

}

public class Test_NoSuperObj {

	public static void main(String[] args) {
		
		B b = new B();

	}

}
