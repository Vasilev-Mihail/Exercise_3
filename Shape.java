package Shape;

public abstract class Shape 
{
	protected String color;
	protected boolean filled;
	
	public Shape(){}
	
	public Shape(String collor, boolean filled)
	{
		this.color = collor;
		this.filled = filled;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	

	abstract double getArea();
	
	abstract double getPerimeter();
	
	abstract public String toString();
}
