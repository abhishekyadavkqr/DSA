package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CircularArray {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);
//		li.add(9);
//		li.add(10);
//		li.add(11);
//		li.add(12);
		int n=0, round =0;
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter the round ");
//		round = sc.nextInt();
		
//		System.out.println(li+"\nsize :: "+li.size());
		if(n% li.size() ==0) {
//			System.out.println(li);
//				return;
		}
		
		else if(n% li.size() !=0)
			round = n%li.size();
		
		int x = 100000% 82792;
		
		System.out.println("% = "+(x));
//		System.out.println(round);
//		Circular(li, round);
		

	}
	static  List<Integer> Circular(List<Integer> li, int round){
		
		int i =0;
		int x =0;
		int y =0;
		int z =0;
		int s= li.size();
			System.out.println(li);
			
			for(int k =0; k<round;k++) {
		for (i=0;i<s;i++){
		 	if(i==0) {
				x=li.get(i);
				y = li.get(i+1);
				z=y;
		 	continue;
		 	}
		 	z=y;
		 	if(i<(s-1)) 
		 		y = li.get(i+1);
		 	if(i==(s-1)) 
		 		li.set(0, z);
		 	
				li.set(i, x);
				x=z;
		}
			x =y =z= 0;	
			System.out.println(li+"\nround :: "+k);
		}
		return li;
	}
}
