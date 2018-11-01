package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;

/*JUST LARGER ( GENERIC TREES )
Given a tree and a number n. Find next larger element in the Tree i.e find a node with value just greater than n


Input Format:
Enter the value of the node and then its number of children , further add value of the 1st children and then its number of children and so on in a space separated manner. Then enter the number n.

Constraints:
None
Output Format:
Display the just larger element

Sample Input:
80 3 40 2 110 0 120 0 60 0 70 1 140 0
120
Sample Output:
140
Time Limit: 4 sec*/

public class Next_Larger {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Next_Larger m = new Next_Larger();
		GenericTree gt = m.new GenericTree();
		int data = scn.nextInt();
		gt.findJustLarger(data);
	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(scn, null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
		}

		public void findJustLarger(int data) {
			HeapMover hm = new HeapMover();
			this.findJustLarger(this.root, hm, data);

			System.out.println(hm.justLarger == null ? "-1" : hm.justLarger.data);
		}

		private void findJustLarger(Node node, HeapMover rb, int data) {

			
			if ( node.data > data )
			{
				if ( rb.justLarger == null )
				{
					rb.justLarger = node ;
				}
				else if ( node.data < rb.justLarger.data )
				{
					rb.justLarger = node ;
				}
			}
			for ( Node child : node.children )
			{
				findJustLarger(child, rb, data);
			}
			
		}

		private class HeapMover {
			Node justLarger = null;
		}

	}

}
