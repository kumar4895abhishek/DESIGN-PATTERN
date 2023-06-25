package payment_adapter_v1;

public class RazorPayAPI 
{
	public void pay(String name,int amount)
	{
		System.out.println("Razor Pay payment "+name+" "+amount);
		
	}
	
	
	public int checkStatus()
	{
		return 1;
	}

}
