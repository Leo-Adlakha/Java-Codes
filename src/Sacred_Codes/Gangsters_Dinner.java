package Sacred_Codes;

import java.util.Scanner;

public class Gangsters_Dinner {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = takeInput() ;
		process(a) ;
		
	}

	public static void process(int[] a) 
	{
		
		boolean bl = false ;
		int x1 = 0 ;
		int x2 = 0 ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			for ( int j = 0 ; j < a.length ; j++ )
			{
				if ( i == j )
				{
					continue ;
				}
				
				x1 = a[i] ;
				x2 = a[j] ;
				
				int sum = sum(a) ;
				
				if ( sum - x1 - x2 == 100 )
				{
					bl = true ;
					break ;
				}
			}
			if ( bl )
			{
				break ;
			}
		}
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( a[i] != x1 && a[i] != x2 )
			{
				System.out.println(a[i]);
			}
		}
		
	}

	public static int sum(int[] a) 
	{
		int sum = 0 ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			sum += a[i] ;
		}
		return sum ;
	}

	public static int[] takeInput() 
	{
		int[] a = new int[9] ;
		for ( int i = 0 ; i < 9 ; i++ )
		{
			a[i] = scn.nextInt() ;
		}
		return a ;
	}

}
