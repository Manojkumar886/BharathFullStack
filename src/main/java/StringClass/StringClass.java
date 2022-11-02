package StringClass;

public class StringClass
{
	public static void main(String[] args) 
	{
		String name="Bharath";//literal
		String name1=new String("Manojkumar");
		String name2=new String("manojkumar");
		
		name=name.concat("Kumar");//immutable
		System.out.println(name);
		System.out.println(name.concat("Bharth"));//string-string
		System.out.println(name);
		System.out.println(name1.contains("noj"));//Searching-boolean
		System.out.println(name2.equalsIgnoreCase(name1));//boolean
		System.out.println(name2.startsWith("m"));//boolean
//		name1=name1.replace("Manoj", "Dinesh");//
//		System.out.println(name1);
		String result="    he is bharath ....learn byjava full stackdeveloper    ";
		System.out.println(result);
		System.out.println(result.substring(10));//starting
		System.out.println(result.substring(15, 25));//start-end
		System.out.println(result.length());
		System.out.println(result.trim());
				
		
		
	}

}
