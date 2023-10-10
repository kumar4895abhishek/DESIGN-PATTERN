package Singleton;

public class singleton_eager_initializationDemo {

	public static void main(String[] args)
	{
		System.out.println("DEMO CLASS ");
		
		singleton_eager_initialization conn1=singleton_eager_initialization.getConnection();
		
		System.out.println(" OBJECT IS "+conn1);
		
		singleton_eager_initialization conn2=singleton_eager_initialization.getConnection();
		
		if(conn1==conn2)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}


	}

}
