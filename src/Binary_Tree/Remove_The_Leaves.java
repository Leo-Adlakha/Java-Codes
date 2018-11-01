package Binary_Tree;

import java.util.Scanner;

/*REMOVE THE LEAVES ( BINARY TREE )
Given a binary tree, remove all the leaves from the tree


Input Format:
Enter the value of the nodes of the tree

Constraints:
None
Output Format:
Display the tree in which all the leaves have been removed in pre-order traversal in the following format :
Left->data => Root->data <= Right->Data 
Output END if left or right node is NULL

Sample Input:
50 true 12 true 18 false false false false
Sample Output:
12 => 50 <= END
END => 12 <= END
Time Limit: 4 sec*/


// 10 true 20 true 40 false false true 50 true 90 false false true 100 false false true 30 true 60 false false true 70 true 80 false false false


public class Remove_The_Leaves {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Remove_The_Leaves m = new Remove_The_Leaves();
		BinaryTree bt = m.new BinaryTree();
		bt.removeLeaves();
		bt.display();
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

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

		public void removeLeaves() {
			this.removeLeaves(null, this.root, false);
		}

		private void removeLeaves(Node parent, Node child, boolean ilc) {
			
			if ( child.left == null && child.right == null )
			{
				if ( ilc )
				{
					parent.left = null ;
				}
				else
				{
					parent.right = null ;
				}
				return ;
			}
			if ( parent == null )
			{
				parent = child ;
			}
			
			if ( parent.left != null )
			    removeLeaves(child, parent.left, true );
			if  ( parent.right != null )
			    removeLeaves(child, parent.right, false );
		
		}

	}

}
