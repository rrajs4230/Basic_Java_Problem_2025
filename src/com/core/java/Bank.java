package com.core.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BankAccount account = new BankAccount();
		
		
		while(true) {
			
		 try {
			System.out.print("Enter account balance:");
				
			 double balance =  scan.nextDouble();
			 
			 account.setBalance(balance);
			 
			 System.out.println("Current Balance:"+ account.getBalance());
			 
			 break;
		} catch (InputMismatchException e) {
			
			System.out.println("----Enter only Number----");
			scan.nextLine();			
			
		}  catch (IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
		}
		
		

		}
		
	}

}
