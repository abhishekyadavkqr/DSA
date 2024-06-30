package com.abhi.collection.cursor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public class CursorIterator {
	public static void main(String[] args) {
		ArrayList<String> al = 
							new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("AbhiShek Yadav");
		
		Iterator<String> it = al.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 HashSet<Integer> hs = new HashSet<Integer>();
		 hs.add(10);
		 hs.add(20);
		 hs.add(30);
		 hs.add(40);
		 hs.add(50);
		 Iterator<Integer> itr =  hs.iterator();
		 while (itr.hasNext()) {
			 
			System.out.println(itr.next() );
			
			}
		 LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		 lhs.add("a");
		 lhs.add("b");
		 lhs.add("c");
		 lhs.add("d");
		 lhs.add(10);
		 lhs.add(20);
		 lhs.add(30);
		 lhs.add(40);
		 lhs.add(true);
		 lhs.add(false);
		 lhs.add(Double.valueOf(36.5));
		 lhs.add(Double.valueOf(6.5));
		 lhs.add(Double.valueOf(61.5));
		 lhs.add(null);
		 System.out.println(lhs);
		 Iterator<Object> itr1 = lhs.iterator();
		 
		 while (itr1.hasNext()){
			Object obj = itr1.next();
			 if(obj instanceof Integer) {
				itr1.remove();
				}
			if(obj instanceof String s) {
					System.out.println(s.toUpperCase());
		}
			}
		 System.out.println(lhs);
		 
		 
		 
		 
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 
		 al.forEach(System.out::println);
		 System.out.println();
		 HashMap<Object, String> hsm = new HashMap<Object, String>();
		 
		 hsm.put("01", "A");
		 hsm.put("02", "B");
		 hsm.put("03", "C");
		 hsm.put("04", "D");
		 hsm.put("05", "E");
		 hsm.put("06", "F");
		 hsm.put("07", "G");
		 hsm.put("08", "H");
		 System.out.println(hsm);
		 
		Collection<String> arl = hsm.values();
//		 arl.add("hello");
			arl.stream().forEach(System.out::println);
		System.out.println();
		System.out.println(hsm.entrySet());
		
	}
}
