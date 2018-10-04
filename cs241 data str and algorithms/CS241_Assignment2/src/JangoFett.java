
public class JangoFett implements Cloneable{
protected int age, ID;
	
	public JangoFett(){}  //default constructor
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();

	}
	
	public JangoFett(int age, int ID)
	{
		this.age=age;
		this.ID=ID;
	}
	
	public void zeroFett(JangoFett x)//takes a JangoFett obj
	{
		x.age=0; //sets age to 0
		x.ID=0;  //sets ID to 0
	}

	public String toString() //sets what to print when JangoFett obj is printed
	{
		String cloneInfo="";
		cloneInfo="Age: "+age+ " ID:" + ID;
		return cloneInfo;
	}

}
