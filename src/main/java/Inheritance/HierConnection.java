package Inheritance;

public class HierConnection {

	public static void main(String[] args) 
	{
		HierTeacher tech=new HierTeacher();
		tech.teacher();
		tech.baseclass();//personclass one one of the method...
		HierDoctor doc=new HierDoctor();
		doc.doctor();
		doc.baseclass();
	}

}
