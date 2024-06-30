package com.abhi.collection;
 
import java.util.HashMap;
import java.util.TreeSet;

public class ParacticeTreeSet {
		public static void main(String[] args) {
			TreeSet<Student> ts1 = new TreeSet<>();
			System.out.println(ts1.add(new Student(1, 0)));
			System.out.println(ts1.add(new Student(5, 0)));
			System.out.println(ts1.add(new Student(2, 0)));
			System.out.println(ts1.add(new Student(4, 0)));
			System.out.println(ts1.add(new Student(3, 0)));
			System.out.println(ts1.add(new Student(10, 0)));
			System.out.println(ts1.add(new Student(7, 0)));
			System.out.println(ts1.add(new Student(6, 0)));
			System.out.println(ts1.add(new Student(9, 0)));
			System.out.println(ts1.add(new Student(8, 0)));
//			System.out.println(ts1.add(null));


			System.out.println();
			
			TreeSet<Student> ts2 = new TreeSet<Student>(new TestComparator());
			 System.out.println(ts2.add(new Student(5, 0)));
			 System.out.println(ts2.add(new Student(7, 0)));
			 System.out.println(ts2.add(new Student(8, 0)));
			 System.out.println(ts2.add(new Student(6, 0)));
			 
			
		}
}
