package Generic_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Generic_Tree {

	Scanner scn = new Scanner ( System.in ) ;
	
	private class Node
	{
		
		int data ;
		ArrayList<Node> children = new ArrayList<>() ;
		
	}
	
	private Node root ;
	
	public Generic_Tree()
	{
		this.root = takeInput(null,-1) ;
	}

	private Node takeInput(Node parent, int ith) 
	{
		
		if ( parent == null )
		{
			System.out.println("Enter data for root node :");
		}
		else
		{
			System.out.println("Enter data for " + ith + " node for " + parent.data + " : ") ;
		}
		
		
		int item = scn.nextInt();
		
		Node nn = new Node() ;
		nn.data = item ;
		
		System.out.println("Enter the number of children for " + item );
		int noc = scn.nextInt();
		
		for ( int i = 0 ; i < noc ; i++ )
		{
			Node child = takeInput(nn,i) ;
			nn.children.add(child) ;
		}
		
		return nn ;
	
	}
	
	public void display () 
	{
		System.out.println("_________________");
		display( this.root );
		System.out.println("_________________");
	}

	private void display(Node node) 
	{
		
		String str = node.data + " -> " ;
		
		for ( Node child : node.children )
		{
			str += child.data + ", " ;
		}
		
		str += "." ;
		System.out.println(str);
		
		for ( Node child : node.children )
		{
			display(child) ;
		}
		
		
	}

	public int size ()
	{
		return size(this.root) ;
	}

	private int size(Node node)
	{
		
		int ts = 0 ; 
		
		for ( Node child : node.children )
		{
			int cs = size(child);
			ts += cs ;
		}
		
		return ts + 1 ;
		
	}
	
	public int max () 
	{
		return max ( this.root ) ;
		
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

	public int height ()
	{
		return height( this.root ) ;
	}

	private int height( Node node ) 
	{
		
		int th = -1 ;
		
		for ( Node child : node.children )
		{
			
			int ch = height(child) ;
			if ( ch > th )
			{
				th = ch ;
			}
		}
		
		return th + 1 ;
	}
	
	public boolean finditem( int item )
	{
		return finditem(this.root, item) ;
	}

	private boolean finditem(Node node, int item) 
	{
		if ( node.data == item )
		{
			return true ;
		}
		
		boolean bl ;
		for ( Node child : node.children )
		{
			
			bl = finditem(child, item) ;
			if ( bl )
			{
				return true ;
			}
			
		}
		
		return false ;
		
	}
	
	public void mirroroftree ()
	{
		mirroroftree(this.root) ;
	}

	private void mirroroftree(Node node) 
	{
		
		int left = 0 ;
		int right = node.children.size() - 1 ;
		
		while ( left < right )
		{
			Node ln = node.children.get(left) ;
			Node rn = node.children.get(right) ;
			
			node.children.set(left, rn) ;
			node.children.set(right, ln) ;	
			
			left++ ;
			right-- ;
			
		}
		
		for ( Node child : node.children )
		{
			mirroroftree(child);
		}
		
	}
	
	public void preorder ( )
	{
		preorder(this.root) ;
		System.out.println();
	}

	private void preorder(Node node) 
	{
		System.out.print(node.data + " ");
		
		for ( Node child : node.children )
		{
			preorder(child);	
		}	
	}
	
	public void postorder ( )
	{
		postorder(this.root) ;	
		System.out.println();
	}

	private void postorder(Node node) 
	{
		for ( Node child : node.children )
		{
			postorder(child);	
		}
		System.out.print(node.data + " ");
	}
	
	public void levelorder ()
	{
		levelorder(this.root) ;
	}

	private void levelorder(Node node)
	{
		
		LinkedList<Node> queue = new LinkedList<>() ;
		queue.addLast(node);
		
		while ( !queue.isEmpty() )
		{
			
			Node temp = queue.removeFirst() ;
			
			System.out.print(temp.data + " ");
			
			for ( Node child : temp.children )
			{
				queue.addLast(child);
			}
			
		}
		
	}
	
	public void levelorderLW ()
	{
		levelorderLW(this.root) ;
	}

	private void levelorderLW(Node node)
	{
		
		LinkedList<Node> queue = new LinkedList<>() ;
		LinkedList<Node> helper = new LinkedList<>() ;
		queue.addLast(node);
		
		while ( !queue.isEmpty() )
		{
			
			Node temp = queue.removeFirst() ;
			
			System.out.print(temp.data + " ");
			
			for ( Node child : temp.children )
			{
				helper.addLast(child);
			}
			
			if ( queue.isEmpty() )
			{
				System.out.println();
				queue = helper ;
				helper = new LinkedList<>() ; 
			}
			
		}
		
	}

	// Way2 error
	
	public void levelorderLW2 ()
	{
		levelorderLW2(this.root) ;
	}

	private void levelorderLW2(Node node)
	{
		
		LinkedList<Node> queue = new LinkedList<>() ;
		queue.addLast(node);
		queue.addLast(null);
		
		while ( queue.size()-1 != 0 )
		{
			
			Node temp = queue.removeFirst() ;
			
			for ( Node child : temp.children )
			{
				queue.addLast(child);
			}
			
			System.out.print(temp.data + " ");
			
			if ( queue.size() == 1 )
			{
				queue.removeLast() ;
				System.out.println();
				queue.addLast(null);
			}
			
		}
		
	}

	public void levelorderLW3 ()
	{	
		for ( int i = 0 ; i <= this.height() ; i++ )
		{
			Particularlevelnodes(i);
			System.out.println();
		}
		
	}
	
	public void LOZZ ()
	{
		LOZZ(this.root) ; 
	}

	private void LOZZ( Node node ) 
	{
		
		LinkedList<Node> queue = new LinkedList<>() ;
		LinkedList<Node> stack = new LinkedList<>() ;
		int count = 0 ;
		queue.addLast(node);
		
		while ( !queue.isEmpty() )
		{
			
			Node temp = queue.removeFirst() ;
			
			System.out.print(temp.data + " ");
			
			if ( count % 2 == 0 )
			{
				for ( Node child : temp.children )
				{
					stack.addFirst(child);
				}
				
			}
			else
			{
				for ( int i = temp.children.size() - 1 ; i >= 0 ; i-- )
				{
					stack.addFirst(temp.children.get(i));
				}
			}
			
			
			if ( queue.isEmpty() )
			{
				System.out.println();
				count++ ;
				queue = stack ;
				stack = new LinkedList<>() ; 
			}
			
		}
		
	}

	public void Particularlevelnodes ( int k )
	{
		Particularlevelnodes(this.root, k, 0);
	}

	private void Particularlevelnodes(Node node, int k, int lvl) 
	{
		if ( lvl == k )
		{
			System.out.print(node.data + " ");
			return ;
		}
		
		for ( Node child : node.children )
		{
			Particularlevelnodes(child, k, lvl + 1);	
		}	
		
	}

	private class HeapMover
	{
		int max = Integer.MIN_VALUE ;
		int size = 0 ;
		int height = 0 ;
		boolean find ;
		
		Node pred = null ;
		Node succ = null ;
		Node jl = null ;
	}
	
	public void multisolver ( int item )
	{
		HeapMover mover = new HeapMover() ;
		multisolver(this.root, mover, 0, item ) ;
		System.out.println(mover.max);
		System.out.println(mover.size);
		System.out.println(mover.height);
		System.out.println(mover.find);
		System.out.println(mover.pred == null ? null : mover.pred.data );
		System.out.println(mover.succ == null ? null : mover.succ.data );
		System.out.println(mover.jl == null ? null : mover.jl.data );
		
	}

	private void multisolver(Node node, HeapMover mover, int count, int item ) 
	{
		
		mover.size++ ;
		
		if ( mover.max < node.data )
		{
			mover.max = node.data ;
		}
		
		if ( mover.succ == null && mover.find == true )
		{
			mover.succ = node ;
		}
		
		if ( node.data > item )
		{	
		if ( mover.jl == null || mover.jl.data > node.data )
		{
			mover.jl = node ;
		}
		}
		
		if ( node.data == item )
		{
			mover.find = true ;
		}
		
		if ( mover.find == false )
		{
			mover.pred = node ;
		}
		
		if ( count > mover.height )
		{
			mover.height = count ;
		}
		
		for ( Node child : node.children )
		{
			multisolver(child, mover, count + 1 , item);
		}
		
		
	}

	/*public void pred( int item )
	{
		int ans = pred ( this.root, item, 0) ;
		print
	}

	public void printith ( int pos )
	{
		printith(this.root, 0, pos) ;
	}
	
	private boolean printith ( Node node, int count, int pos )
	{

		if ( count == pos )
		{
			System.out.println(node.data);
			return true ;
		}
		
		for ( Node child : node.children )
		{
			boolean bl = printith(child, count + 1, pos );	
			if ( bl )
			{
				break ;
			}
		}
		
		return false ; 
	}
	
	private int pred(Node node, int item, int count ) 
	{
		if ( node.data == item )
		{
			return 1 ;
		}

		for ( Node child : node.children )
		{
			
			count += pred(child, item, count) ;
			if ( count > 0 )
			{
				return 1 ;
			}
			
		}
		
		return 0 ;
		
		
		
	}*/


	public boolean ismirror ( Generic_Tree other )
	{
		return isMirror( this.root, other.root ) ;
	}

	private boolean isMirror(Node t1, Node t2) 
	{
		
		if ( t1.children.size() != t2.children.size() )
		{
			return false ;
		}
		
		
		for ( int i = 0 ; i < t1.children.size() ; i++ )
		{
			if ( !isMirror(t1.children.get(i), t2.children.get(t2.children.size() - i - 1) ) )
			{
				return false ;
				
			}
		}
		
		return true ;
		
	}

	
	// Do them 
	public void linearize ()
	{
		
		
		
		
	}

	public void flatten ()
	{
		
	}

}
