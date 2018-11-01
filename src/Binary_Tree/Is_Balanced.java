package Binary_Tree;

import java.util.Scanner;

/*IS_BALANCED ( BINARY TREE )
Given a Binary tree check if it is balanced i.e. depth of the left and right sub-trees of every node differ by 1 or less.


Input Format:
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints:
None
Output Format:
Display the Boolean result

Sample Input:
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output:
true
Time Limit: 4 sec
*/
public class Is_Balanced {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Is_Balanced m = new Is_Balanced();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) 
		{
			if ( node == null )
			{
				return new BalancedPair() ;
			}
			
			
			BalancedPair lbp = isBalanced(node.left) ;
			BalancedPair rbp = isBalanced(node.right) ;
			
			BalancedPair np = new BalancedPair() ;
			
			np.height = Math.max(lbp.height, rbp.height ) + 1 ;
			
			int hd = Math.abs( lbp.height - rbp.height ) ;
			
			if ( lbp.isBalanced && rbp.isBalanced && hd < 2  )
			{
				np.isBalanced = true ;
			}
			else
			{
				np.isBalanced = false ;
			}
			
			return np ;
 			
		}

		private class BalancedPair {
			int height = -1 ;
			boolean isBalanced = true ;
		}

	}
	
}
