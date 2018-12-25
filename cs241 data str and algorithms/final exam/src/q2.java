import java.util.Iterator;
import java.util.Stack;

public class q2 {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		System.out.println(myStack.size());
		myStack.push("Penny");
		myStack.push("Half Penny");
		myStack.push("Farthing");
		myStack.push("Shilling");
		myStack.push("Crown");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		myStack.pop();
		Iterator iter = myStack.iterator();
		System.out.println(iter.next());
		System.out.println(iter.next());
		myStack.push("Half Crown");
		myStack.push("Sovereign");
		myStack.push("Push");
		myStack.pop();
		myStack.pop();
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.size());

	}

}
