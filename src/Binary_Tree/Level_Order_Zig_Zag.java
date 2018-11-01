package Binary_Tree;

import java.util.LinkedList;
import java.util.Scanner;

/*LEVEL ORDER ( ZIGZAG , BINARY TREE)
Given a binary tree. Print the zig zag order i.e print level 1 from left to right, level 2 from right to left and so on. This means odd levels should get printed from left to right and even levels should be printed from right to left. Each level should be printed at a new line.


Input Format:
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints:
None
Output Format:
Display the values in zigzag level order in which each value is separated by a space

Sample Input:
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output:
10 30 20 40 50 60 73 
Time Limit: 4 sec*/

public class Level_Order_Zig_Zag {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Level_Order_Zig_Zag m = new Level_Order_Zig_Zag();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			
			LinkedList<Node> stack = new LinkedList<>() ;
			LinkedList<Node> queue = new LinkedList<>() ;
			queue.addLast(this.root);
			int count = 0 ;
			
			while ( !queue.isEmpty() )
			{
				
				Node temp = queue.removeFirst() ;
				
				if ( temp != null )
				{
					System.out.print( temp.data + " " );
					if ( count % 2 == 0 )
					{
						stack.addFirst(temp.left);
						stack.addFirst(temp.right);
					}
					else
					{
						stack.addFirst(temp.right);
						stack.addFirst(temp.left);
					}
				}
				
				if ( queue.isEmpty() )
				{
					queue = stack ;
					stack = new LinkedList<>() ;
					count++ ;
				}
				
				
			}
			
			
		}

	}

	
}
