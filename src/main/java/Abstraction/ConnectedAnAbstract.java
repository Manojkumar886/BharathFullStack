package Abstraction;

public class ConnectedAnAbstract extends basicAbstract
{

	@Override
	void noimplementation() 
	{
	System.out.println("this is one of the abstract method access the no implementation of mmethod");	
	}
	
	public static void main(String[] args) 
	{
		ConnectedAnAbstract abs=new ConnectedAnAbstract();
		
		
		abs.noimplementation();
		abs.normalmethod();
		
	}
	

}
