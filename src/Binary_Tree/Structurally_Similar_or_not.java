package Binary_Tree;

import java.util.Scanner;

/*STRUCTURALLY IDENTICAL (BINARY TREE)
Given two trees check if they are structurally identically


Input Format:
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints:
None
Output Format:
Display the Boolean result

Sample Input:
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output:
true
Time Limit: 4 sec*/

public class Structurally_Similar_or_not {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Structurally_Similar_or_not m = new Structurally_Similar_or_not();
		BinaryTree bt1 = m.new BinaryTree();
		BinaryTree bt2 = m.new BinaryTree();
		System.out.println(bt1.structurallyIdentical(bt2));
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public boolean structurallyIdentical(BinaryTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node tnode, Node onode) 
		{
			if ( tnode == null || onode == null )
			{
				return true ;
			}
			if ( ( tnode.left == null && onode.left != null ) || ( tnode.left != null && onode.left == null ) )
			{
				return false ;
			}
			else if ( ( tnode.right == null && onode.right != null ) || ( tnode.right != null && onode.right == null ) )
			{
				return false ; 
			}
				
			if ( !structurallyIdentical(tnode.left, onode.left ) )
			{
				return false ;
			}
			
			if ( !structurallyIdentical(tnode.right, onode.right ) )
			{
				return false ;
			}
			
			return true ;
			
			
			
		}

	}
	
}
