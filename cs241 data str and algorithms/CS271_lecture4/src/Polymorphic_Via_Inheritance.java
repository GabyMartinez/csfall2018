
public class Polymorphic_Via_Inheritance {
	public static void main(String[]a) {
		Animal rusty;
		Horse beu = new Horse();
		rusty = beu;
		//parent = child works
		
		//rusty = new Animal();
		//rusty = new Horse(); //also works - same as line 6
		//Animal cannot be cast to Horse //parent cannot be cast to child
		
		System.out.println(rusty.noise());//prints I am a horse. not "I am an animal"
		System.out.println(beu.noise());
		System.out.println(beu);
		
		Animal prince = new Horse();
		beu = (Horse)prince;
		System.out.println(prince); //error: Animal cannot be cast to Horse
		
		//loop
		
		
	}
}
