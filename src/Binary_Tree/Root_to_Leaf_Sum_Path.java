package Binary_Tree;

import java.util.LinkedList;
import java.util.Scanner;

/*ROOT TO LEAF ( BINARY TREE)
Given a binary tree and a number k, print out all root to leaf paths where the sum of all nodes value is same as the given number.


Input Format:
First line contains the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL. Second line contains the number k.

Constraints:
None
Output Format:
Display the root to leaf path whose sum is equal to k.

Sample Input:
10 true 20 true 30 false false true 50 false false true 40 true 60 false false true 73 false false
60
Sample Output:
10 20 30
Explanation:
The given tree is in pre order traversal. So convert it into binary tree and check root to leaf path sum.

Time Limit: 4 sec*/

public class Root_to_Leaf_Sum_Path {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Root_to_Leaf_Sum_Path m = new Root_to_Leaf_Sum_Path();
		BinaryTree bt = m.new BinaryTree();
		int k = scn.nextInt() ;
		bt.getpathtosum(k);
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

		public void getpathtosum( int rsum ) 
		{
			LinkedList<Integer> list = new LinkedList<Integer>() ;
			getpathtosum(this.root,list,0,rsum);
		}
		
		private boolean bl = false ;
		
		private void getpathtosum(Node node, LinkedList<Integer> list, int sum, int rsum ) 
		{
			
			if ( sum == rsum )
			{
				int i = 0 ;
				while ( i < list.size() )
				{
					System.out.print(list.get(i)+" ");
					i++ ;
				}
				bl = true ;
				return ;
			}
			else if ( sum > rsum )
			{
				return ;
			}

			if ( node == null )
			{
				return ;
			}
			
			
			list.addLast(node.data);
			getpathtosum(node.left, list, sum + node.data, rsum);
			if ( !bl )
			    getpathtosum(node.right, list, sum + node.data, rsum);
			list.removeLast() ;
			
			
		}

	}

}
