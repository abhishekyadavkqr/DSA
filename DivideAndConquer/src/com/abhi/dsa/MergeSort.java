package com.abhi.dsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>() ;
		li.add(15);
		li.add(5);
		li.add(56);
		li.add(50);
		li.add(75);
		li.add(55);
		li.add(65);
		li.add(45);
		System.out.println(divide(li, 0, li.size()-1));
	}
	
	static List<Integer> mergeSort(List<Integer> li, int index,int mid, int len){
				
			List<Integer> merge = new ArrayList<>();
		int index1 =index, index2 =mid+1;
		int x =0;
		while(index1 <=mid && index2<=len) {
			if(li.get(index1)<= li.get(index2)){
				merge.add(x++,li.get(index1++));				
			}
			else {
				merge.add(x++,li.get(index2++));
			}
		}
		while(index1 <=mid) {
			merge.add(x++,li.get(index1++));
		}
		while(index2<=len) {
			merge.add(x++,li.get(index2++));
		}
		for(int i =0, j=index;i<merge.size();i++,j++)
			li.set(j,merge.get(i));
		
		return li;
	}
	
	
	
	
	
	static List<Integer> divide(List<Integer> li, int index, int len){
		
		if(index >= len)
			 return li;
		int center = index +(len - index)/2;
		divide(li,index,center);
		divide(li,center+1,len);
		return 
				mergeSort(li, index, center, len);
	}
	
}
