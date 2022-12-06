package Exception;

import java.util.Scanner;

public class FiniteChancess 
{
	private String mydetails="Bharath batch is Exception topic is over"+"tomorrow will be start a Thread Concept";
	private Scanner scan=new Scanner(System.in);
	public void connect(int attempts)
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
			if(attempts<=3)
			{
				attempts++;
				connect(attempts);
			}
			else
			{
				System.out.println("maximum error is over....");
			}
		}
		
	}

	public static void main(String[] args) 
	{
		FiniteChancess chance=new FiniteChancess();
		chance.connect(1);
	
	}

}
