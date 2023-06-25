package payment_adapter_v1;

public class PayUPaymentProvider implements PaymentProviderInterface 
{
	
	private PayUAPI payu=new PayUAPI();

	@Override
	public void makePayment(Long id, String name, int amount) 
	{
		// TODO Auto-generated method stub
		payu.order(2000);
		
	}

	@Override
	public PaymentProviderStatus verifyStatus(Long id) 
	{
		// TODO Auto-generated method stub
		return toPaymentStatus(payu.getStatus());
	}

	private PaymentProviderStatus toPaymentStatus(PayUStatus status) 
	{
		// we can use switch case
		if(status==PayUStatus.SUCCESS)
		{
			return PaymentProviderStatus.OK;
		}
		else
		{
			return PaymentProviderStatus.ERROR;
		}
	}

}
