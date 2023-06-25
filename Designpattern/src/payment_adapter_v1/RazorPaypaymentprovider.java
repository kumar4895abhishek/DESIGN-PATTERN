package payment_adapter_v1;

public class RazorPaypaymentprovider implements PaymentProviderInterface 
{
	
	private RazorPayAPI razorpaypp =new RazorPayAPI();
	
	@Override
	public void makePayment(Long id, String name, int amount) {
		razorpaypp.pay("ABHI", 1000);	
	}

	@Override
	public PaymentProviderStatus verifyStatus(Long id) {
		// TODO Auto-generated method stub
		int	 status=razorpaypp.checkStatus();
		return toPaymentStatus(status);
		}

	private PaymentProviderStatus toPaymentStatus(int status) {
		// TODO Auto-generated method stub
		if(status==1)
		{
			return PaymentProviderStatus.OK;
		}
		else
		{
			return PaymentProviderStatus.ERROR;
		}
	}

}
