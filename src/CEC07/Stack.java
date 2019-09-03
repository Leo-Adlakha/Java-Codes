package CEC07;

public class Stack {

	private class Node
	{
		int data ;
		Node next ;
	}
	
	private Node head ;
	private Node tail ;
	private int size ;
	
	public int top() throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Stack is Empty") ;
		}
		return this.head.data ;
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
	
	public void push ( int item )
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

	public int pop () throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Stack is empty!") ;
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
}

