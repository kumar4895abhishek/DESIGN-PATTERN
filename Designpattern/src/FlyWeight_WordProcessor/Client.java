package FlyWeight_WordProcessor;

public class Client {

	public static void main(String[] args) {
		ILetter obj1=LetterFactory.createLetter('a');
		obj1.display(0, 9);

		
		ILetter obj2=LetterFactory.createLetter('a'); // same object used
		obj2.display(2, 7); 
		
		ILetter obj3=LetterFactory.createLetter('c');
		obj2.display(2, 7);
		
		
		if(obj1==obj2)
		{
			System.out.println("OBJ 1 == OBJ 2");
		}
		else
		{
			System.out.println("OBJ 1 != OBJ 2");
		}
	}

}
