package Encapsulation;

public class ConnectedEncap 
{
	public static void main(String[] args) 
	{
		DemoEncapStudentDetails demo=new DemoEncapStudentDetails();
		
		demo.setAge(23);
		demo.setName("Bharath");
		
		System.out.println("my age is : "+demo.getAge());
		System.out.println("my nameis : "+demo.getName());
		
	}

}
