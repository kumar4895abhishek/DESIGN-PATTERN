package Simple_Factory_v2;

import javax.management.RuntimeErrorException;

public class ButtonFactory 
{
	// Step 3 - create static method to return based on parameter
	static Button createButton(buttonType type)
	{
		switch(type)
		{
		case  PRIMARY:
			return new PrimaryButton();
		case ROUND:
			return new RoundButton();
			
		}
		throw new RuntimeException(" INVALID BUTTON "+type);
	}

}
