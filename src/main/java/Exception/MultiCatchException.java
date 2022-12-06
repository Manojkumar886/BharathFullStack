package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchException {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int myvalue=0,myzerovalue=0;
		try
		{
			System.out.println("enter your first value");
			myvalue=scan.nextInt();
			System.out.println("enter the second value");
			myzerovalue=scan.nextInt();
			System.out.println(myvalue/myzerovalue);
		}
		catch(ArithmeticException exe)
		{
			System.out.println("cannot be used by zero value in didvided by anything....");
			System.out.println("please another one time tell us your second value");
			myzerovalue =scan.nextInt();
			System.out.println("your didivided value is"+myvalue/myzerovalue);
		}
		catch(InputMismatchException exe)
		{
			Scanner scans=new Scanner(System.in);
			System.out.println("alphabetical is not allowed,please tell us only numberic value can be used");
			System.out.println("enter your first value");
			myvalue=scans.nextInt();
			System.out.println("enter the second value");
			myzerovalue=scans.nextInt();
			System.out.println("your didivided value is"+myvalue/myzerovalue);
		}
		finally
		{
			System.out.println("Thank you");
		}
	}

}
