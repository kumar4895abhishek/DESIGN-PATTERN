package Observer_btc;


//STEP 5 create concrete observer
public class EmailSender implements Subscriber {

	@Override
	public void takeAction()
	{
			System.out.println(" EMAIL SEND ");		
	}

}
