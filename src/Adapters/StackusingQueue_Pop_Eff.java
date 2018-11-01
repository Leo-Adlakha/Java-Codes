package Adapters;

import Queue.Dynamic_Queue;

public class StackusingQueue_Pop_Eff {

	private Dynamic_Queue primary = new Dynamic_Queue() ;
	
	public void push ( int item ) throws Exception
	{
		
		Dynamic_Queue helper = new Dynamic_Queue() ;
		
		try {
			helper.enqueue(item);
		while ( primary.size() != 0 )
		{	
			helper.enqueue(primary.dequeue());
		}
		
		primary = helper ;
		
		}
		catch ( Exception e )
		{
			throw new Exception ( "Stack is Full !" ) ;
		}
		
		
		
	}
	
	public int pop () throws Exception
	{
		
		try {
		
			int rv = primary.dequeue() ;
			return rv ;
		}
		catch ( Exception e )
		{
			throw new Exception ( "Stack is Empty !" ) ;
		}
		
		
	}
	
	public int peek () throws Exception
	{
		
		try {
			
			int rv = primary.infront() ;
			return rv ;
		}
		catch ( Exception e )
		{
			throw new Exception ( "Stack is Empty !" ) ;
		}
		
	}
	
	public int size ()
	{
		return primary.size() ;
	}
	
	public boolean isEmpty()
	{
		return primary.size() == 0 ;
	}
	
	public void display ()
	{
		System.out.println("-----------------------");
		primary.display();
		System.out.println();
		System.out.println("-----------------------");
		
	}
	
}
