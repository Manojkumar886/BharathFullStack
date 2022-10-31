package Polymorphism;

public class MethodOverloading 
{
	public void calculate()
	{
		System.out.println("calculate is nothing but that are arithemetic operator");
	}
	public void calculate(int a,int b)
	{
		int c=a+b;
		System.out.println("my c value is :"+c);
	}
	public void calculate(double a,double b)
	{
		double c=a+b;
		System.out.println("my double value is :"+c);
	}
	public static void main(String[] args) 
	{
		MethodOverloading over=new MethodOverloading();
		over.calculate();
		over.calculate(25,50);
		over.calculate(34.8, 65.2);
		
	}

}
