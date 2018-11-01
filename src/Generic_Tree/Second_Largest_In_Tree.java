package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;

/*SECOND LARGEST( GENERIC TREE)
Find the second largest value in the tree.


Input Format:
Enter the value of the node and then its number of children , further add value of the 1st children and then its number of children and so on in a space separated manner.

Constraints:
None
Output Format:
Display the resulting number

Sample Input:
80 3 40 2 110 0 120 0 60 0 70 1 140 0
Sample Output:
120
Time Limit: 4 sec*/

public class Second_Largest_In_Tree {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Second_Largest_In_Tree m = new Second_Largest_In_Tree();
		GenericTree gt = m.new GenericTree();
		gt.findSecondLargest();
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

		public int max() {
			return this.max(this.root);
		}

		private int max(Node node) 
		{
			int max = Integer.MIN_VALUE ; 

			for ( Node child : node.children )
			{
				
				int tmax = max ( child ) ;
				if ( tmax > max )
				{
					max = tmax ;
				}

			}
			
			if ( max < node.data )
			{
				max = node.data ;
			}
			
			return max ;
		}

		public void findSecondLargest() {

			HeapMover rb = new HeapMover() ;
			int data = max() ;
			findSecondLargest(this.root, rb, data);
			System.out.println(rb.sL);
		}

		private void findSecondLargest(Node node, HeapMover rb, int data) 
		{

			if ( node.data > rb.sL && node.data < data )
			{
				rb.sL = node.data ;
			}
			
			for ( Node child : node.children )
			{
				findSecondLargest(child, rb, data);				
			}
			
		}

		private class HeapMover {
			
			int sL = Integer.MIN_VALUE ;
		}

	}
}
