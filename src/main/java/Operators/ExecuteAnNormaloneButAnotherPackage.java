package Operators;
//final keyword is uesd by-method-override,variable-constands-cannot be changed,class-inheritance
import AccessModifiers.NormalOne;

public class ExecuteAnNormaloneButAnotherPackage extends NormalOne 
{
	public static void main(String[] args) 
	{
		NormalOne one=new NormalOne();
		one.result();//public
	
		ExecuteAnNormaloneButAnotherPackage one1=new ExecuteAnNormaloneButAnotherPackage();
		one1.result();//public
		one1.search(5);//protected
		
		
	}

}
