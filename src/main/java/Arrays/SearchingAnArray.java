package Arrays;

import java.util.Scanner;

public class SearchingAnArray {

	public static void main(String[] args) 
	{
		int [] array= {10,20,30,40,50,60,70,80,90,100};
		Scanner scan=new Scanner(System.in);
		System.out.println("Please,tell us which number you want in my array");
		int value=scan.nextInt();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==value)
			{
				System.out.println(value+"Your value of index is" +i);
				return;
			}
		}
		System.out.println("your value is not founded");
	}

}
