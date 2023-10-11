package theme_factory_v1;

import java.awt.Checkbox;

public class main {
	

	public static void main(String[] args) 
	{
		ThemeFactory factory =new DarkThemeFactory();

		//String theme="Dark";
		Button button =factory.createButton();
		button.onclick();
		CheckBox checkBox=factory.createCheckBox();
		checkBox.onSelect();
	}

}
