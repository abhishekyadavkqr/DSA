package com.abhi.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParacticeArrayList {
	private static ArrayList<Object> al2=  new ArrayList<Object>();
  public static void main(String[] args) throws NoSuchFieldException, SecurityException {
	ArrayList<Object> al1 ;
	
	al1 = new ArrayList<Object>();
	al1.add("a");
	al1.add(Integer.valueOf(50));
//	al1.add((Integer)61);
//	System.out.println(al1.removeIf(e ->{ if(e instanceof String) return true;
//										else return false;}));
//	System.out.println(al1);
	
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
//	fl.setAccessible(true);
//	System.out.println(fl);
	
		System.out.println();
/*	int[] a = {1,2,3,4};
	
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
	*/
		
		
		
//		al2.add(new StringBuilder("hii"));
//		al2.add(new StringBuilder("hello"));
//		System.out.println(al2);
//		System.out.println(al2.remove(new StringBuilder("hii")));
//		System.out.println(al2);
//		HashMap<Object, Object> h = new HashMap<Object, Object>();
//		h.put(h, al2);
//		System.out.println(h);
		System.out.println();
		
		
		System.out.println(al2.add(new Student(15, 10)));
		
		
//		System.out.println(al2.add(new Student(1, 7)));
//		System.out.println(al2.add(new Student(5, 6)));
//		System.out.println(al2.add(new Student(14, 9)));
		System.out.println(al2.add(new Student(13, 8)));
		System.out.println(al2.add(new Student(13, 8)));
		System.out.println(al2.add(new Student(13, 8)));
		System.out.println(al2.add(new Student(13, 8)));
		System.out.println(al2.add(new Student(12, 5)));
		System.out.println(al2.add(new Student(11, 4)));
		System.out.println(al2.add(new Student(10, 3)));
		System.out.println(al2.add(true));
		System.out.println(al2.add(5));
		System.out.println(al2.add(9.8));
		System.out.println(al2.add(10));
		System.out.println(al2.add(100));
		System.out.println();
		System.out.println(al2);
		System.out.println();
		
//		System.out.println(al2.contains(new Student(2,3)));
		System.out.println(al2.indexOf(5));
		System.out.println(al2.contains(5));
		System.out.println(al2);
		System.out.println(al2.remove(Integer.valueOf(5)));
//		System.out.println(al2.remove(5));
//		System.out.println(al2.remove(new Student(11,4)));
		System.out.println(al2);
			ArrayList<Object> arr = new ArrayList<Object>();
			arr.add(new Student(13, 8));
			arr.add(new Student(12, 5));
			arr.add(new Student(11, 4));
			arr.add(new Student(10, 3));
			System.out.println();
//			System.out.println(al2);
//		System.out.println(al2.retainAll(arr));
		System.out.println(al2.removeAll(arr));
		System.out.println(al2);
		System.out.println(al2.addAll(arr));
//		Object[] ob = al2.toArray();
//		System.out.println(ob);
		System.out.println();
		System.out.println(al2);
  } 
  
public static List<?> getArrayList() throws NoSuchFieldException, SecurityException{
	String[] st= {};	
	main(st);
	return al2;
	
}
}
