package Dynamic_Programming;

import java.util.Scanner;

public class Coin_Change {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] a = takeInput(m) ;
		String str = "" ;
		for ( int i = 0 ; i < m ; i++ )
		{
			str += a[i] ;
		}
		System.out.println(Coinchange(str,n,0,0));
		
		
	}
	
	public static int Coinchange(String str, int n, int sum, int lstidx ) 
	{
		
		if ( sum == n )
		{
			return 1 ;
		}
		if ( sum > n )
		{
			return 0 ;
		}
		
		int ans = 0 ;
		for ( int i = lstidx ; i < str.length() ; i++ )
		{
			
			char ch = str.charAt(i) ;
			int num = (int)ch - 48 ;
			ans += Coinchange(str, n, sum + num, lstidx + i) ;
			
		}
		
		return ans ;
		
		
	}
	
//	public static int Coinchange(String str, int n, int sum, int lstidx, int[] stor, int lstchar ) 
//	{
//		
//		if ( sum == n )
//		{
//			return 1 ;
//		}
//		if ( sum > n )
//		{
//			return 0 ;
//		}
//		if ( stor[sum] != 0 && lstidx > lstchar )
//		{
//			return stor[sum] ;
//		}
//		
//		int ans = 0 ;
//		for ( int i = lstidx ; i < str.length() ; i++ )
//		{
//			
//			char ch = str.charAt(i) ;
//			int num = (int)ch - 48 ;
//			int t = Coinchange(str, n, sum + num, lstidx + i, stor, i) ;
//			ans += t ;
//			
//		}
//		
//		stor[sum] = ans ;
//		
//		return ans ;
//		
//		
//	}

	public static int[] takeInput ( int m )
	{
		int[] arr = new int[m] ;
		for ( int i = 0 ; i < m ; i++ )
		{
			arr[i] = scn.nextInt();
		}
		return arr ;
	}

}
