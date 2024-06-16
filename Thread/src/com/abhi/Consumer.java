package com.abhi;

public class Consumer implements Runnable{
	Factory fa;
	public  Consumer(Factory fa) {
		this.fa = fa;
	}
	
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
//				System.out.println("Consumer :: " +i);
				fa.consume(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
