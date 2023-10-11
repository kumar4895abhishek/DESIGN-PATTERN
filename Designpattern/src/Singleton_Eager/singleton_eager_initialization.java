package Singleton_Eager;

public class singleton_eager_initialization 
{
	private static singleton_eager_initialization instance=new singleton_eager_initialization();
	
	private singleton_eager_initialization() {};
	
	public static singleton_eager_initialization getConnection()
	{
		return instance;
	}
	

}
