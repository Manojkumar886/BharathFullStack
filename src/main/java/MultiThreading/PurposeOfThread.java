package MultiThreading;

public class PurposeOfThread {

	public static void main(String[] args) throws InterruptedException //Thread
	{
		Bike obj=new Bike();///Bike class is thread
		obj.start();
		
		Car obj1=new Car();
		
		Thread th=new Thread(obj1);//Car class is Thread
		th.start();
		//obj.join();
		System.out.println("Thank You Thread.....!");
		System.out.println("Wewlcome");
	}
}


class Bike extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Alter a Data using Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Car implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("my numbers are "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}