package com.abhi.bank;

public class Bank {
public static void main(String[] args) throws InterruptedException {
	BankAccount b1 = new BankAccount(58841011,500);
	b1.depositer(500);
//	Thread.sleep(5000);
	b1.currentAmount();
}
}
