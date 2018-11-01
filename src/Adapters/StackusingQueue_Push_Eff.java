package Adapters;

import Queue.Dynamic_Queue;

public class StackusingQueue_Push_Eff {

	private Dynamic_Queue primary = new Dynamic_Queue() ;
	
	public void push ( int item )
	{
		
		try {
			primary.enqueue(item) ; 
		} catch (Exception e) {
			System.out.println("Stack is Full !");
		};
		
	}
	
	public int pop () throws Exception
	{
		
		Dynamic_Queue helper = new Dynamic_Queue() ;
		
		try {
		while ( primary.size() != 1 )
		{	
			
				helper.enqueue(primary.dequeue());
		}
		
		int rv = primary.dequeue() ;
		
		primary = helper ;
		
		return rv ;
		}
		catch ( Exception e )
		{
			throw new Exception ( "Stack is Empty !" ) ;
		}
		
		
	}
	
	public int peek () throws Exception
	{
		
		Dynamic_Queue helper = new Dynamic_Queue() ;
		
		try {
		while ( primary.size() != 1 )
		{	
			try {
				helper.enqueue(primary.dequeue());
			} catch (Exception e) {
				
			}
		}
		
		int rv = primary.dequeue() ;
		
		helper.enqueue(rv);
		primary = helper ;
		
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
		try {
			displayreverse(0) ;
		} catch (Exception e) {

		}
		System.out.println();
		System.out.println("-----------------------");
		
	}
	
	private void displayreverse ( int count ) throws Exception
	{
		
		if ( count == primary.size() )
		{
			return ;
		}
		
		int temp = primary.dequeue() ;
		primary.enqueue(temp) ;
		displayreverse(count+1);
		System.out.print(temp + " " );
		
	}
}
