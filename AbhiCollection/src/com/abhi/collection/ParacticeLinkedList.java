package com.abhi.collection;

import java.util.LinkedList;
import java.util.List;

public class ParacticeLinkedList {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		LinkedList<Object>  linkList = new LinkedList<Object>();
		linkList.add("a");
		
		List<?> li =ParacticeArrayList.getArrayList();
		linkList.addAll(li);
		
		
		System.out.println("LinkList:\t" + linkList);
	}
}
