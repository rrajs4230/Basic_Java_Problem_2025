package com.core.java;

public class MainProgrammer extends User{ //Derive Class

	String companyName;
	
	
	public MainProgrammer(String name, int age, String companyName) {
		super(name, age);
		this.companyName=companyName;
		
	}
	
	

	public void display() {

		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("CompanyName:" + companyName);

	}

}
