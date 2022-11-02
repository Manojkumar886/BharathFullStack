package Polymorphism;

public class MethodOverriding1 extends MethodOVerriding
{
	public void calculate(double a,double b)
	{
		double c=a-b;
		System.out.println("c value is :"+c);
	}
	public static void main(String[] args) 
	{
		MethodOverriding1 over=new MethodOverriding1();
		over.calculate(45, 35);
		MethodOVerriding over1=new MethodOVerriding();
		over1.calculate(35, 35);
		//upcasting-referenced by parent class,but object is created by child class
		MethodOVerriding obj=new MethodOverriding1();
	//objcreationforchildclass objname=new referencedclassfor mainclass();
		
		obj.calculate(34, 34);
		
		
	}

}
