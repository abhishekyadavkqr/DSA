package com.abhi.test;
class A{ int x =10;}
class B{}
class C{A a = new A();}
public class Test03 extends C implements Cloneable{
public static void main(String[] args) throws CloneNotSupportedException {
	Test03 t1 = new Test03();
	Test03 t2 = (Test03)t1.clone(); 
	System.out.println(t1.a == t2.a);
	System.out.println(t2.a.x);
	t2.a = new A();
	t1.a = new A();
	
	
	System.out.println(t2.a == t1.a);
	
	
}

}
