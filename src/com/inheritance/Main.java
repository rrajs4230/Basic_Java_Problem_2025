package com.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog("Dog");
		animals[1] = new Cat("Cat");
		animals[2] = new Animal("animal");
		
	        for(Animal animal :animals) {
	        	
	        	animal.sound();
	        	
	        }
	}

}
