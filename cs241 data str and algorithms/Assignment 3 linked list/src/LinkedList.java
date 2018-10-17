
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
		   
		   while(current.next != null) {
			   current = current.next;
		   }
		   current.next=x;
	   }
	   
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
	   
	/*   public void remove(String val) {
		   Node prev = list;
		   Node current = list;
		   Node next = current.next;
		   
		   if(list.next == null && val.equalsIgnoreCase(current.value)) {
			   list = null;
		   }
		   
		   while(current.next != null) {
			   if(val.equalsIgnoreCase(current.value))
				   prev.next = next;
			   	prev = current;
				current = current.next;
		   }
		   
		   if(current.next==null && val.equalsIgnoreCase(current.value)) {
			   prev.next=null;
		   }
		   
	   }
	  
	   public void insert(String val, int index) {
		   Node insert = new Node(val);
		   Node current = list;
		   Node temp = list;
		   int count = 0;
		   if (index==1) {
			   insert.next = list;
		   }
		   else {
			   while(current.next != null && count != index) {
				   count++;
				   current = current.next;
			   }
			   temp = current;
			   current.next = insert;
			   insert.next = temp.next;
		   }
		   
	   }
	  */ 
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
