
public class BinaryTree {
	private Node root;
	
	public BinaryTree() {
		this.root=null;
	}
	/*
	public void insert(String s) {
		Node newnode = new Node(s);
		if(root==null)  //add node to front
			root = new Node(s);
		else if(root.left==null) //add node to ->left
			root.left = newnode;
		else if(root.right==null) //add node to <- node right
			root.right = newnode;
		else //add the node to the end
		{
			Node tempL = root;
			Node tempR = root;
			
			//Your code here: make temp point to last thing in list		
			//Your code here: now it is time to link the new node into list
			
		}
	}
	*/

	public void insert(String s) {
		root = insert_at_sub(s, root);
	}
	private Node insert_at_sub(String s, Node p) {
		 if (p == null) {
		        return new Node(s);
		    } 
		 else if (s.compareTo(p.val)<0) {
		        p.left = insert_at_sub(s,p.left);
		    } 
		 else if (s.compareTo(p.val)>0) {
		        p.right = insert_at_sub(s, p.right);
		    }
		return p;
	}
	
	public void print() {
		print_sub(root);
	}
	private void print_sub(Node p){
		 if (p!=null) {
			 print_sub(p.left);
		     System.out.println(p.val);
		     print_sub(p.right);
		 }
	}
	
	private class Node{
		String val;
		Node left,right;
		
		public Node() {
			val = "";
			left=null;
			right=null;
		}
		public Node(String val) { //<- this constructor most used
			this.val = val;
			left =null;
			right=null;
		}
		public Node(String val, Node left, Node right){
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}

}
