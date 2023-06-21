package theme_factory_v1;

import java.awt.Checkbox;

public class main {
	
	private static ThemeFactory factory =new LightThemeFactory();

	public static void main(String[] args) 
	{
		//String theme="Dark";
		Button button =factory.createButton();
		button.onclick();
		CheckBox checkBox=factory.createCheckBox();
		checkBox.onSelect();
	}

}
