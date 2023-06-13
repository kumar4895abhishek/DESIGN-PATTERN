package singleton;

import java.net.ConnectException;

public class Runner {

	public static void main(String[] args) 
	{
		ConnectionPool cp1=ConnectionPool.getInstance();
		ConnectionPool cp2=ConnectionPool.getInstance();
		ConnectionPool cp3=ConnectionPool.getInstance();

		if(cp1==cp2) // checking if same object
		{
			System.out.println("Same Object cp1 cp2");
		}
		
		if(cp1==cp3)
		{
			System.out.println("Same Object cp1 cp3");
		}


		

	}

}
