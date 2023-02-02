package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) 
	{
		LinkedList<Integer> obj=new LinkedList<>();//Non-Generic
		
		obj.add(56);
		obj.addFirst(100);
		obj.add(2, 98);
		
		System.out.println(obj);
		
		
	}

}
