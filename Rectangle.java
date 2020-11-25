package Shape;

public class Rectangle extends Shape 
{
	protected double width;
	protected double length;
	
	public Rectangle()
	{
		this.filled = false;
		this.color = "red";
		width = 1;// ширина
		length = 1;//длина
	}
	
	public Rectangle(double width, double length)
	{
		 this.filled = false;
		 this.color = "red";
		 this.width = width;
		 this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled)
	{
		this.filled = false;
		this.color = "red";
		this.width = width;
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double getLength()
	{
		return length;
	}
	
	@Override
	double getArea() 
	{
		return width*length;
	}

	@Override
	double getPerimeter() 
	{
		return (width + length)*2;
	}

	@Override
	public String toString() 
	{
		return "Shape: rectangle, width: " + this.width + ", length: "+ this.length + ", color: "+ this.color;
	}

}
