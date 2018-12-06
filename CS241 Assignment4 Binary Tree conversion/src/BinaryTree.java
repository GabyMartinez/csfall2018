
public class BinaryTree {
	private Node root;
	
	public BinaryTree() {
		this.root=null;
	}
	
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
			//int cL=0,cR=0;
			
			//Your code here: make temp point to last thing in list
			
			while (tempL.left!= null) {
				tempL = tempL.left; //last left node
			//	cL++;
			}
				
			while (tempR.right!= null) {
				tempR = tempR.right; //last right node
			//	cR++;
			}
				
			/*/Your code here: now it is time to link the new node into list
			if(cL<cR)
				tempL.left=newnode;
			else
				tempR.right=newnode;
			*/
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
		public Node(String val) {
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
