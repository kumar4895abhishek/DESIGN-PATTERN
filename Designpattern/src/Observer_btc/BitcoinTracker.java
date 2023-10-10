package Observer_btc;


//Step 4 create concrete subject
public class BitcoinTracker extends ListBasedPublisher 
{
	
	private Double price;

	public void setPrice(Double price) {
		this.price = price;
		notifyChange();
	}

//	public Double getPrice() {
//		return price;
//	}

}
