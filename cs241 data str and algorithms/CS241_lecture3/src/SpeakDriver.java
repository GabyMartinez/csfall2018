//prove casting
public class SpeakDriver {

	public static void main(String[]a) {
		Speak deCartes, rusty, prince;
		deCartes = new Dog();//woof
		rusty = new Mathmatician();
		prince =  new Philosopher();
		//the outcome of the method depends on the reference type
		
		System.out.println("rusty says " + (rusty).speak());
		deCartes = new Philosopher(); //Speak interface
		System.out.println("Mr.DeCartes says " + deCartes.speak());
		System.out.println(prince.speak());
		
		//can not cast Philosopher to Mathmatician 
		//can cast Mathmatician to Philosopher
	}
}
