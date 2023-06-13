package singleton;

public class ConnectionPool 
{

	private ConnectionPool() {};
	
	private static ConnectionPool Instance=null;
	
	public static synchronized ConnectionPool getInstance()  // synchronized thread safe
	{
		
		//CRITICAL SECTION
		if(Instance==null)
		{
			Instance= new ConnectionPool();
		}
		
		
		return Instance;
		
	}
}
