package Binary_Search_Tree;

public class BST {

	private class Node
	{
		int data ;
		Node right ;
		Node left ;
	}

	private Node root ;
	
	public BST( int[] in )
	{
		this.root = construct( in , 0 , in.length - 1 ) ;
	}

	private Node construct(int[] in, int ilo, int ihi) 
	{
		if ( ilo > ihi )
		{
			return null ;
		}
		
		int mid = ( ilo + ihi ) / 2 ;
		Node nn = new Node () ;
		nn.data = in[mid] ;
		
		nn.left = construct(in, ilo, mid-1) ;
		nn.right = construct(in, mid + 1, ihi) ;
		
		return nn ;
	}
	
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
			str += "END" ;
		}
		else
		{
			str += node.left.data ;
		}
		
		str += " => " + node.data + " <= " ;
		
		if ( node.right == null )
		{
			str += "END" ;
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
		
		if ( node.data > item )
		{
			return find(node.left, item) ;
		}
		else if ( node.data < item )
		{
			return find(node.right, item) ;
		}
		else
		{
			return true ;
		}
		
		
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
		if ( node.right == null )
		{
			return node.data ;
		}
		
		return max(node.right, max) ;
	}
	
	public void inrange ( int lo , int hi )
	{
		inrange( this.root, lo, hi ) ;
		System.out.println();
	}

	private void inrange(Node node, int lo, int hi) 
	{
		if ( node == null )
		{
			return ;
		}
		
		if ( node.data < lo )
		{
			inrange(node.right, lo, hi);
		}
	    else if ( node.data > hi )
		{
			inrange(node.left, lo, hi);
		}
	    else		
	    {
	    	inrange(node.left, lo, hi);
	    	System.out.print(node.data + " " );
	    	inrange(node.right, lo, hi);
			
		}
		
		
	}

	public void printdec ()
	{
		printdec(this.root);
		System.out.println();
	}

	private void printdec(Node node) 
	{
		if ( node == null )
		{
			return ;
		}
		
		printdec(node.right);
		System.out.print(node.data + " " );
		printdec(node.left);
		
	}

	public class HeapMover
	{
		int sum = 0 ;
	}
	
	public void replacewithsumL ()
	{
		HeapMover mover = new HeapMover() ;
		replacewithsumL(this.root, mover);
	}

	private void replacewithsumL(Node node, HeapMover mover) 
	{
		if ( node == null )
		{
			return ;
		}
		
		replacewithsumL(node.right, mover) ;
		int sum = mover.sum ;
		mover.sum += node.data ;
		node.data = sum ;
		replacewithsumL(node.left, mover) ;
		
		
	}

	public void display2 ()
	{
		
	}
	
	public void additem ( int item )
	{
		additem(this.root, item) ;
	}

	private void additem(Node node, int item) 
	{
		if ( node.right == null && item > node.data )
		{
			Node nn = new Node () ;
			nn.data = item ;
			node.right = nn ;
			return ;
		}
		else if ( node.left == null && item < node.data )
		{
			Node nn = new Node () ;
			nn.data = item ;
			node.left = nn ;
			return ;
		}
		
		
		if ( item > node.data )
		{
			additem(node.right, item);
		}
		else if ( item < node.data )
		{
			additem(node.left, item);
		}
		
	}
	
	public void remove ( int item )
	{
		remove(this.root, item, null );
	}

	private void remove(Node node, int item, Node parent) 
	{
		
		if ( item > node.data )
		    remove(node.right, item, node);
		else if ( item < node.data )
			remove(node.left, item, node);
		else
		{
			if ( node.left == null && node.right == null )
			{
				if ( node.data > parent.data )
				{
					parent.right = null ;
				}
				else
				{
					parent.left = null ;
				}
			}
			else if ( node.left == null && node.right != null )
			{
				if ( node.data > parent.data )
				{
					parent.right = node.right ;
				}
				else
				{
					parent.left = node.right ;
				}
			}
			else if ( node.right == null && node.left != null )
			{
				if ( node.data > parent.data )
				{
					parent.right = node.left ;
				}
				else
				{
					parent.left = node.left ;
				}
			}
			else
			{
				int lmax = max(node.left, Integer.MIN_VALUE ) ;
				remove(node.left,lmax,node) ;
				node.data = lmax ;
			}
		}
		
	}
	
	
	
}

