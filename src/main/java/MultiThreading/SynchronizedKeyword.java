package MultiThreading;

public class SynchronizedKeyword {

	public static void main(String[] args) 
	{
	final Matching match=new Matching();
		Thread th=new Thread()
				{
					public void run()
					{
						match.AdditionOfProgram(5);
					}
				};
		Thread th1=new Thread()
				{
					public void run()
					{
						match.AdditionOfProgram(7);
					}
				};
		th.start();
		th1.start();
	}

}

class Matching
{
	synchronized public void AdditionOfProgram(int add)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(add +" X"+i+" = "+add*i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}