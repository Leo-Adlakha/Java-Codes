package Stack_Ques;

import Stack.Dynamic_Stack;
import Stack.Stack_Class;

public class Stock_Span {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		int[] prices = { 5,1,3,2,17,15 } ;
		for ( int val : display(prices) )
		{
			System.out.print( val + " " );
		}
		
	}

	public static int[] display ( int[] a ) throws Exception
	{
	
		int[] span = new int[a.length] ;
		Stack_Class S = new Dynamic_Stack() ;
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			
			if ( i == 0 )
			{
				S.push(i);
				span[0] = 1 ;
				continue ;
			}
			
			while ( !S.isempty() && a[i] > a[S.peek()] )
			{
				
				S.pop() ;
				
			}
			
			if( S.isempty() )
			{
				span[i] = i + 1 ;
			}
			else
			{
				span[i] = i - S.peek() ;
			}
			
			S.push(i);
			
		}
		
		return span ;
		
	}

	
}
