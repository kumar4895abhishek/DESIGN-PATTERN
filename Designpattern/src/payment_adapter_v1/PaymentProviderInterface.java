package payment_adapter_v1;

public interface PaymentProviderInterface 
{
	void makePayment(Long id,String name,int amount);
	
	PaymentProviderStatus verifyStatus(Long id);

}
