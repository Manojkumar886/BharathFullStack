package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class InsertingAnArray {

	public static void main(String[] args) 
	{
		String [] name=new String[10];//size-fixed
//		name[2]="Bharath";//Assigned Value
//		name[9]="Manoj";
//		name[5]="Razak";
//		System.out.println(Arrays.toString(name));
		
		Scanner scan=new Scanner(System.in);
		for(int pos=0;pos<name.length;pos+=2)
		{
			System.out.println("what is your name");
			name[pos]=scan.next();
		}
		
//		for(String name1 : name)//for-each loop
//		{
//			System.out.println(name1);
//		}
		
		for(int pos=0;pos<name.length;pos++)
		{
			if(name[pos]!=null)
			{
				System.out.println(name[pos]);
			}
		}
	
	}

}
