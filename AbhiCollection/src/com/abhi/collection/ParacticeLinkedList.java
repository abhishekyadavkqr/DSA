package com.abhi.collection;

import java.util.LinkedList;
import java.util.List;

public class ParacticeLinkedList {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		LinkedList<Object>  linkList = new LinkedList<Object>();
		linkList.add("a");
		
		List<?> li =ParacticeArrayList.getArrayList();
		linkList.addAll(li);
		String st = "this is updated..";

		
		linkList.set(5,"this is updated..");
		int x = linkList.indexOf(st);
		x = x>=0?x:0;
//		System.out.println(linkList.remove(st));
		System.out.println(linkList.set(x ,"hello"));
		System.out.println("LinkList:\t" + linkList);
	}
}
