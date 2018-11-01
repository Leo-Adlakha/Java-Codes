package Generics;

public class LinkedList_Generic<T> {

	private class Node
	{
		T data ;
		Node next ;
	}
	
	private Node head ;
	private Node tail ;
	private int size ;
	
	public T getfirst() throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is Empty") ;
		}
		return this.head.data ;
	}
	
	public T getlast() throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is Empty") ;
		}
		return this.tail.data ;
	}
	
	public T getAt(int idx) throws Exception
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
	
	public void addLast ( T item )
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
	
	public void addFirst ( T item )
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
	
	public void addAt ( int idx, T item ) throws Exception
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

	public T removefirst () throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		T ans = this.head.data ;
		
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
	
	public T removelast () throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		T ans = this.tail.data ;
		
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

	public T removeAt ( int idx ) throws Exception
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

	
}
