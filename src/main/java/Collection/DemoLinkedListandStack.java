package Collection;

import java.util.LinkedList;
import java.util.Stack;

public class DemoLinkedListandStack {

	public static void main(String[] args) 
	{
	LinkedList<String> DemoLinkedList=new LinkedList<>();
	DemoLinkedList.add("Manojkumar");
	DemoLinkedList.addFirst("Bharath");
	DemoLinkedList.addLast("Annamalai");
	DemoLinkedList.add("Razak");
	System.out.println("All Values"+DemoLinkedList);
	DemoLinkedList.remove(3);//with remove by index only
//	DemoLinkedList.remove("Manojkumar");
	System.out.println("Remove values is not printed"+DemoLinkedList);
	System.out.println(DemoLinkedList.contains("Annamalai"));
	System.out.println(DemoLinkedList.get(2));
	DemoLinkedList.set(2,"Annamalai S");
	System.out.println(DemoLinkedList);
	System.out.println(DemoLinkedList.get(1));
	
	Stack  DemoStack=new Stack<>();
	DemoStack.push("Manojkumar");
	DemoStack.push('A');
	DemoStack.push(876545678987l);
	DemoStack.push(4.5);
	System.out.println(DemoStack);
	}

}
