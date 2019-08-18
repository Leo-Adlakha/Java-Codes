package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*ARRAYLIST OF LEVELS ( BINARY TREE )
Given a Binary tree, write code to create a separate array list for each level. You should return an arraylist of arraylist.


Input Format:
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints:
None
Output Format:
Display the resulting arraylist of arraylist according to given sample examples.

Sample Input:
50 true 12 true 18 false false true 13 false false false
Sample Output:
[[50], [12], [18, 13]]
Time Limit: 4 sec*/

public class ArrayList_of_Levels {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList_of_Levels m = new ArrayList_of_Levels();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() 
		{
			return levelArrayList(this.root) ;			
		}

		private ArrayList<ArrayList<Integer>> levelArrayList(Node node) {
			
			LinkedList<Node> queue = new LinkedList<>() ;
			LinkedList<Node> helper = new LinkedList<>() ;
			queue.addLast(node) ;
			
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;
			ArrayList<Integer> levelans = new ArrayList<>() ;
			
			while ( !queue.isEmpty() )
			{
				
				
				Node temp = queue.removeFirst() ;
				
				levelans.add(temp.data) ;
				
				if ( temp.left != null )
				    helper.addLast(temp.left);
				if ( temp.right != null )
				    helper.addLast(temp.right);
				
				
				if ( queue.isEmpty() )
				{
					ans.add(levelans) ;
					levelans = new ArrayList<>() ;
					queue = helper ;
					helper = new LinkedList<>() ;
					
				}
			}
			
			return ans ;
		}
		
       
	}
	
}
