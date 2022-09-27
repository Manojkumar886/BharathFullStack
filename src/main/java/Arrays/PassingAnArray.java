package Arrays;

import java.util.Arrays;

public class PassingAnArray {
	public void pass(int [] a1)
	{
		System.out.println("Before values"+Arrays.toString(a1));
		a1[0]=100;
		System.out.println("After values");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
	}
	public void passes(String name1)
	{
		System.out.println("my name is"+ name1);
	}

	public static void main(String[] args) 
	{
		String name="Bharath";
		int[]a =  {98,89,76,76,54,45,32,23,21,12};
		PassingAnArray array=new PassingAnArray();
		array.pass(a);
		array.passes(name);

	}

}
