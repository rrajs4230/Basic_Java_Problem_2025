package com.core.java;

public class methodOverriding {

	public static void main(String[] args) {
		
	    User user = new User("Rakesh" ,28);
		User main = new MainProgrammer("Mukesh" ,30, "TCS");
		
		user.display();
		main.display();

	}

}
