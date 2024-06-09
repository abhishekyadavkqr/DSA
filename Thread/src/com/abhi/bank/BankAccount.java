package com.abhi.bank;

public class BankAccount {
	private  double amount;
	 private long accNo;
	 private Deposit depo;
	 private Withdraw wtd;
	 public BankAccount(long accNo, double amount) {
		this.accNo = accNo;
		this.amount= amount;
		
	}
	    public void depositer(double amnt) {
	    	depo = new Deposit(amnt);
	    	depo.start();
	    }
	 private void deposit(double amount) {
			
			this.amount += amount;
			System.out.println(amount+" are credited to your account "+accNo+".");
			currentAmount();
		
	}
	 public void withdraw(double amount) {
		 if(this.amount >= amount) {
			 this.amount -= amount;
			 System.out.println(amount+" are debited from your account "+accNo+".");
		 }
		 else
			 System.out.println("insuffiecient amount in your account "+accNo+".");
		 currentAmount();
	 }
	public void currentAmount(){
		 System.out.println("Total amount in your account no "+accNo+" is "+amount);
	 }
	
	
	
class Deposit extends Thread{
	private double depAmount;
	public Deposit(double amnt) {
		this.depAmount = amnt;
	}
	
	
	@Override
	public void run() {
		System.out.println("Deposit Running");
		deposit(depAmount);
	}
}
class Withdraw extends Thread{
	private double depAmount;
	public Withdraw(double amnt) {
		this.depAmount = amnt;
	}
	
	
	@Override
	public void run() {
		System.out.println("Deposit Running");
		deposit(depAmount);
	}
}
	 
}
