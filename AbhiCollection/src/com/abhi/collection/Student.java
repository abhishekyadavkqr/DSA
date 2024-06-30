package com.abhi.collection;

public class Student implements Comparable<Student>{
	private int x;
	private int y;
		public Student(int x, int y) {
				this.x = x;
				this.y = y;
				
		}
		
		
		@Override
		public int hashCode() {
			return (x-y);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student st )
			{
//				System.out.println(this.x +" equals "+st.x);
				return (this.x == st.x)&&( this.y == st.y);
			}
			return false;
		}

		@Override
		public String toString() {
			return  this.getClass().getSimpleName()	+"("+x+","+ y+")"  ;
		}


		@Override
		public int compareTo(Student st) {
			System.out.println(this.x+"\t\t"+st.x +"\t="+(this.x-st.x));
			return this.x-st.x;
		}


		
		
		public int getX() {
			return x;
		}


		public int getY() {
			return y;
		}


		
		
		
		

}
