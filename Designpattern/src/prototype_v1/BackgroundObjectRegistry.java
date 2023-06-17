package prototype_v1;

import java.util.HashMap;

import java.util.Map;
import lombok.*;

@AllArgsConstructor
public class BackgroundObjectRegistry 
{
	
	public BackgroundObjectRegistry() {};
	
	private Map<BackgroundObjectType, BackgroundObject> objects = new HashMap<>();
	
	public void register(BackgroundObject object)
	{
		objects.put(object.getType(), object);
	}
	
	public BackgroundObject getObject(BackgroundObjectType type)
	{
		return objects.get(type);
	}
}
