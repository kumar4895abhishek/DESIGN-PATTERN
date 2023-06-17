package prototype_v1;

import java.rmi.registry.Registry;

public class main {
	
	private static BackgroundObjectRegistry registry=new BackgroundObjectRegistry();

	public static void main(String[] args) 
	{
		// Create prototype
		BackgroundObject prototype =new BackgroundObject(10, 20, 30, BackgroundObjectType.TREES);
		
		registry.register(prototype);
		
		
		
		// Clone
		BackgroundObject clone=prototype.clone();
		clone.setX(50);
		clone.setY(60);
		clone.setZ(70);
		
		System.out.println(prototype);
		
		createTrees();
	}
	
	public static void createTrees()
	{
		BackgroundObject prototype=registry.getObject(BackgroundObjectType.TREES);
		BackgroundObject clone=prototype.clone();
		
		clone.setX(100);
		
		System.out.println(clone.getType()+" "+clone.getX());
		
	}

}
