package Author;

public class TestBall 
{
	 public static void main(String[] args) 
	 {
		 Ball b1 = new Ball(100, 100, 20);
		 System.out.println(b1);
		 
		 b1.move(30, 15, 10);
		 System.out.println(b1);
	 }
	
}
