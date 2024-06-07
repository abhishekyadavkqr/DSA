package com.abhi;

class Addition extends Thread{
	@Override
	public void run() {
		int x = 1;
		for (int i = 2; i <=20; i++) {
			x= x+i;
			System.out.println("sum :: "+x);	
		}
	}
}
class Substraction extends Thread{
	@Override
	public void run() {
		int x=1;
		for (int i = 2; i < 20; i++) {
			x = x-1;
			System.out.println("Diff :: "+x);	
		}
	}
}


public class Test03  {
	
	
	
	public static void main(String[] args) {
		System.out.println("main start");
		Addition mt1 = new Addition();	
		Substraction s1 = new Substraction();	
	    mt1.start();	
	    s1.start();	
	System.out.println("main end");
	
	}
}
