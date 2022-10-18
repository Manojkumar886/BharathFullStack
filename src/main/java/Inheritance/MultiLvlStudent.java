package Inheritance;

public class MultiLvlStudent extends MultiLvlEngineerStudent
{
	public void student()
	
	{
		System.out.println("All of the student need to studies...");
	}

	public static void main(String[] args)
	{
		MultiLvlStudent obj=new MultiLvlStudent();
		obj.student();
		obj.EngineerStudent();
		obj.ArtsStudent();
		
	
	}

}
