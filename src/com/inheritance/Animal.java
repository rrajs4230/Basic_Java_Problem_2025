package com.inheritance;

public class Animal {
	
	protected String name;

	public Animal(String name) {
	
		this.name = name;
	}
	
	public void eating() {
		
		System.out.println(name+"is eating");
	}
	
	
	public void sound() {
		
		System.out.println("Animal makes Sound");
	}

}
