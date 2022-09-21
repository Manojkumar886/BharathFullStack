package Variables;

public class TypeofVariables 
{
	static int b=100;//Static Variable
	int c=90;
	int d=909;
	
	public void maria()//Method creation
	{
		System.out.println("Welcome to Local Variable");
		int ab=1000;//Local Variable
		System.out.println(ab);
		System.out.println(c+d);//Global Variable
	}

	public static void main(String[] args)
	{
		TypeofVariables obj=new TypeofVariables();//Object Creation
		obj.maria();
		int a=10;//Instance Variable-Insdie class and inside the main method
		System.out.println(a);
		System.out.println(b);
	}

}
