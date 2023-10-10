package Decorator_Pizza;

public class MushroomTop extends ToppingsDecorator 
{
	Basepizza basepizza;
	
	public MushroomTop(Basepizza pizza)
	{
		this.basepizza=pizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basepizza.cost() + 20;
	}

}
