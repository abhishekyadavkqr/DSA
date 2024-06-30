package com.abhi.collection;
/*
 * Develop a program to find the number of occurrences of each 
 * element available in array
 */

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test01CountingNumberOfOccurrences {
	public static void main(String[] args) {
//		ArrayList<Integer> i1 = new ArrayList<Integer>();
//		i1.add(Integer.valueOf(123));
//		i1.add(Integer.valueOf(123));
//		i1.add(Integer.valueOf(345));
//		i1.add(Integer.valueOf(345));
//		i1.add(Integer.valueOf(786));
//		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(i1);
//		for (Integer integer : hs) {
//			int count =0;
//			for (Integer integer2 : i1) {
//				if(integer.equals(integer2))
//					count++;
//			}
//			System.out.println(integer +" occurrence "+count+" time");
//			
//		}
		
		Vector<String> v  = new Vector<String>();
		v.add("a");
		v.add("ab");
		v.add("abc");
		v.add("abcd");
		v.add("abcde");
		v.add("abcdef");
		v.add("abcdefg");
		
		Enumeration<String> e = v.elements();
		String s ="";
		while(e.hasMoreElements()) {
			System.out.println(s);
			if(s.length()>4)
				v.remove(s);
			s = e.nextElement();
		}
		System.out.println(v);
	}
}
