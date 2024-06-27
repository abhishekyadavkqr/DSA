package com.abhi.collection;

public class Test {
		private int x;
		private int y;
		 public Test(int x, int y) {
			this.x = x;
			this.y = y;
			}
@Override
		public int hashCode() {
		// TODO Auto-generated method stub
		return x+y;
		}		
@Override
public boolean equals(Object obj) {
	System.out.println("equals mt");
	if(obj instanceof Test t)
		return t.x==this.x && t.y==this.y;
	return false;
}
}
