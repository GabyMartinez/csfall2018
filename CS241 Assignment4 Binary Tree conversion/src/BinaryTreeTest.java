import java.util.Scanner;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree mytree = new BinaryTree();
		Scanner scan = new Scanner(System.in);
		String input = ".";
		
	//	System.out.println("ENTER A NAME (. when done)");
	//	input=scan.nextLine();
		
		while(input.length()!=0) {
			System.out.println("ENTER A NAME (. when done)");
			input=scan.nextLine();
			mytree.insert(input);			
		}
		
		System.out.println("Here are the names, in order.");
		mytree.print();

	}

}
