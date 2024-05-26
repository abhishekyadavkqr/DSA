package com.abhi.java;

class A implements Cloneable{
	int x,  y;
	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

@SuppressWarnings("removal")
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("Finalize method finally called...");
	super.finalize();
}
	
}
public class Test01 {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize method finally called...");
//		super.finalize();
		}
  public static void main(String[] arg) throws CloneNotSupportedException, InterruptedException {
	  A a1 = new A(10,15);
	  A a2 = new A(25,35);
	  System.out.println(a1);
	  System.out.println(a1==a2);
	  System.out.println(a1.equals(a2));
	  System.out.println(a1.hashCode());
	  Object x =  a1.clone();
	  System.out.println(x);
	  System.gc();
	  Thread.sleep(1000);
	  
  }
}
