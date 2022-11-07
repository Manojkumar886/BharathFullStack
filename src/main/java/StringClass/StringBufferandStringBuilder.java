package StringClass;
//Mutable
public class StringBufferandStringBuilder 
{
	public static void main(String[] args) 
	{
		StringBuilder build=new StringBuilder();
		StringBuffer buffer=new StringBuffer("Bharath");
		System.out.println(buffer);//Bharath
		buffer.append("Kumar");//end of the string will be changed
		System.out.println(buffer);//BharathKumar
		buffer.insert(4, "Connect");//BharConnectthKumar
		System.out.println(buffer);
//		System.out.println(buffer);
		buffer.replace(4, 11, "Collection");//BharColectiontathKumar
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);//BharCollectiontathKumar
	
	}

}
