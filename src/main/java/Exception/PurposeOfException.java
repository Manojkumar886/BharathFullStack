package Exception;

import java.util.Scanner;

public class PurposeOfException
{
	public static void main(String[] args) 
	{
		String collect="i am manojkumar from Namakkal";
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("which index you want please tell us");
			System.out.println(collect.charAt(scan.nextInt()));
		}
		catch(StringIndexOutOfBoundsException exe)
		{
			System.out.println(exe+"index number should be less then"+collect.length());
			System.out.println(collect.charAt(scan.nextInt()));
		}
		finally
		{
			System.out.println("Thank You....!");
		}
		
	}

}
