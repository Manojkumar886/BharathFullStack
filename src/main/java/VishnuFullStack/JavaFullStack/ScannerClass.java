package VishnuFullStack.JavaFullStack;

import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name");
		String name=scan.next();
		System.out.println("What is mobile number");
		long mobile=scan.nextLong();
		
		
		System.out.println(mobile+" this is mobile number");
		System.out.println("My name is"+name);
	}

}
