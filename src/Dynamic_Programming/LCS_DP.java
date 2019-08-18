package Dynamic_Programming;

import java.util.Scanner;

public class LCS_DP {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = scn.next() ;
		String str2 = scn.next();
		System.out.println(LCSBU(str, str2));
		
	}
	
	public static int LCS ( String S1, String S2 ) 
	{
		
		if ( S1.length() == 0 || S2.length() == 0 )
		{
			return 0 ;
		}
		
		int ans = 0 ;
		char ch1 = S1.charAt(0) ;
		char ch2 = S2.charAt(0) ;
		String ros1 = S1.substring(1) ;
		String ros2 = S2.substring(1) ;
		
		if ( ch1 == ch2 )
		{
			ans = LCS(ros1, ros2) + 1 ;
		}
		else
		{
			ans = Math.max(LCS(S1, ros2), LCS(ros1, S2)) ; 
		}

		return ans ;
		
	}
	
	public static int LCSBU ( String S1, String S2 )
	{
		
		int[][] stor = new int[S1.length()+1][S2.length()+1] ;
		
		for ( int i = S1.length() - 1 ; i >= 0 ; i-- )
		{
			for ( int j = S2.length() - 1 ; j >= 0 ; j-- )
			{
				if ( S1.charAt(i) == S2.charAt(j) )
				{
					stor[i][j] = stor[i+1][j+1] + 1 ;
				}
				else
				{
					stor[i][j] = Math.max(stor[i+1][j], stor[i][j+1] ) ;
				}
			}
		}
		
		return stor[0][0] ;
		
	}
	
	public static int LCSTD ( String S1, String S2 )
	{
		// Do Yourself
		return 0 ;
	}
	

}
