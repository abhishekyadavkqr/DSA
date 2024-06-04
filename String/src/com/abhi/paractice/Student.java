package com.abhi.paractice;

public class Student {
		private int rollNo,  marks ;
	private	String name, city;
		private final int x= 100;
		
		public void setRollNo(int roll) {
			rollNo = roll;
		}
		public int getRollNo() {
			return rollNo;
		}
		public  void setMarks(int mark) {
			marks = mark;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setCity(String city) {
			this.city= city;
		}

		
		public int getMarks() {
			return marks;
		}
		public String getName() {
			return name;
		}
		public String getCity() {
			return city;
		}
		
		public String tOString() {
		return rollNo+" "+ name+" "+city+" "+marks;
		}
}
