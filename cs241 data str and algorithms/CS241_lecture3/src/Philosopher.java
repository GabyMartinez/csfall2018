
public class Philosopher implements Speak{
	private String saying = "Hello World";
	
	Philosopher() {
	}
		
	Philosopher(String a){
		saying = a;
	}

	@Override
	public String speak() {
		return saying;
	}
	

	

}
