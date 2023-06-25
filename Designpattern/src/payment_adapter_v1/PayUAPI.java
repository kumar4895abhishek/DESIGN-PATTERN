package payment_adapter_v1;

public class PayUAPI 
{
	public void order(int amount)
	{
		System.out.println("PayU amount "+amount);
	}
	
	public PayUStatus getStatus()
	{
		return PayUStatus.SUCCESS;
	}

}
