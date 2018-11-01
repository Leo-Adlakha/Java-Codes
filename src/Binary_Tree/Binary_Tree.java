package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Binary_Tree 
{

	Scanner scn = new Scanner (System.in) ;
	
	private class Node
	{
		
		int data ;
		Node left ;
		Node right ;
		
	}
	
	private Node root ;
	
	public Binary_Tree ()
	{
		this.root = takeInput(null,false) ;
	}

	private Node takeInput(Node parent, boolean ilc) 
	{
		if ( parent == null )
		{
			System.out.println("Enter the data for the root node: ");
		}
		else
		{
			if ( ilc )
			{
				System.out.println("Enter the data for left child for " + parent.data + ":" );
			}
			else
			{
				System.out.println("Enter the data for right child for " + parent.data + ":" );
			}
		}
		
		Node nn = new Node() ;
		nn.data = scn.nextInt() ;
		
		System.out.println("Do you want left child for :" + nn.data );
		boolean wlc = scn.nextBoolean() ;
		
		if ( wlc )
		{
			nn.left = takeInput(nn,true) ;
		}
		
		System.out.println("Do you want right child for :" + nn.data );
		boolean wrc = scn.nextBoolean() ;
		
		if ( wrc )
		{
			nn.right = takeInput(nn,false) ;
		}
		
		return nn ;
		
	}
	
	// with Preorder and Inorder
//	public Binary_Tree( int[] pre, int[] in )
//	{
//		this.root = construct ( pre,0,pre.length - 1, in, 0 , in.length - 1 ) ;
//	}
//	
//	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi ) 
//	{
//		if ( plo > phi || ilo > ihi )
//		{
//			return null ;
//		}
//		
//		Node nn = new Node() ;
//		nn.data = pre[plo] ;
//		
//		int si = - 1 ;
//		for ( int i = ilo ; i <= ihi ; i++ )
//		{
//			if ( in[i] == pre[plo] )
//			{
//				si = i ;
//				break ;
//			}
//		}
//		
//		int nel = si - ilo ;
//		
//		nn.left = construct(pre, plo + 1, plo + nel , in, ilo, si - 1 );
//		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);
//		
//		return nn ;
//		
//	}
	
	// with postorder and inorder
//	public Binary_Tree( int[] post, int[] in )
//	{
//		this.root = construct ( post,0,post.length - 1, in, 0 , in.length - 1 ) ;
//	}
//	
//	private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi ) 
//	{
//		if ( plo > phi || ilo > ihi )
//		{
//			return null ;
//		}
//		
//		Node nn = new Node() ;
//		nn.data = post[phi] ;
//		
//		int si = - 1 ;
//		for ( int i = ilo ; i <= ihi ; i++ )
//		{
//			if ( in[i] == post[phi] )
//			{
//				si = i ;
//				break ;
//			}
//		}
//		
//		int nel = si - ilo ;
//		
//		nn.left = construct(post, plo, plo + nel - 1 , in, ilo, si - 1 );
//		nn.right = construct(post, plo + nel, phi - 1, in, si + 1, ihi);
//		
//		return nn ;
//		
//	}
	
	// With post and pre // Exception : tree should be full // Do at Home
	

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
	
	public int size ()
	{
		return size(this.root) ;
	}

	private int size(Node node) 
	{
		if ( node == null )
		{
			return 0 ;
		}
		int l = size ( node.left ) ;
		int r = size ( node.right ) ;
		
		return l + r + 1 ;
		
	}
	
	public boolean find ( int item )
	{
		return find(this.root, item) ;
	}

	private boolean find(Node node, int item ) 
	{
		if ( node == null )
		{
			return false ;
		}
		if ( node.data == item )
		{
			return true ;
		}
		boolean l = find ( node.left, item ) ;
		boolean r = find ( node.right, item ) ;
		
		return (l||r) ;
		
	}
	
	public int height ()
	{
		return height ( this.root ) ;
	}

	private int height(Node node ) 
	{
		if ( node == null )
		{
			return -1 ;
		}
		
		int l = 0 ; 
		int r = 0 ;
		
		l += height ( node.left ) ;
		r += height ( node.right ) ;
		
		if ( l > r )
		{
			return l + 1 ;
		}
		else
		{
			return r + 1 ;
		}
		
	}
	
	public int max ()
	{
		return max ( this.root, Integer.MIN_VALUE ) ;
	}

	private int max(Node node, int max ) 
	{
		if ( node == null )
		{
			return Integer.MIN_VALUE ;
		}
		
		
		int l = max ( node.left, max ) ;
		int r = max ( node.right, max ) ;
		
		if ( l > r )
		{
			if ( l > node.data )
			    return l ;
			else
			{
				return node.data ;
			}
		}
		else
		{
			if ( r > node.data )
			    return r ;
			else
			{
				return node.data ;
			}
		}
		
	}
	
	// O(n^2)
	public int diameter ( )
	{
		return diameter(this.root) ;
	}

	private int diameter( Node node ) 
	{
		if ( node == null )
		{
			return 0 ;
		}
		
		
		int ld = diameter(node.left) ;
		int rd = diameter(node.right) ;
		int sp = height ( node.left ) + height ( node.right ) + 2 ;
		
		
		return Math.max(sp, Math.max(ld, rd)) ;
		
	}

	// O(n)
	public int diameter2 ( )
	{
		return diameter2(this.root).diameter ;
	}
	
	// How to return multiple data types from a function 
	private class diapair
	{
		int ht = - 1 ;
		int diameter = 0 ;
	}
	
	private diapair diameter2 ( Node node )
	{
		if ( node == null )
		{
			diapair base = new diapair() ;
			return base ;
		}
		diapair ldp = diameter2(node.left ) ;
		diapair rdp = diameter2(node.right ) ;
		
		diapair np = new diapair() ;
		
		np.ht = Math.max(ldp.ht, rdp.ht) + 1 ;
		
		int ld = ldp.diameter ;
		int rd = rdp.diameter ;
		int sp = ldp.ht + rdp.ht + 2 ;
		
		np.diameter = Math.max(sp, Math.max(ld, rd)) ;
		
		return np ;
		
	}

	private  class BalPair
	{
		int ht = - 1 ;
		boolean isbal = true ;
	}
	
	public boolean isbalanced()
	{
		return isbalanced ( this.root ).isbal ;
	}

	private BalPair isbalanced(Node node) 
	{
		if ( node == null )
		{
			BalPair bp = new BalPair() ; 
			return bp ;
		}
		
		BalPair lbp = isbalanced(node.left) ;
		BalPair rbp = isbalanced(node.right) ;
		
		BalPair np = new BalPair () ;
		
		np.ht = Math.max(lbp.ht, rbp.ht) + 1 ;
		
		int bf = Math.abs(lbp.ht - rbp.ht) ;
		
		if ( lbp.isbal && rbp.isbal && bf <= 1 )
		{
			np.isbal = true ;
		}
		else
		{
			np.isbal = false ;
		}
		
		return np ;
		
	}

//	public ArrayList<Integer> getpath (int item)
//	{
//		return getpath ( this.root, item ) ;
//	}
//
//	private ArrayList<Integer> getpath(Node node, int item) 
//	{
//		
//		if ( node == null )
//		{
//			ArrayList<Integer> base = new ArrayList<>() ;
//			return base ;
//		}
//		if ( node.data == item )
//		{
//			return true ;
//		}
//		boolean l = find ( node.left, item ) ;
//		boolean r = find ( node.right, item ) ;
//		
//		return (l||r) ;
//	}
	
	public void preorder()
	{
		preorder(this.root) ;
		System.out.println();
	}

	private void preorder(Node node) 
	{

		if ( node == null )
		{
			return ;
		}
	
		System.out.print(node.data + " ");
		
		preorder ( node.left ) ;
		
		preorder ( node.right ) ;

	}
	
	public void postorder()
	{
		postorder(this.root) ;
		System.out.println();
	}

	private void postorder(Node node) 
	{

		if ( node == null )
		{
			return ;
		}
	
		postorder ( node.left ) ;
		
		postorder ( node.right ) ;
		
		System.out.print(node.data + " ");
		
	}
	
	public void inorder()
	{
		inorder(this.root) ;
		System.out.println();
	}

	private void inorder(Node node) 
	{

		if ( node == null )
		{
			return ;
		}
	
		inorder ( node.left ) ;
		
		System.out.print(node.data + " ");
		
		inorder ( node.right ) ;

	}
	
	private class Pair
	{
		Node node ;
		boolean sw ;
		boolean lw ;
		boolean rw ;
	}
	
	public void preorderI()
	{
		LinkedList<Pair> stack = new LinkedList<>() ;
		Pair np = new Pair() ;
		np.node = this.root ;
		stack.addFirst(np);
		
		while ( !stack.isEmpty() )
		{
			
			Pair tp = stack.getFirst() ;
			
			if ( tp.node == null )
			{
				stack.removeFirst() ;
				continue ;
			}
			
			if ( !tp.sw )
			{
				System.out.print(tp.node.data + " " );
				tp.sw = true ;
			}
			else if ( !tp.lw )
			{
				Pair lp = new Pair() ;
				lp.node = tp.node.left ;
				tp.lw = true ;
				stack.addFirst(lp);
			}
			else if ( !tp.rw )
			{
				Pair rp = new Pair() ;
				rp.node = tp.node.right ;
				tp.rw = true ;
				stack.addFirst(rp);
			}
			else
			{
				stack.removeFirst() ;
			}
			
		}
		System.out.println();
	}
	
	public void postorderI()
	{
		LinkedList<Pair> stack = new LinkedList<>() ;
		Pair np = new Pair() ;
		np.node = this.root ;
		stack.addFirst(np);
		
		while ( !stack.isEmpty() )
		{
			
			Pair tp = stack.getFirst() ;
			
			if ( tp.node == null )
			{
				stack.removeFirst() ;
				continue ;
			}
			
			if ( !tp.lw )
			{
				Pair lp = new Pair() ;
				lp.node = tp.node.left ;
				tp.lw = true ;
				stack.addFirst(lp);
			}
			else if ( !tp.rw )
			{
				Pair rp = new Pair() ;
				rp.node = tp.node.right ;
				tp.rw = true ;
				stack.addFirst(rp);
			}
			else if ( !tp.sw )
			{
				System.out.print(tp.node.data + " " );
				tp.sw = true ;
			}
			else
			{
				stack.removeFirst() ;
			}
			
		}
		System.out.println();
	}
	
	public void inorderI()
	{
		LinkedList<Pair> stack = new LinkedList<>() ;
		Pair np = new Pair() ;
		np.node = this.root ;
		stack.addFirst(np);
		
		while ( !stack.isEmpty() )
		{
			
			Pair tp = stack.getFirst() ;
			
			if ( tp.node == null )
			{
				stack.removeFirst() ;
				continue ;
			}
			
			
		    if ( !tp.lw )
			{
				Pair lp = new Pair() ;
				lp.node = tp.node.left ;
				tp.lw = true ;
				stack.addFirst(lp);
			}
			else if ( !tp.sw )
			{
				System.out.print(tp.node.data + " " );
				tp.sw = true ;
			}
			else if ( !tp.rw )
			{
				Pair rp = new Pair() ;
				rp.node = tp.node.right ;
				tp.rw = true ;
				stack.addFirst(rp);
			}
			else
			{
				stack.removeFirst() ;
			}
			
		}
		System.out.println();
	}

	

}
