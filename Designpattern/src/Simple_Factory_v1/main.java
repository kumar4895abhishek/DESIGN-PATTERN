package Simple_Factory_v1;

public class main {

	public static void main(String[] args) 
	{
		
//		Button primaryButton=new PrimaryButton();
//		primaryButton.onClick();
//		
//		Button roundButton=new RoundButton();
//		roundButton.onClick();
		
		Button primaryButton=ButtonFactory.createButton(buttonType.PRIMARY);
		primaryButton.onClick();
		
		Button roundButton=ButtonFactory.createButton(buttonType.ROUND);
		roundButton.onClick();
		
		// BELOW WILL THROW EXCEPTION AS TYPE LINK IS NOT THERE
		
//		Button roundButton=ButtonFactory.createButton(buttonType.LINK); 
//		roundButton.onClick();
	}

}
