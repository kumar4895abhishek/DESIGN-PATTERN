package Observer_btc;

public class TweetSender implements Subscriber {

	@Override
	public void takeAction()
	{
			System.out.println("TWEET SENT");		
	}

}
