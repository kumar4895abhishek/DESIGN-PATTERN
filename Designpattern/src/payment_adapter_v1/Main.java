package payment_adapter_v1;

public class Main 
{
	private static PaymentProviderInterface paymentprovider=new RazorPaypaymentprovider(); // only here change neeeds to be done

	public static void main(String[] args) 
	{
		paymentprovider.makePayment( 1L, "ABC", 200);
//		Main obj = new Main();
//		obj.original();

	}
	
	
	public void original()
	{
		String type="razorpay";
		if(type.equals("razorpay"))
		{
			RazorPayAPI razorPay=new RazorPayAPI();
			razorPay.pay("Abhishek", 100);
			razorPay.checkStatus();
		}
		else
		{
			PayUAPI payu=new PayUAPI();
			payu.order(200);
			payu.getStatus();
		}
	}

}
