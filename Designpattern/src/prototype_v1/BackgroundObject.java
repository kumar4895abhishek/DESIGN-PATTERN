package prototype_v1;

public class BackgroundObject implements GraphicalObject
{
	private Integer x;
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	public BackgroundObjectType getType() {
		return type;
	}

	public void setType(BackgroundObjectType type) {
		this.type = type;
	}

	private Integer y;
	
	private Integer z;
	
	private BackgroundObjectType type;
	
	public BackgroundObject(Integer x, Integer y,Integer z, BackgroundObjectType type) 
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.type=type;
	}

	@Override
    public BackgroundObject clone() 
	{
        return new BackgroundObject(x, y,z,type);
    }

}
