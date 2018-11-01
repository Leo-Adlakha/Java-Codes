package Queue;

public class Queue_Class {

	protected int[] data ;
	protected int front ;
	protected int size ;
	
	public Queue_Class()
	{
		data = new int[5] ;
		front = 0 ; 
		size = 0 ;
	}
	
	public Queue_Class(int n ) 
	{
		data = new int[n] ;
		front = 0 ;
		size = 0 ;
	}

	public void enqueue ( int n ) throws Exception
	{
		if ( isfull() )
		{
			throw new Exception("Queue is Full.") ;
		}
	
		this.data[(this.front + this.size) % this.data.length ] = n ;
		this.size ++ ;
	}
	
	public int dequeue () throws Exception
	{
		if ( isempty() )
		{
			throw new Exception("Queue is Empty.") ;
		}
		
		int rv = this.data[this.front] ;
		this.front = ( this.front + 1 ) % this.data.length ;
		this.size -- ;
		return rv ;
		
	}
	
	public int infront () throws Exception
	{
		if ( isempty() )
		{
			throw new Exception("Queue is Empty.") ;
		}
		
		int rv = this.data[this.front] ;
		return rv ;
	}
	
	
	public int size()
	{
		return this.size ;
	}
	
	public boolean isfull()
	{
		return this.size == this.data.length  ;
	}
	
	public boolean isempty()
	{
		return this.size() == 0 ;
	}
	
	public void display ()
	{
		for ( int i = 0 ; i < size ; i++ )
		{
			System.out.print(this.data[(i + this.front)%this.data.length] + " " );
		}
	}
	
}
