package Sacred_Codes;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza_Palace {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] a = takeInput(m) ;
		String str = "" ;
		for ( int i = 1 ; i <= n ; i++ )
		{
			str += i ;
		}
		ArrayList<String> list = subseq(str) ;
		
		int ans = 0 ;
		boolean bl1 = false ;
		boolean bl2 = false ;
		for ( String val : list )
		{
			
			
			for ( int i = 0 ; i < m ; i++ )
			{
				bl1 = false ;
				bl2 = false ;
				int j = 0 ;
				int t1 = a[i][j] ;
				int t2 = a[i][j+1] ;
				for ( int k = 0 ; k < val.length() ; k++ )
				{
					char ch = val.charAt(k) ;
					int num = ch - 48 ;
					if ( num == t1 )
					{
						bl1 = true ;
					}
					else if ( num == t2 )
					{
						bl2 = true ;
					}
					
					if ( bl1 && bl2 )
					{
						break ;
					}
				}
				if ( bl1 && bl2 )
				{
					break ;
				}
			}
			if ( !bl1 && bl2 )
			{
				ans++ ;
			}
			else if ( bl1 && !bl2 )
			{
				ans++ ;
			}
			else if ( !bl1 && !bl2 )
			{
				ans++ ;
			}
		}
		
		System.out.println(ans);
		
	}

	public static int[][] takeInput(int m) 
	{
		int[][] a = new int[m][2] ;
		for ( int i = 0 ; i < m ; i++ )
		{
			for ( int j = 0 ; j < 2 ; j++ )
			{
				a[i][j] = scn.nextInt();
			}
		}
		return a ;
	}
	
	public static ArrayList<String> subseq( String str )
	{
		if ( str.length() == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> recans = subseq(ros);
		ArrayList<String> myres = new ArrayList<>();
		
		for ( String val : recans )
		{
			myres.add(val);
			myres.add( ch + val );
		}
		return myres ;
	}

}
