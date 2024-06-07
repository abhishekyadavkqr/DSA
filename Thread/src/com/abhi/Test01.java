package com.abhi;


public class Test01 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
		System.out.println("from run");	
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		Test01 t1 = new Test01();
	t1.start();	
	System.out.println("main end");
	
	}
}
