package HybridInheritance;

public class MainClassisFood extends Food implements ChickenRice,EggRice
{

	public static void main(String[] args) 
	{
		MainClassisFood food=new MainClassisFood();
		food.foodismust();//normal class
		food.riceok();//interface class
		food.eggrice();//interface class
	
		
	}

	@Override
	public void eggrice() 
	{
		System.out.println("Egg rice always good and healthy food");
	}

	

	@Override
	public void riceok() {
		// TODO Auto-generated method stub
		System.out.println("Chicken rice is not good spicy item");	
	}

}
