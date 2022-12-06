package Exception;

import java.util.Scanner;

public class INfinteChances
{
	private String mydetails="Bharath batch is Exception topic is over"+"tomorrow will be start a Thread Concept";
	private Scanner scan=new Scanner(System.in);
	public void connect()
	{
		try
		{
			System.out.println("enter the your start point value");
			int start=scan.nextInt();
			System.out.println("enter the your end point value");
			int end=scan.nextInt();
			System.out.println(mydetails.substring(start, end));
		}
		catch(StringIndexOutOfBoundsException exe)
		{
			System.out.println(exe+"Start at 0 end with "+mydetails.length());
			connect();
			
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		INfinteChances chance=new INfinteChances();
		chance.connect();

	}

}
