package Stack_Ques;

import Stack.Dynamic_Stack;
import Stack.Stack_Class;

public class Next_Greater_Element_with_0_n_Complexity {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		int[] a = { 20,10,5,19,15,30,40,3 } ;
		display(a);
		
		
		
	}
	
	
	public static void display ( int[] a ) throws Exception
	{
	
		Stack_Class S = new Dynamic_Stack() ;

		for ( int i = 0 ; i < a.length ; i++ )
		{
			
			while (!S.isempty() && S.peek() < a[i] )
			{
				
				int t = S.pop() ;
				System.out.println(t + " -> " + a[i] );
				
			}
			
			S.push(a[i]);
		}
		
		while ( !S.isempty() )
		{
			
			int t = S.pop() ;
			System.out.println(t + " -> " + "-1" );
			
		}
		
		
	}

}
