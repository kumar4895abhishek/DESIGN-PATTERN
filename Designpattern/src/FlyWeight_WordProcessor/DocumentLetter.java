package FlyWeight_WordProcessor;

public class DocumentLetter implements ILetter 
{
	
private int size;
	
	private String fontType;
	
	private char character;
	
	public DocumentLetter( char character , String fontType,int size) {
		
		this.size = size;
		this.fontType = fontType;
		this.character = character;
	}

	

	@Override
	public void display(int x, int y) 
	{
		System.out.println("DISPLAY X axis "+x + " Y axis "+y);
		
	}

}
