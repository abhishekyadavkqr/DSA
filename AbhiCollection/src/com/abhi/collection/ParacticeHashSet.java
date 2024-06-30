package com.abhi.collection;

import java.util.HashSet;

public class ParacticeHashSet {

public static void main(String[] args) {
	
	HashSet<Object> hs = new HashSet<Object>();
	
	System.out.println(hs.add(new Student(10,15 )));
	System.out.println(hs.add(new Student(10,15 )));
	System.out.println(hs.add(new Student(10,15 )));
	System.out.println(hs.add(new Student(10,15 )));
	System.out.println(hs.add(new Student(10,15 )));
	System.out.println(hs);
	System.out.println();

	System.out.println(hs.add(10));
	System.out.println(hs.add(null));
	System.out.println(hs.add(15));
	System.out.println(hs.add(true));
	System.out.println(hs.add(9.02));
	System.out.println(hs.add(9.02));
	System.out.println(hs);
	System.out.println();
	
	System.out.println(hs.remove(true));
	System.out.println(hs);
	


}
}

