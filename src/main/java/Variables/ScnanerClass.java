package Variables;

import java.util.Scanner;

public class ScnanerClass {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);//Scanner obj
		
		System.out.println("What is Your Name");
		String username=scan.next();
		
		System.out.println("Who R U ..?");
		String Im=scan.next();
		
		
		System.out.println("My name is :" +username);
		System.out.println("i am :"+Im);
	}

}
