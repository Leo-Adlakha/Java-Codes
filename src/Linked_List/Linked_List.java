package Linked_List;

public class Linked_List {

	private class Node
	{
		int data ;
		Node next ;
	}
	
	private Node head ;
	private Node tail ;
	private int size ;
	
	public int getfirst() throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is Empty") ;
		}
		return this.head.data ;
	}
	
	public int getlast() throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is Empty") ;
		}
		return this.tail.data ;
	}
	
	public int getAt(int idx) throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is Empty") ;
		}
		if ( idx < 0 || idx >= size )
		{
			throw new Exception("Invalid Index") ;
		}
		Node temp = this.head ;
		for(int i =0 ; i<idx ;i++) {
			temp = temp.next;
		}

		return temp.data ;
	}
	
	private Node getNodeAt(int idx) throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is Empty") ;
		}
		if ( idx < 0 || idx >= size )
		{
			throw new Exception("Invalid Index") ;
		}
		Node temp = this.head ;
		for(int i =0 ; i<idx ;i++) {
			temp = temp.next;
		}

		return temp ;
	}
	
	public void display() 
	{
		
		Node temp = this.head ;
		while ( temp != null )
		{
			System.out.print(temp.data + " " );
			temp = temp.next ;
		}

	}
	
	public void addLast ( int item )
	{
		
		Node nn = new Node() ;
		nn.data = item ;
		nn.next = null ;
		
		if ( this.size == 0 )
		{
			this.head = nn ;
			this.tail = nn ;
		}
		else 
		{
		this.tail.next = nn ;
		this.tail=nn;
		}
		this.size++ ;
		
	}
	
	public void addFirst ( int item )
	{
		
		Node nn = new Node() ;
		nn.data = item ;
		nn.next = null ;
		
		if ( this.size == 0 )
		{
			this.head = nn ;
			this.tail = nn ;
		}
		else 
		{
		nn.next = head ;
		this.head = nn ;
		}
		this.size++ ;
		
	}
	
	public void addAt ( int idx, int item ) throws Exception
	{
		
		Node nn = new Node() ;
		nn.data = item ;
		nn.next = null ;
		
		if ( idx < 0 || idx > size )
		{
			throw new Exception("Invalid Index") ;
		}
		
		if ( idx == 0 )
		{
			addFirst(item) ;
		}
		else if ( idx == size )
		{
			addLast(item) ;
		}
		else
		{
			Node idxm1 = getNodeAt ( idx - 1 ) ;
			Node idxp1 = getNodeAt ( idx ) ;
			idxm1.next = nn ;
			nn.next = idxp1 ;
			this.size++ ;
		}
		
	}

	public int removefirst () throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		int ans = this.head.data ;
		
		if ( this.size == 1 )
		{
			this.head = null ;
			this.tail = null ;
			this.size = 0 ;
		}
		else
		{
			this.head = this.head.next ;
			this.size-- ;	
		}
		
		return ans ;
		
	}
	
	public int removelast () throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		int ans = this.tail.data ;
		
		if ( this.size == 1 )
		{
			this.head = null ;
			this.tail = null ;
			this.size = 0 ;
		}
		else
		{
			Node temp = getNodeAt(this.size - 2) ;
			temp.next = null ;
			this.tail = temp ;
		}
		
		return ans ;
		
	}

	public int removeAt ( int idx ) throws Exception
	{
		
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		if ( idx < 0 || idx > this.size - 1 )
		{
			throw new Exception("Invalid Index!") ;
		}
		
		if ( idx == 0 )
		{
			return removefirst() ;
		}
		else if ( idx == this.size - 1 )
		{
			return removelast() ;
		}
		else
		{
			
			Node prev = getNodeAt(idx - 1) ;
			Node self = prev.next ;
			Node ahead = self.next ;
			
			
			prev.next = ahead ;
			this.size-- ;
			
			return self.data ;
			
		}
		
		
	}

    public void reverseDI () throws Exception
    {

    	
    	for ( int i = 0 ; i < this.size/2 ; i++ )
    	{
    		
    		Node first = getNodeAt(i) ;
    		Node last = getNodeAt(this.size-i-1) ;
    		
    		int temp = last.data ;
    		last.data = first.data ;
    		first.data = temp ;
    		
    		
    	}
    	
    	
    }

    public void reversePI () 
    {
    	
    	Node prev = this.head ;
    	Node curr = prev.next ;
    	
    	while ( curr != null )
    	{
    		
    		Node ahead = curr.next ;
    		
    		curr.next = prev ;
    		prev = curr ;
    		curr = ahead ;
    		
    	}
    	
    	Node temp = this.head ;
    	this.head = this.tail ;
    	this.tail = temp ;
    	
    	
    	this.tail.next = null ;
    	
    }

    public void reversePR ()
    {
    	reversePRH ( this.head, this.head.next ) ;
    	
    	Node temp = this.head ;
    	this.head = this.tail ;
    	this.tail = temp ;
    	
    	
    	this.tail.next = null ;
    	
    }
    
    private void reversePRH ( Node prev, Node curr )
    {
    	
    	if ( curr == null )
    	{
    		return ;
    	}
    	
    	Node ahead = curr.next ;
		
		curr.next = prev ;
		prev = curr ;
		curr = ahead ;
		
		reversePRH ( prev, curr) ;
    	
    	
    }
    
    public void reverseDRway1 () 
    {
    	
    	reverseDRHway1 ( this.head, this.head, 0 ) ;
    	
    }
    
    private Node reverseDRHway1 ( Node first, Node last, int count )
    {
    	
    	if ( last == null )
    	{
    		return first ;
    	}
    	
    	first = reverseDRHway1(first, last.next, count + 1 ) ; 
    	
    	if ( count >= this.size / 2 )
    	{
    	int temp = first.data ;
    	first.data = last.data ;
    	last.data = temp ;
    	}
    	
    	return first.next ;
    	
    	
    	
    }

    private class HelpMover 
    {
    	Node first = head ;	
    }
    
    public void reverseDRway2 () 
    {
    	
    	HelpMover mover = new HelpMover() ;
    	reverseDRHway2 ( mover , this.head, 0 ) ;
    	
    	
    }
    
    private void reverseDRHway2 ( HelpMover mover , Node last , int count )
    {
    	
    	if ( last == null )
    	{
    		return ;
    	}
    	

    	
    	reverseDRHway2(mover, last.next, count + 1 ) ; 
    	
    	if ( count >= this.size / 2 )
    	{
    	int temp = mover.first.data ;
    	mover.first.data = last.data ;
    	last.data = temp ;
    	}
    	
    	mover.first = mover.first.next ;
    	
    	
    }

    public void fold ()
    {
    	HelpMover mover = new HelpMover() ;
    	foldH(mover,this.head,0) ;
    }
    
    private void foldH(HelpMover mover, Node last, int count) 
    {
		if ( last == null )
		{
			return ;
		}
    	
		foldH(mover, last.next, count + 1 ) ;
		
		if ( count > size / 2 )
		{
		Node ahead = mover.first.next ;
		mover.first.next = last ;
		last.next = ahead ;
		
		mover.first = ahead ;
		}
		
		if ( count == size / 2 )
		{
			this.tail = last ;
			this.tail.next = null ;
		}
		
	}

	public int midnode()
    {
    	
		Node slow = this.head ;
		Node fast = this.head ;
		
		while ( fast.next != null && fast.next.next != null )
		{
			
			slow = slow.next ;
			fast = fast.next.next ;

		}
		
    	return slow.data ;
    	
    }

	public int kfromlast ( int k )
	{
		Node slow = this.head ;
		Node fast = this.head ;
		
		for ( int i = 1 ; i <= k ; i++ )
		{
			fast = fast.next ;
		}
		
		while ( fast != null )
		{
			fast = fast.next ;
			slow = slow.next ;
		}
		return slow.data ;
	}
	
	public void kReverse ( int k ) throws Exception
	{
		
		Linked_List prev = null ;
		
		while ( this.size != 0 )
		{
			
			Linked_List curr = new Linked_List() ;
			
			for ( int i = 1 ; i <= k ; i++ )
			{
				curr.addFirst(this.removefirst());
			}
			
			if ( prev == null )
			{
				prev = curr ;
			}
			else
			{
				
				prev.tail.next = curr.head ;
				prev.tail = curr.tail ;
				prev.size += curr.size ;
				
				
			}
		
		}
		
		this.head = prev.head ;
		this.tail = prev.tail ;
		this.size = prev.size ;
		
	}

