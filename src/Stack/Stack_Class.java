package Stack;

public class Stack_Class {

	protected int[] data ;
	protected int tos ;
	
	private Stack_Class()
	{
		this.data = new int[5] ;
		this.tos = - 1 ;
	}
	
	
	private Stack_Class(int cap)
	{
		this.data = new int[cap] ;
		this.tos = -1 ;
	}
	
	public void push ( int n ) throws Exception
	{
		if ( isfull() )
		{
			throw new Exception("Stack is Full.") ;
		}
		
		tos++ ;
		this.data[tos] = n ;
	}
	
	public int pop () throws Exception
	{
		if ( isempty() )
		{
			throw new Exception("Stack is Empty.") ;
		}
		
		int rv = this.data[this.tos] ;
		tos-- ;
		return rv ;
		
	}
	
	public int peek () throws Exception
	{
		if ( isempty() )
		{
			throw new Exception("Stack is Empty.") ;
		}
		int rv = this.data[this.tos] ;
		return rv ;
	}
	
	
	public int size()
	{
		return this.tos + 1 ;
	}
	
	public boolean isfull()
	{
		return this.size() == this.data.length  ;
	}
	
	public boolean isempty()
	{
		return this.size() == 0 ;
	}
	
	public void display ()
	{
		for ( int i = this.tos ; i >= 0 ; i-- )
		{
			System.out.print(this.data[i] + " " );
		}
	}
	
}
