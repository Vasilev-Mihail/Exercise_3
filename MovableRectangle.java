package Movable1;

public class MovableRectangle implements Movable
{
	private MovablePoint topLeft;
	private MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
	{
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
	}

	public String toString() 
	{
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
	
	@Override
	public void moveUp() 
	{
		this.topLeft.y++;
		this.bottomRight.y++;
	}

	@Override
	public void moveDown() 
	{
		this.topLeft.y--;
		this.bottomRight.y--;
	}

	@Override
	public void moveLeft() 
	{
		this.topLeft.x--;
		this.bottomRight.x--;
	}

	@Override
	public void moveRight() 
	{
		this.topLeft.x++;
		this.bottomRight.x++;
	}
	
	
}
