package com.abhi;
// Develop a program to change the name and priority of the main thread 
class A{
	public static void m1() {
		Thread th = Thread.currentThread();
		String name = th.getName();
		System.out.println("M1() is called from "+name+" thread" );
	}
}

public class Test06 {

	
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println("Priority of running "+th.getName()+ " thread is "+th.getPriority() );
		System.out.println("changing the name  "+th.getName() +" to  Hii Sweety and Priority also be change");
		th.setPriority(2);
		th.setName("Hii Sweety ");
		System.out.println();
		System.out.println();
		System.out.println("Priority of running "+th.getName()+ " thread is "+th.getPriority() );
		A.m1();

	}
	
}

class Mythread01 extends Thread{
	@Override
	public void run() {
	
	}
}
