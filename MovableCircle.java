package Movable;

public class MovableCircle implements Movable 
{
	private MovablePoint center;
	
	private int radius;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
	{
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		
		this.center.x = x;
		this.center.y = y;
		
		this.center.xSpeed = xSpeed;
		this.center.ySpeed = ySpeed;
		
		this.radius = radius;
	}
	
	
	public String toString()
	{
		 return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
	}
	
	@Override
	public void moveUp() 
	{
		this.center.y++;
	}
	
	@Override
	public void moveDown() 
	{
		this.center.y--;
	}
	
	@Override
	public void moveLeft() 
	{
		this.center.x--;
	}
	
	@Override
	public void moveRight() 
	{
		this.center.x++;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
