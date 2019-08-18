package Stack_Ques;

import Stack.Dynamic_Stack;
import Stack.Stack_Class;

public class Max_of_Subarray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[] a = { 1,2,3,1,4,5,2,3,6 } ;
		int k = 3 ;
		for ( int val : display(a,k) )
		{
			System.out.print( val + " " );
		}
		
	}
	
	public static int[] display ( int[] a , int k ) throws Exception
	{
	
		int[] ssum = new int[a.length - k + 1 ] ;
		Stack_Class S = new Dynamic_Stack() ;
		
		for ( int i = 0 ; i < a.length - k + 1 ; i++ )
		{
			int max = Integer.MIN_VALUE ;
			for ( int j = i ; j < i + k ; j++ )
			{
				S.push(a[j]);
			}
			
			for ( int j = 0 ; j < k ; j++ )
			{
				int t = S.pop() ;
				if ( t > max )
				{
					max = t ;
				}
			}
			
			ssum[i] = max ;
			
		}
		
		return ssum ;
		
	}


}
