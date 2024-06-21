package com.abhi.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ParacticeArrayList {
  public static void main(String[] args) throws NoSuchFieldException, SecurityException {
	ArrayList<Object> al1 ;
	
	al1 = new ArrayList<Object>();
	al1.add("a");
	al1.add(Integer.valueOf(50));
	al1.add((Integer)61);
	System.out.println(al1.removeIf(e ->{ if(e instanceof String) return true;
										else return false;}));
	System.out.println(al1);
	
	al1.clear();
	System.out.println();
	al1.add("a");
	al1.add("b");
	al1.add("d");
	al1.add(5);
	al1.add(6.5);
	al1.add(true);
	al1.add(null);
	System.out.println();
	Class<?> cl = al1.getClass();
	Field fl = cl.getDeclaredField("DEFAULTCAPACITY_EMPTY_ELEMENTDATA");
//		for(Field f:fl)
//		System.out.println(f);
	fl.setAccessible(true);
	System.out.println(fl);
	
		System.out.println();
	int[] a = {1,2,3,4};
	
	int[] b = new int[a.length+1];
	int x =6, index = 2;
	for(int i =0; i<b.length;i++) {
		if(i< index)
			b[i]= a[i];
		else if(i == index) {
			b[i] = x;
			b[i+1] = a[i];
		}
		else if(i<=a.length-1)
			b[i+1] = a[i];
	}	
	
	for(int i : b)
	System.out.println(i);
}
}
