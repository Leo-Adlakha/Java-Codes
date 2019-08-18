import java.util.Scanner;

public class Viveks_Homework {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		long[] a = takeInput(n) ;
		long prod = 1 ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			prod = prod * a[i] ;
		}
		
		long max = max(a) ;
		
		long l = 1 ;
		long r = max ;
		
		long ans = Integer.MAX_VALUE ;
		
		while ( l <= r )
		{
			
			long mid = ( l + r ) / 2 ;
			
			if ( Math.pow(mid, a.length) > prod )
			{
				if ( mid < ans )
				{
					ans = mid ;
				}
				r = mid - 1 ;
			}
			else if (  Math.pow(mid, a.length) <= prod )
			{
				l = mid + 1 ;
			}
			
		}
		
		System.out.println(ans);
		
		
	}
	
	
	
	public static long max(long[] a) 
	{
		long max = Integer.MIN_VALUE ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( a[i] > max )
			{
				max = a[i] ;
			}
		}
		return max ; 
	}



	public static long[] takeInput(int c) 
	{
		long[] a = new long[c] ;
		for ( int i = 0 ; i < c ; i++ )
		{
			a[i] = scn.nextInt();
		}
		return a ;
	}


}
