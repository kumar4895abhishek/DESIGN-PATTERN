package Observer_btc;

// observer used in event driven notification send example
// STEP 1 create subject interface OBJ of inetrest BTC price
public interface Publisher {
	
	
	void notifyChange();
	
	void addSubscriber(Subscriber subscriber);
	
	void removeSubscriber(Subscriber subscriber);

}
