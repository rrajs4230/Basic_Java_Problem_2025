package com.core.java;

public class User {// Base

	String name;
	int age;

	public User(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void display() {

		System.out.println("Name:" + name);
		System.out.println("Age:" + age);

	}

}
