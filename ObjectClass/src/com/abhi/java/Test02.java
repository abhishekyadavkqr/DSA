package com.abhi.java;

public class Test02 implements Cloneable{

	int sno;
	String name ;
	A1  a1 = new A1();
	public Test02( int s, String name) {
		this.name= name;
		this.sno = sno;
			}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Test02 t1 = new Test02(1001, "Abhishek");
		System.out.println(t1.a1);
		Test02 t2 ;
		t2= (Test02)t1.clone();
		System.out.println(t1.a1 == t2.a1);
	}
}
