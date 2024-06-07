package com.abhi;

class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 20; i > 0; i--) {
		System.out.println(i+"\tMyThread");	
		}
	}
}


public class Test02 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i+"\tTest02");	
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("main start");
		Test02 t1 = new Test02();
		MyThread mt1 = new MyThread();
		t1.start();	
	    mt1.start();	
	System.out.println("main end");
	
	}
}
