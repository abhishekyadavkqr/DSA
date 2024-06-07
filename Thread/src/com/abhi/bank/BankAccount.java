package com.abhi.bank;

public class BankAccount {
	private  double amount;
	 private long accNo;
	 public BankAccount(long accNo, double amount) {
		this.accNo = accNo;
		this.amount= amount;
		
	}
	    
	 public void deposit(double amount) {
			
			this.amount = amount;
			System.out.println(amount+" are credited to your account "+accNo+".");
	}
	 
}
