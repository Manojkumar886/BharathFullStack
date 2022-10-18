package Interfaces;

public class MultipleAchive implements Sleepable,Speakable,Runnable
{

	public static void main(String[] args) 
	{
	MultipleAchive ache=new MultipleAchive();
	ache.sleep();
	ache.speak();
	ache.run();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run is more important");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Speak is not conmfortsable of persons");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("minimum 8 hours sleep the normal humans");
	}

}
