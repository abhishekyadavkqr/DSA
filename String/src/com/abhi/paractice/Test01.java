package com.abhi.paractice;

import java.io.Console;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
/*	Project 1
			
		System.out.println("Enter Your UserName ::");
		String usn = sc.next();
		if(usn.isEmpty())
			System.out.println("Enter UserName");
		else 
			System.out.println("Welcome...");
*/
			
/*	 Project 2
			
			System.out.println("Enter Your Name ::");
			String usn = sc.nextLine();
			
			System.out.println(usn +" has " + usn.length() + " characters");
*/
			
/*	 Project 3
			
			System.out.println("Enter Your Password ::");
			
			String usn =sc.next();
			String res =(usn.length() >=8 && usn.length()<=16)?"":"Password Length must be in between 8,16";
			
			System.out.println(res);
*/
		
			
///*	 Project 3
			
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
			
			
//*/
			
	}catch(Exception e) {
		
	}

}
}