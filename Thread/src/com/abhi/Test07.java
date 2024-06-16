package com.abhi;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("main start...");
		Factory fa = new Factory();
//		fa.setItems(10);
		Producer pr = new Producer(fa);
		Consumer con = new Consumer(fa);
		Thread th = new Thread(pr,"Producer");
		Thread th1 = new Thread(con,"Consumer");
				
		th.start();
		th1.start();
		System.out.println("main end...");
	}

}
