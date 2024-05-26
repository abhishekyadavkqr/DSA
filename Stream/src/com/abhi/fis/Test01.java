package com.abhi.fis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test01 {
 public static void main(String[] args) throws FileNotFoundException,IOException {
	 	
	 	InputStream is = new FileInputStream("abc.txt");
	 	int x=0;
	 	while(x!=-1) {
	 	x = is.read();
	 	System.out.print((char)x);
	 	System.out.println("Content ::"+x);
	 	}
//	 OutputStream os  = new FileOutputStream("abc.txt");
//	 os.write(252);
//	 os.flush();
	 is.close();
}
}
