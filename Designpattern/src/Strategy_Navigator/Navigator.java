package Strategy_Navigator;

import lombok.AllArgsConstructor;

//STEP 3
@AllArgsConstructor
public class Navigator
{
	//Add a local var for strategy
	
	public Navigator() {
		// TODO Auto-generated constructor stub
	}
	
	private NavigationStrategy navigationStrategy;
	
	//delegetae
	
	public void navigate(String from,String to)
	{
		navigationStrategy.navigate(from, to);
	}

}
