package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args)
	{
		String [] movies= {"Ghilli","Kuruvi","Thirumalai","Master","Poove Unakkah","Varisu"};
		Scanner scan=new Scanner(System.in);
		System.out.println("Please ,tell us what is position to update");
		int pos=scan.nextInt();
		System.out.println("Tell us what is your new value");
		String newone=scan.next();
		movies[pos]=newone;
		System.out.println("After updating"+Arrays.toString(movies));	
	}
}
