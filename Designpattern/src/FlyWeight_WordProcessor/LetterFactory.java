package FlyWeight_WordProcessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory 
{
	private static Map<Character,ILetter> charCache=new HashMap<>();
	
	public static ILetter createLetter(char characterValue)
	{
		if(charCache.containsKey(characterValue))
		{
			return charCache.get(characterValue);
		}
		else 
		{
			DocumentLetter docLetter=new DocumentLetter(characterValue, "ARIAL", 10);
			charCache.put(characterValue,docLetter);
			return docLetter;
		}
	}

}
