package ControlStatement;

public class DemoElseifStatement {

	public static void main(String[] args) 
	{
		String Statename="Tamilnadu";
		String Statename1="kerala";
		
		if(Statename==Statename1)//tamilnadu==kerala
		{
			System.out.println("two variables is true");
		}
		else if(Statename=="Bihar")//Tamilnadu==Bhihar
		{
			System.out.println("vihar is not equal to statename");
		}
		else if(Statename!=Statename1)
		{
			System.out.println("Tamilnadu is not equal to kerala");
		}
		else if(Statename1=="Kerala")
		{
			System.out.println("Also same");
		}
		else
		{
		System.out.println("all condition are wrong");	
		}
	}

}
