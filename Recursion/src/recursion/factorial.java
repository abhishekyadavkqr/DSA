package recursion;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class factorial {
public static void main(String[] args) throws IOException {
	
	DataInputStream dis = new DataInputStream(new BufferedInputStream(System.in));
	System.out.println("enter here..");	
	@SuppressWarnings("deprecation")
	String s =dis.readLine();
	Integer i1 = Integer.parseInt(s);
		int i = i1.intValue();
		System.out.println(s);
	
	System.out.println( "Factorial: "+recursion(i)); ;
}
static int recursion( int n) {
	int fact=1 ;
	if(n ==1 || n==0)
		 return 1;
	 else {
		 System.out.println("n: " +n+ "  Fact : "+fact);
		 fact = fact * n;
		return (recursion(n-1)*fact);
	 }
	}
}
//static int recursion( int n) {
//	int fact=1 ;
//	if(n ==1 || n==0)
////		 return 1;
////	 else {
////		 System.out.println("n: " +n+ "  Fact : "+fact);
////		 fact = fact * n;
////		return (recursion(n-1)*fact);
////	 }
//////	static int recursion( int n) {
//////		int fact=0 ;
//////		if( n==0)
//////			return 1;
////////		else {
//////			System.out.println("n: " +n+ "  Fact : "+fact);
//////			fact = fact + n;
//////			return (recursion(n-1)+fact);
////////		}
//////		 
////	
//////}

