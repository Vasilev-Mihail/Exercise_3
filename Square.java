package Shape;

public class Square extends Rectangle
{
	protected double side;
	
	public Square()
	{
		this.filled = false;
		this.color = "red";
		side = 1;
	}
	
	public Square(double side)
	{
		this.filled = false;
		this.color = "red";
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled)
	{
		this.filled = false;
		this.color = "red";
		this.side = side;
	}
	
	public void setSide(double side)
	{
		this.side = side;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public void setWidth(double side)
	{
		this.width = side;
	}
	
	public void setLength(double side)
	{
		this.length = side;
	}
	
	@Override
	public String toString() 
	{
		return "Shape: square, side: " + this.side + ", color: "+ this.color;
	}
}
