import java.util.Scanner;

public class ArnavandBooks {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		int k = scn.nextInt() ;
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt();
		}
		
		System.out.println(findans(k,a)) ;
		
	}

	public static int findans(int k, int[] a) 
	{
		
		int max = 0 ;
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			int sum = a[i] ;
			int count = 1 ;
			while ( i < a.length - 1 && sum + a[i+1] <= k )
			{
				count++ ;
				sum = sum + a[i+1] ;
			}
			if ( count > max )
			{
				max = count ;
			}
		}
		
		return max ;
		
	}

}
