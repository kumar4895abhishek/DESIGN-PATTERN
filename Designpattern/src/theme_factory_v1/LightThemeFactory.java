package theme_factory_v1;

public class LightThemeFactory implements ThemeFactory {

	@Override
	public Button createButton() 
	{
		return new LightButton();
	}

	@Override
	public CheckBox createCheckBox() 
	{
		return new LightCheckBox();
	}

}
