package com.core.java;


class Animal {
	
	void makesound() {System.out.println("Animal male sound");}
	
	
	
}

class Dog extends Animal{
	
	void makesound() {System.out.println("bark");}
	
}

class Cow extends Animal{
	
	void makesound() {System.out.println("booww");}
}






public class Test01_Animal {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		dog.makesound();
	
	}

}
