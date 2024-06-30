package com.abhi.collection;

import java.util.Comparator;

public class TestComparator implements Comparator<Student> {
@Override
public int compare(Student o1, Student o2) {
		 System.out.println(o1.getX()+"\t\t"+o2.getX());
	return o1.getX()-o2.getX();
}
}
