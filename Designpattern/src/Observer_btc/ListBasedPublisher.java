package Observer_btc;

import java.util.ArrayList;
import java.util.List;


//Step 3 add a common imple for publisher
public abstract class ListBasedPublisher  implements Publisher
{

	public List<Subscriber> subscribers=new ArrayList<>();
	
	
	@Override
	public void notifyChange() {
		for(Subscriber subscriber:subscribers)
		{
			subscriber.takeAction();
		}
		
		//subscribers.forEach(subscriber ->subscriber.takeAction());
		//subscribers.forEach(Subscriber::takeAction); // METHOD REFERNCE
		
	}

	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
		
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
		
	}
	

}
