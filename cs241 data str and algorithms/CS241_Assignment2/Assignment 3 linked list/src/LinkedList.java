
public class LinkedList {
	private Node list;
	   //Sets up an initially empty list
	   public LinkedList()
	   {
	      list = null;
	   }
	   
	   //adds new node to the end of the list
	   public void add(Node x) {
		   Node current = list;
		   
		   if(list==null) {
			   current.next = x;
		   }
		   else {
			   while(current.next != null) {
				   current = current.next;
			   }
			   current.next=x;
		   }
	   }
	   
	   //adds a new node taking a string
	   public void add(String val) {
		   Node x = new Node(val);
		   Node current = list;
		   
		   if(list==null) {
			   list = x;
		   }
		   else {
			   while(current.next != null) {
				   current = current.next;
			   }
			   current.next=x;
		   }
	   }
	   
	   //length of list
	   public int sizeOf() {
		   Node current = list;
		   int count = 0;
		   if(list==null)
			   count = 0;
		   else {
			   while(current != null) {
				   count++;
				   current = current.next;
			   }
		   }
		   return count;
	   }
	   
	   //tells you if the list is empty
	   public boolean isEmpty() {
		   boolean empty = false;
		   if(list==null)
			   empty=true;
		   return empty;
	   }
	   
	   public String toString() {
		   String result = "";
		   Node current = list;
		   while(current != null) {
			   result += current.value + "\n";
			   current = current.next;
		   }
		   
		   return result;
	   }
	   
	   private class Node
	    {
		   public String value;
	       public Node next;
	       
	       public Node() {
	    	   value = "";
	    	   next = null;
	       }
	       
	       public Node(String val) {
	    	   value = val;
	    	   next = null;
	       }
	       
	       public Node(String val, Node next) {
	    	   value = val;
	    	   this.next = next;
	       }
	    }
}
