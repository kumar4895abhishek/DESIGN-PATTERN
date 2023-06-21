package theme_factory_v1;

public class DarkThemeFactory implements ThemeFactory {

	@Override
	public Button createButton() 
	{
		return new DarkButton();
	}

	@Override
	public CheckBox createCheckBox() 
	{
		return new DarkCheckBox();
	}

}
