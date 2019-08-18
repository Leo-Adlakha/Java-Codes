package Dynamic_Programming;

import java.util.Scanner;

public class Mixtures {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		int[] mixture = takeInput(n) ;
		System.out.println(mix(mixture, 0, mixture.length - 1, new int[mixture.length][mixture.length] )) ;

		
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

	public static int mix ( int[] mixture, int si, int ei )
	{
		
		if ( si == ei )
		{
			return 0 ;
		}
		
		int min = Integer.MAX_VALUE ;
		for ( int k = si ; k <= ei - 1 ; k++ )
		{
			
			int fc = mix(mixture, si, k) ;
			int sc = mix(mixture, k+1, ei) ;
			
			int sw = colour ( mixture, si, k ) * colour(mixture, k + 1, ei ) ;
			
			int total = sw + fc + sc ;
			
			if ( total < min )
			{
				min = total ;
			}
			
		}
		
		return min ;
		
	}
	
	public static int colour ( int[] mix, int si, int ei )
	{
		int sum = 0 ;
		for ( int i = si ; i <= ei ; i++ )
		{
			sum += mix[i] ;
		}
		return sum % 100 ;
	}
	
	public static int mix ( int[] mixture, int si, int ei, int[][] stor )
	{
		
		if ( si == ei )
		{
			return 0 ;
		}
		
		if ( stor[si][ei] != 0 )
		{
			return stor[si][ei] ;
		}
		
		int min = Integer.MAX_VALUE ;
		for ( int k = si ; k <= ei - 1 ; k++ )
		{
			
			int fc = mix(mixture, si, k) ;
			int sc = mix(mixture, k+1, ei) ;
			
			int sw = colour ( mixture, si, k ) * colour(mixture, k + 1, ei ) ;
			
			int total = sw + fc + sc ;
			
			if ( total < min )
			{
				min = total ;
			}
			
		}
		
		stor[si][ei] = min ;
		
		return min ;
		
	}
	
	
}