//	public int findintersection ()
//	{
//		
//		// Dummy Linked List
//		Node n1 = new Node() ;
//		n1.data = 10 ;
//		Node n2 = new Node() ;
//		n2.data = 20 ;
//		Node n3 = new Node() ;
//		n3.data = 30 ;
//		Node n4 = new Node() ;
//		n4.data = 40 ;
//		Node n5 = new Node() ;
//		n5.data = 50 ;
//		Node n6 = new Node() ;
//		n6.data = 60 ;
//		
//		n1.next = n2 ;
//		n2.next = n3 ;
//		n3.next = n4 ;
//		n4.next = n5 ;
//		n6.next = n4 ;
//		
//		Linked_List first = new Linked_List() ;
//		first.head = n1 ;
//		first.tail = n5 ;
//		Linked_List second = new Linked_List() ;
//		second.head = n6 ;
//		second.tail = n5 ;
//		
//		
//		
//	}
	
	private Node midnodeLL()
    {
    	
		Node slow = this.head ;
		Node fast = this.head ;
		
		while ( fast.next != null && fast.next.next != null )
		{
			
			slow = slow.next ;
			fast = fast.next.next ;

		}
		
    	return slow ;
    	
    }
	
	public Linked_List MergeTwoSortedLL ( Linked_List other )
	{
		
		Linked_List nl = new Linked_List() ;
		
		Node ttemp = this.head ;
		Node otemp = other.head ;
		
		while ( ttemp != null && otemp != null )
		{
			
			if ( ttemp.data  < otemp.data )
			{
				nl.addLast(ttemp.data);
				ttemp = ttemp.next ;
			}
			else
			{
				nl.addLast(otemp.data);
				otemp = otemp.next ;
			}
				
		}
		
		if ( ttemp == null )
		{
			while ( otemp != null )
			{
				nl.addLast(otemp.data);
				otemp = otemp.next ;
			}
		}
		
		if ( otemp == null )
		{
			while ( ttemp != null )
			{
				nl.addLast(ttemp.data);
				ttemp = ttemp.next ;
			}
		}
		
		return nl ;
		
	}
	
	public void MergeSort ()
	{
		if ( this.size == 1 )
		{
			return ;
		}
		
		Node mid = midnodeLL() ;
		Node midn = mid.next ;
		
		Linked_List fh = new Linked_List() ;
		fh.head = this.head ;
		fh.tail = mid ;
		fh.tail.next = null ;
		fh.size = ( this.size + 1 ) / 2 ;
		
		Linked_List sh = new Linked_List() ;
		sh.head = midn ;
		sh.tail = this.tail ;
		sh.tail.next = null ;
		sh.size = this.size / 2 ;
		
		fh.MergeSort() ;
		sh.MergeSort() ;
		
		Linked_List nl = fh.MergeTwoSortedLL(sh) ;
		this.head = nl.head ;
		this.tail = nl.tail ;
		this.size = nl.size ;
		
	}
	
}
