package Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;

/*STRUCTURALLY IDENTICAL( GENERIC TREE)
Given two trees, return true if they are structurally identical they are made of nodes with the same values arranged in the same way.


Input Format:
Enter the value of the node and then its number of children , further add value of the 1st children and then its number of children and so on in a space separated manner

Constraints:
None
Output Format:
Display the Boolean result

Sample Input:
10 3 20 2 50 0 60 0 30 1 70 0 40 3 80 0 90 0 100 0
80 3 40 2 110 0 120 0 60 0 70 1 140 0
Sample Output:
false
Time Limit: 4 sec*/

public class Structurally_Identical_Generic_Tree {

	Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {

		Structurally_Identical_Generic_Tree m = new Structurally_Identical_Generic_Tree();
		GenericTree gt1 = m.new GenericTree();
		GenericTree gt2 = m.new GenericTree();

		System.out.println(gt1.structurallyIdentical(gt2));

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

		public boolean structurallyIdentical(GenericTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node node, Node other ) 
		{
			
			if ( node.children.size() != other.children.size() )
			{
				return false ;
			}
			
			boolean bl = true ;
			
			for ( int i = 0, j = 0 ; i < node.children.size() && j < other.children.size()  ; i++,j++ )
			{
				Node child = node.children.get(i) ;
				Node child2 = other.children.get(j) ;
				bl = structurallyIdentical( child, child2 ) ;
				if ( !bl )
				{
					break ;
				}
			}
			
			return bl ;
			
		}


	}
	
}
