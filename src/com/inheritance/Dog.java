package com.inheritance;

public class Dog extends Animal {

	public Dog(String name) {

		super(name);

	}
	
	public void bark() {
		
		System.out.println(this.name+"is eating");
	}
	
	@Override
   public void sound() {
		
	   System.out.println("Dog bark");
	}

}
