import java.util.Arrays;
public class UserDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		User u1 = new User("gm35", 15);
		User u2 = new User("tonyMacroni", 1500);
		User u3 = new User("yeti73", 500);
		
		User[] userArray = {u1, u2, u3};
		User[] deepcopy = new User[userArray.length];
		User[] shallowcopy = userArray;
		
		for(int i=0; i<userArray.length; i++) //for every index of userArray
		{
			deepcopy[i]= (User)userArray[i].clone(); //clone to deepcopy array
		}
		
		
		System.out.println(u1 + "; " + u2 + "; " + u3);
		System.out.println("Original Array	= " + Arrays.toString(userArray));
		System.out.println("Deep Copy	= " + Arrays.toString(deepcopy));
		System.out.println("Shallow Copy	= " + Arrays.toString(shallowcopy) + "\n");
		
		u1.voidUser(); //clears user data
		
		System.out.println("Original Array	= " + Arrays.toString(userArray));
		System.out.println("Deep Copy	= " + Arrays.toString(deepcopy)); //deep copy: doesn't change when original changes
		System.out.println("Shallow Copy	= " + Arrays.toString(shallowcopy) + "\n"); //shallow copy: changes when original changes
		
		//shallow copy makes an array that points to the first array (alias), 
		//		so when something changes in the first array, the copy changes as well
		
		//deep copy creates a new array with a different reference in memory with the same numbers as the original array
		//		so when something changes in the first array, it doesn't effect the copy since it has its own space in memory
			
		
		
		
		
		

	}

}
