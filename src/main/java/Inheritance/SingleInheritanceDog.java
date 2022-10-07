package Inheritance;

public class SingleInheritanceDog extends SingleinheritanceAnimal
{
	public void barking()
	{
		System.out.println("Barking is one of the habit for gog");
	}
	
//unique -id ----dog
	//FUnctionality(Methods)
	//Values(//statement,PArameters)
	public static void main(String[] args) 
	{
		SingleInheritanceDog dog=new SingleInheritanceDog();
		dog.barking();
		dog.Food();	
	}

}
