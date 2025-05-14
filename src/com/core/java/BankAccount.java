package com.core.java;

public class BankAccount {

	private double balance;

	public void setBalance(double balance) {

		if (balance == 0) {

			throw new IllegalArgumentException("Do not pass Zero");
		}

		if (balance < 0) {

			throw new IllegalArgumentException("Do not pass Negative Amount");
		}

		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;

	}

}
