
public class User implements Cloneable{
	
	private String username;
	private int score;
	
	public User() {
		username = "user";
		score = 0;
	}
	
	public User(String name, int score) {
		username = name;
		this.score = score;
	}
	
	public void voidUser() {
		username = "user";
		score = 0;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();

	}
	
	public String toString() //sets what to print when JangoFett obj is printed
	{
		String string = "Username: " + username + "  Score: " + score;
		return string;
	}
}
