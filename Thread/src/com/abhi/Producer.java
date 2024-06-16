package com.abhi;


public class Producer implements Runnable{
	Factory fa;
	public Producer(Factory fa) {
		this.fa = fa;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
//				System.out.println("Producer :: "+i);
				fa.produce(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
