package com.thread.state;

public class Test01 extends Thread {
	@Override
		public void run() {
			System.out.println("Thread Name :: "+this.getName());
			System.out.println("State From inside run :: "+this.getState());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
public static void main(String[] args) throws InterruptedException {

	System.out.println("main Start...");
	Test01 t1 = new Test01();
	System.out.println("State 1 :: "+ t1.getState());
	t1.start();
	System.out.println("State 2 :: "+ t1.getState());
	Thread.sleep(1000);
	System.out.println("State 3 :: "+ t1.getState());
	
	Thread.sleep(1000);
	System.out.println("State 4 :: "+ t1.getState());
	System.out.println("main End...");
	
}
}
