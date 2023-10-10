package Decorator_Pizza;

public class ExtraCheese extends ToppingsDecorator
{
	
	Basepizza basepizza;
	
	public ExtraCheese(Basepizza pizza)
	{
		this.basepizza=pizza;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.basepizza.cost() + 10;
	}

}
