package AccessModifiers;

import java.util.Arrays;

public class NormalOne 
{
	private int[] hey= {12,32,2,22,3,32,3432,23,242,24,46,654,4};
	public void result()
	{
		for(int hey1:hey)
		{
			System.out.println(hey1);
		}
	}
	
	private void sort1()
	{
		Arrays.sort(hey);
		System.out.println(Arrays.toString(hey));
	}
	
	void sort()
	{
		Arrays.sort(hey);
		for(int index=0;index<hey.length;index++)
		{
			System.out.println(hey[index]);
		}
	}
	
	protected void search(int data)
	{
		for(int i=0;i<hey.length;i++)
		{
			if(hey[i]==data)
			{
				System.out.println(data+"has founded"+i);
				return;
			}
		}
	}

}
