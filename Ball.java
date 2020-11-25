package Author;

public class Ball 
{
	 private double x = 0.0;
	 private double y = 0.0;
	 private double v = 0.0;
	 
	 public Ball(){}
	 
	 public Ball(double x, double y, double v)
	 {
		 this.x = x;
		 this.y = y;
		 this.v = v;
	 }
	 
	 public double getX() 
	 {
		 return x;
	 }
	 
	 public double getY() 
	 {
		 return y;
	 }
	 
	 public void setX(double x) 
	 {
		 this.x = x;
	 }
	 
	 public void setY(double y) 
	 {
		 this.y = y;
	 }
	 
	 
	 public double getV() 
	 {
		 return v;
	 }
	 
	 public void setXY(double x, double y)
	 {
		 this.x = x;
		 this.y = y;
	 }
	 
	 public void setXYSpeed()
	 {
		 this.v = v;
	 }
	 
	 public void move( double xDisp, double yDisp, double vDisp)
	 {
		 x+=xDisp;
		 y+=yDisp;
		 v-=vDisp;
	 }
	 
	 
	 public String toString() 
	 {
		 return "Ball @ ("+this.x+", "+this.y+" , "+ this.v + ").";
	 }
}
