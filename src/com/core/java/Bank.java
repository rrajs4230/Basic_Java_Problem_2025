package com.core.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		BankAccount acc1 = new BankAccount();

		while (true) {

			try {
				System.out.println("Enter Amount:");
				double balance = scan.nextDouble();
				acc1.setBalance(balance);
				System.out.println("current balance:" + acc1.getBalance());
				break;
			} catch (InputMismatchException e) {

				System.out.println("Enter only Number");
				scan.nextLine();
			}

			catch (IllegalArgumentException e) {

				System.out.println(e.getMessage());

			}
		}

	}

}
