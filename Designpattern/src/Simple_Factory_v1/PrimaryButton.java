package Simple_Factory_v1;

public class PrimaryButton implements Button
{
	
	private buttonType type=buttonType.PRIMARY;

	@Override
	public void onClick() {
		System.out.println("PRIMARY BUTTON IS CLICKED");
		
	}

}
