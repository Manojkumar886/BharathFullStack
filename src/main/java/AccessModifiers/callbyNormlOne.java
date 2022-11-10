package AccessModifiers;
//matching for that package of Operators....
public class callbyNormlOne 
{
	public static void main(String[] args) 
	{
		NormalOne one=new NormalOne();
		one.result();//public modifier
		one.sort();//defalut modifier
		one.search(3);//protected modifier
		//one.sort1();//that method is using for private
		
	}

}
