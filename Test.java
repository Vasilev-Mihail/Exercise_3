package Movable;

public class Test 
{
	public static void main(String[] args)
	{
		MovableCircle g = new MovableCircle(1 , 1, 1, 1, 1);
		g.moveRight();
		g.moveUp();
		System.out.print(g);
	}
}
