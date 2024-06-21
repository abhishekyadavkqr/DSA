package com.abhi.fis;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class t {
public static void main(String[] args) throws IOException {
	Properties properties= new Properties();
	
	Object ob = new Object();
	if(ob instanceof String s1)
		System.out.println();
	
	ArrayList<Object> al = new ArrayList<Object>();
	al.ensureCapacity(0);
	al.contains(ob);
	ObjectInputStream obj1 = new ObjectInputStream(System.in);
	System.out.println(obj1.readInt());
}
}
