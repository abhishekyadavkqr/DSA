package com.abhi.iterater;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class AbhiIterator {
	public static void main(String[] args) {
		
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(10);
		i1.add(12);
		i1.add(13);
		i1.add(14);
		i1.add(15);
		
		System.out.println("By the help of Iterator...");
		Iterator<Integer> it = i1.iterator();
		it.forEachRemaining((p)->{System.out.println(p+" ");});

		System.out.println("By the help of SplIterator...");
//		Spliterator<Integer> it1 = (Spliterator<Integer>) i1.iterator();
//		it1.forEachRemaining((p)->{System.out.println(p+" ");});
		
	}

}
