package Author;

public class Author 
{
	private String name;
	private String email;
	private char gender;
	
	public Author(String n, char g, String e)
	{
		name = n;
		email = e;
		gender = g;
	}
	
	public void setName(String n) 
	{
		name = n;
	}
		 
	public String getName(String n)
	{
		 return n;
	}
	
	public void setEmail(String e)
	{
		email = e;
	}
	
	public String getEmail(String e)
	{
		return e;
	}
	
	public int getGender(int g)
	{
		return g;
	}
	
	public String toString()
	{
		return this.name + " " + this.gender + " " + this.email;
	}
}
