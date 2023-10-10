package Observer_btc;

public class Main {

	public static void main(String[] args) {
		
		
			  BitcoinTracker tracker=new BitcoinTracker();
			  
			  tracker.addSubscriber(new EmailSender());
			  tracker.addSubscriber(new TweetSender());
			  
			  tracker.setPrice(100000.00);
			  
			  
			  
	}

}
