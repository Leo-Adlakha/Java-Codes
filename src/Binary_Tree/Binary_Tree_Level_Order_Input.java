package Binary_Tree;

import java.util.LinkedList;
import java.util.Scanner;

// 4 
// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 8 -1 9 -1 -1 -1 -1

public class Binary_Tree_Level_Order_Input {

	static Scanner scn = new Scanner ( System.in ) ;
	
	private class Node 
	{
		int data ;
		Node left ;
		Node right ;
	}
	
	private Node root ;
	
	public Binary_Tree_Level_Order_Input()
	{
		int n = scn.nextInt() ;
		this.root = takeInput(null,false,0,n) ;
		traversetree(this.root) ;
		// correcttree(null,this.root);
	}
	
	private void correcttree(Node parent, Node child) 
	{
		
		if ( child == null )
		{
			return ;
		}
		
		if ( child.data == -1 )
		{
			if ( parent.left == child )
			{
				parent.left = null ;
				return ;
			}
			else
			{
				parent.right = null ;
				return ;
			}
		}
		
	    correcttree(child, child.left);
	    correcttree(child, child.right);

	}

	private void traversetree(Node node) 
	{
		
		LinkedList<Node> queue = new LinkedList<>() ;
		LinkedList<Node> helper = new LinkedList<>() ;
		this.root.data = scn.nextInt() ;
		queue.addLast(this.root) ;
	    
		
		while ( !queue.isEmpty() )
		{
			
			Node temp = queue.removeFirst() ;
			if ( temp != null )
			{
				
				helper.addLast(temp.left);
				helper.addLast(temp.right);
			
			}
			
			if ( queue.isEmpty() )
			{
				convert(helper) ;
				correcttree(null,this.root) ;
				queue = helper ;
				helper = new LinkedList<>() ; 
			}
			
		}
		
		
		
		
	}

	private void convert(LinkedList<Node> helper) 
	{
		
		for ( int i = 0 ; i < helper.size() ; i++ )
		{
			
			Node temp = helper.get(i) ;
			if ( temp != null )
			{
			    temp.data = scn.nextInt() ;
			}
			
		}
		
		
	}

	private Node takeInput( Node parent, boolean bl, int i, int n )
	{
		if ( i == n )
		{
			return null ;
		}
		
		Node nn = new Node() ;
		nn.data = 0 ;
		
		nn.left = takeInput(nn,true, i+1, n) ;
		nn.right = takeInput(nn,false, i+1, n) ;
		
		return nn ;
		
	}
	
	public Binary_Tree_Level_Order_Input( int[] a )
	{
		
		LinkedList<Node> queue = new LinkedList<>() ;
		LinkedList<Node> helper = new LinkedList<>() ;
		if ( a[0] != -1 )
		    this.root.data = a[0] ;
		else
		{
			this.root = null ;
			return ;
		}
		int vidx = 1 ;
		int i = 1 ;
		queue.addLast(this.root) ;
	    
		
		while ( !queue.isEmpty() )
		{
			
			Node temp = queue.removeFirst() ;
			if ( temp != null )
			{
				
				helper.addLast(temp.left);
				helper.addLast(temp.right);
			
			}
			
			if ( queue.isEmpty() )
			{
				//convert2(helper,a,vidx,i) ;
				queue = helper ;
				helper = new LinkedList<>() ; 
			}
			
		}
		
		
		
		
	}
	
	
//	private void convert2(LinkedList<Node> helper, int[] a, int vidx, int i) 
//	{
//		
//		int ni = 0 ;
//		int k = 0 ;
//		for ( int j = vidx ; j < vidx + (i*2) ; j++ )
//		{
//			
//			if ( a[j] == -1 )
//			{
//				
//			}
//			Node temp = helper.get(k) ;
//			
//			if ( temp.data = )
//			
//			
//			
//		}
//		
//		
//		
//		
//		
//	}

	public void display ()
	{
		System.out.println("-------------------");
		display(this.root) ;
		System.out.println("-------------------");
	}

	private void display(Node node) 
	{
		if ( node == null )
		{
			return ;
		}
		String str = "" ;
		
		
		if ( node.left == null )
		{
			str += "." ;
		}
		else
		{
			str += node.left.data ;
		}
		
		str += "->" + node.data + "<-" ;
		
		if ( node.right == null )
		{
			str += "." ;
		}
		else
		{
			str += node.right.data ;
		}
		
		System.out.println(str);
		
		display(node.left) ;
		display(node.right) ;
		
		
	}
	
	public static void main(String[] args) 
    {
		
		Binary_Tree_Level_Order_Input bt = new Binary_Tree_Level_Order_Input() ;
		bt.display();
		
	}
	
}
