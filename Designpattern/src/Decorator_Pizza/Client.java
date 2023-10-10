package Decorator_Pizza;

public class Client 
{
	public static void main(String[ ] args) 
	{
		
		
		Basepizza basepizza= new MagrettaPizza();
		System.out.println(basepizza.cost());
		basepizza = new MushroomTop(basepizza);
		System.out.println("MAGRETTA PIZZA COST WITH  MUSHROOM TOPPINGS "+basepizza.cost());
		
		
		Basepizza vegbasepizza= new VegDelight(); // 1st Vegdelight Base
		System.out.println(vegbasepizza.cost());
		vegbasepizza =new MushroomTop(vegbasepizza); // 2nd mushroom added
		System.out.println(vegbasepizza.cost());
		vegbasepizza=new ExtraCheese(vegbasepizza); // 3rd extra cheese added
		
		System.out.println("VEG DELIGHT WITH EXTRA CHEESE AAND MUSHROOM COST "+vegbasepizza.cost());
		
		
		
		
		
		
		
	}

}
