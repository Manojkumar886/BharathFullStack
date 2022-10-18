package Arrays;

import java.util.Arrays;

public class CreatingAnArray 
{

	public static void main(String[] args)
	{
		 int a=10;
		 int [] ab= {12,3,46,89,98,56,65};//Compile time inserting an value
		 int [] ab1=new int[23];//run time -size fixed
		 //System.out.println(a);
		 //System.out.println(ab.length);
		//Three types
		 //for loop
		for(int a1=0;a1<=3;a1++)
		{
			System.out.println(ab[a1]);
		}
//		 //for-each loop
//		 for(int ba:ab)//for(datatype variablename : arrayname)
//		 {
//			 System.out.println(ba);
//		 }
		 
		// System.out.println(Arrays.toString(ab));
	}

}
