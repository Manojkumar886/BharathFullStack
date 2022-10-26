package Encapsulation;

public class DemoEncapStudentDetails 
{
	//private-access modifier,that is used for only accessed by within class
	
	private int age;
	private String name;
	
	public void setAge(int age)
	{
		this.age=age;///23=23
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

}
