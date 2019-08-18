package Dynamic_Programming;

import java.util.Scanner;

public class Min_JUMPS {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt();
		    int[] a = takeInput(n) ;
		    System.out.println(jumps(a, 0, 0)) ;
		}
	}
	
	
	
	public static int[] takeInput(int n) 
	{
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt() ;
		}
		return a ;
	}



	public static int jumps ( int[] a, int vidx, int step )
	{
		
		if ( vidx + step >= a.length )
		{
			return 1 ;
		}
		
		int t = a[vidx] ;
		
		int min = Integer.MAX_VALUE ;
		
		for ( int i = vidx + 1 ; i <= vidx + t ; i++ )
		{
			
			int steps = jumps(a, i, a[i] ) + 1 ;
			if ( steps < min )
			{
				min = steps ;
			}
			
			
		}
		
		return min ;
		
		
	}

}
