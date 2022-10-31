package ControlStatement;

import java.util.Scanner;

public class DemoSwitchStatement {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
//		System.out.println("please ,Tell us only one digit number");
//		int number=scan.nextInt();
		
//		switch(number)
//		{
//		case 1:
//			System.out.println("my number is zero");
//			break;
//		case 2:
//			System.out.println("my number is One");
//			break;
//		case 3:
//			System.out.println("my number is Two");
//			break;
//		case 4:
//			System.out.println("my number is Three");
//			break;
//		case 5:
//			System.out.println("my number is Four");
//			break;
//		case 6:
//			System.out.println("my number is Five");
//			break;
//			default: System.out.println("your number is not available");
//		}
		
		System.out.println("PLease ,Tell us your name");
		String name=scan.nextLine();
//		String name="Manoj";
		switch(name)
		{
			case "Manoj":
				System.out.println("my name is manojkumar");
				break;
			case "Praksh":
				System.out.println("my name is prakash");
				break;
				default : System.out.println("your name is not available");
		}
	
	}

}
