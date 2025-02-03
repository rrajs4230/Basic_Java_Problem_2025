package com.core.java;

public class BankAccount {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws IllegalArgumentException{
		
		if(balance<0)
		
			throw new IllegalArgumentException("Do Enter -ve Value");
		
		if(balance ==0)
			
			throw new IllegalArgumentException("Do Enter 0 Value");
		
		this.balance = balance;
	}

	

	
	
	

}
