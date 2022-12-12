package MultiThreading;

import java.util.Arrays;

public class ExcutionOfMultiThread {

	public static void main(String[] args) 
	{
		SerachingProcess search=new SerachingProcess();
		Thread th=new Thread(search,"Manojkumar");//
		
		Thread th1=new Thread(search,"Bharath");
	
		Thread th2=new Thread(search,"NandhaKumar");
		th2.setPriority(10);
		th2.start();
		th.start();
		th.setPriority(1);
		th1.start();
	
	}
}

class SerachingProcess implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());//min-0,max-10,default-5
		listing();
		searching();
		
	}
	
	private int[] arrayvalues= {12,24,4,864,53,675,45,35,8,6556,767};
	private int number=24;
	
	public void listing()
	{
		System.out.println(Arrays.toString(arrayvalues));
	}
	public int searching()
	{
		for(int i=0;i<arrayvalues.length;i++)
		{
			if(arrayvalues[i]==number)
			{
				System.out.println(number+" this number index is "+i);
				return number;
			}
			
		}
		System.out.println(number+" is not founded ....");
		return -1;
	}
	
}