package Movable1;

public class test 
{
	public static void main(String[] args)
	{
		MovableRectangle g = new MovableRectangle(1 , 1, 1, 1, 2, 1);
		g.moveRight();
		g.moveUp();
		g.moveDown();
		System.out.print(g);
	}
}
