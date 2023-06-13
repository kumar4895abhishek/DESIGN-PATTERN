package singleton_v2;

public class ConnectionPool 
{

	private ConnectionPool() {};
	
	private static ConnectionPool Instance=null;
	
	public static  ConnectionPool getInstance()  // synchronized thread safe
	{
		
		//Double Check locking
		if(Instance==null)
		{
			synchronized(ConnectionPool.class)
			{
				if(Instance==null)
				{
					Instance= new ConnectionPool();
				}
			
			}
		}
		
		
		return Instance;
		
	}
}
