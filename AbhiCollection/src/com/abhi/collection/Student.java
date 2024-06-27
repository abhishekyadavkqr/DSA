package com.abhi.collection;

public class Student {
	private int x;
	private int y;
		public Student(int x, int y) {
				this.x = x;
				this.y = y;
				
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
		
		
		

}
