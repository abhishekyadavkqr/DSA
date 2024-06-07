package com.abhi.bank;

public class Withdraw extends Thread implements RBI{
	double amount ;

	public Withdraw(double amount) {
		this.amount = amount;
	}
@Override
public void run() {
	withdraw();
}

private void withdraw() {

	this.amount = amount;
	
}

}
