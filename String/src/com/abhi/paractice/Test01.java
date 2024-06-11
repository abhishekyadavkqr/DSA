package com.abhi.paractice;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test01 {
	static Scanner sc= null;

	public static void main(String[] args) {
		
		try{
			sc = new Scanner(System.in);
			String[] s = {"abc", "xyz", "a","bbc","b","a","b"}; 
//			prj1();
//			prj2();
//			prj3();

//			prj4();
//			prj5();
//			prj6();
//			prj7();
			
//			
//			for (String string : prj8(s)) {
//				System.out.println(string);
//			}
			
//				System.out.println(duplicate(s));
			
//			prj7();
//			
//			Student st = new Student();
//			Class<?> cls = st.getClass();
//			Field fld = cls.getDeclaredField("x");
//			fld.setAccessible(true);	
//			Object ob = fld.get(st);
//			System.out.println(ob);
//			System.out.println();
//			fld.setInt(st, 50);
//			ob = fld.get(st);
//			System.out.println(ob);
//			
//			Method mt = cls.getDeclaredMethod("getRollNo", null );
//			Method mt1[] = cls.getMethods();
//			System.out.println(mt);
//			Method m = cls.getDeclaredMethod("setRollNo", int.class);
//			m.invoke(st, 1001);
//			System.out.println(mt.invoke(st));
////			System.out.println(mt.getParameterCount());
////			for(Method m : mt1) {
////				System.out.println(m);
////			}
////			
////					
////			System.out.println();
////			System.out.println(con);
//			p9("java Hari");
			p10("java Hzasrfiea");
			
			
	}catch(Exception e) {
		e.printStackTrace();
	}

}
	static void prj1() {
///*	Project 1
		
		System.out.println("Enter Your UserName ::");
		String usn = sc.next();
		if(usn.isEmpty())
			System.out.println("Enter UserName");
		else 
			System.out.println("Welcome...");
//*/
	}
	
	static void prj2() {
///*	 Project 2
	
	System.out.println("Enter Your Name ::");
	String usn = sc.nextLine();
	
	System.out.println(usn +" has " + usn.length() + " characters");
//		 */
	}
	
	static void prj3() {
//		/*	 Project 3
		
		System.out.println("Enter Your Password ::");
		
		String usn =sc.next();
		String res =(usn.length() >=8 && usn.length()<=16)?"":"Password Length must be in between 8,16";
		
		System.out.println(res);
//*/
	
		


	}
	static void prj4() {
///*	 Project 4
	System.out.println("Enter Your Mobile no ::");
			
			String mobNo =sc.next();
			if(mobNo.length() != 10)
				System.out.println("Mobile Number must contain 10 digit");
			else {int x=0;
				for (int i = 0; i < mobNo.length(); i++) {
					if(mobNo.charAt(i)<0 || mobNo.charAt(i)>9)
						x++;
				}
				
				if(x==0)
					System.out.println("Activation Code is sent to your register mobile number");
				else
					System.out.println("mobile number should contain only digit");
			}

	}
	static void prj5() {
///*	 Project 
		System.out.println("Enter Your name ::");
		
		String name =sc.next();
		if(name.length() != 0)
			System.out.println("Hi "+name+"Your name has "+name.length()+" characters.");
		else 
			System.out.println("Name is empty..");
		
	}
	
	static void prj6() {
		Student st  = new Student();
	System.out.println("Enter roll ::");
	 st.setRollNo(sc.nextInt()); ;
	System.out.println("Enter marks ::");
	st.setMarks(sc.nextInt());
	System.out.println("Enter Name ::");
	sc.nextLine();
	st.setName( sc.nextLine()); ;
	
	System.out.println("Enter City ::");
	st.setCity(sc.nextLine());
	
	System.out.println(st);
	}

	static void prj7() {
	
		System.out.println("Enter your username..");
		String usn = sc.next();
		System.out.println("Enter your password..");
		String pswd = sc.next();
		if(usn.compareTo("GabbarSingh")==0 || usn.compareTo("PawanKalyan")==0)
			System.out.println("Valid username or password");
		else
			System.out.println(usn.compareTo("Invalid username or password"));
	}

	static String[] prj8(String[] st) {
		
		if(st.length==0 || st.length==1)
			return st;
		String s = "";
		int length = st.length;
		
		for(int i=0;i<st.length;i++) {
			for(int j =0; j<length; j++)
			{
				if(i==j)
					continue;
				if(st[i].compareTo(st[j])<0) {
					s= st[i];
					st[i] = st[j];
					st[j] = s;
				}
			}
			
		}
		
		System.out.println("Duplicate items are : ");
		System.out.println(duplicate(st)+"\n");
		System.out.println("Sorted elements are : ");;
		return st;
	}
	
	static Object duplicate(String[] st)  {
		
		if(st.length==0 || st.length==1)
		{
			return st;
			}
		Set<String> res = new HashSet<String>();
		String s = "";
		
		for(int i=0; i<st.length;i++)
		{
			s = st[i]; 
			for(int j=0 ; j<st.length;j++) {
				if(i==j)
					continue;
				else if(s.equals(st[j])) {

						res.add(s);
					}
					
				}
					
			
		}
		System.out.println();
	return res;
	}


static void p9(String str) {
	
	if(str.toLowerCase().contains("hari")) {
		String[] s = str.split(" ");
		for (String string : s) {
			 if(string.equalsIgnoreCase("hari")) {
				 System.out.println(string+ " is availabe...");
			 }
		}
		
	}
	else 
		System.out.println("hari is not available");
	
}

 static void p10(String s){
	 int h =0,a=0,r=0,j=0;
	 s=s.toLowerCase();
	 for (int i =0; i<s.length();i++) {
		 if(s.charAt(i)=='h')
			 h++;
		 else if(s.charAt(i)=='a')
			 a++;
		 else if(s.charAt(i)=='r')
			 r++;
		 else if(s.charAt(i)=='i')
			 j++;
	 }
	 if(h!=0 && a!=0 && r!=0 && j!=0)
		 System.out.println("Hari is Available...");
	 else
		 System.out.println("Hari is  Not Available...");
		 
 }

 
}