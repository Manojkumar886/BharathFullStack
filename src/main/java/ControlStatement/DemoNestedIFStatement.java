package ControlStatement;

import java.util.Scanner;

public class DemoNestedIFStatement {
	public void prakash()
	{
		System.out.println("Welcome to java stack....");
	}

	public static void main(String[] args) 
	{
		
		//classname objname(udn)=new classname();
		DemoNestedIFStatement obj=new DemoNestedIFStatement();
		obj.prakash();
		int pinno1=8979;//compile time memory alllocation
		Scanner scan=new Scanner(System.in);
		System.out.println("please tell us your pinno...");
		int pinno=scan.nextInt();
		if(pinno1==pinno)
		{
			System.out.println("welcome to atm,please any process you have accessed....");
			int amount=10000;
			int needamount=8000;
			if(amount!=needamount)
			{
				System.out.println("your values is same");
			}
			else
			{
				System.out.println("your value  is not same");
			}
		}
		else
		{
			System.out.println("your pin number is not vaild...");
		}
		obj.prakash();
	}

}
