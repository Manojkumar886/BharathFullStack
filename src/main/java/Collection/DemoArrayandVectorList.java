package Collection;

import java.util.ArrayList;
import java.util.Vector;

import javax.sound.midi.Soundbank;

public class DemoArrayandVectorList {

	public static void main(String[] args)
	{
		ArrayList<Float>  DemoArray=new ArrayList<>();
		DemoArray.add(7.4f);
		DemoArray.add(4.5f);
		DemoArray.add(1.2f);
		DemoArray.add(2,8.9f);		
		System.out.println("Array Values"+DemoArray);
		
		Vector<Float> DemoVector=new Vector<>();
		DemoVector.addAll(DemoArray);
		DemoVector.add(8.9f);
		DemoVector.add(112.20f);
		DemoVector.add(34.4f);
		
		System.out.println("Vector values :"+DemoVector);
		
		DemoVector.removeAll(DemoArray);
		System.out.println(DemoVector);
	}

}
