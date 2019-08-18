package Stack_Ques;

import java.util.Scanner;

public class Next_Greater_Element {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) throws Exception 
	{
		
		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			
			int n = scn.nextInt() ;
			int[] a = takeInput(n) ;
			display(a);
			
		}
		
		
	}
	
	public static int[] takeInput(int n) 
	{
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt();
		}
		return a ;
	}

	public static void display ( int[] a ) throws Exception
	{
	
		Stack_Class S = new Stack_Class() ;

		for ( int i = 0 ; i < a.length ; i++ )
		{
			
			while (!S.isempty() && S.peek() < a[i] )
			{
				
				int t = S.pop() ;
				System.out.println(t + "," + a[i] );
				
			}
			
			S.push(a[i]);
		}
		
		while ( !S.isempty() )
		{
			
			int t = S.pop() ;
			System.out.println(t + "," + "-1" );
			
		}
		
		
	}
	
	static class Stack_Class {

		protected int[] data ;
		protected int tos ;
		
		public Stack_Class()
		{
			this.data = new int[5] ;
			this.tos = - 1 ;
		}
		
		
		public Stack_Class(int cap)
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

	
}
