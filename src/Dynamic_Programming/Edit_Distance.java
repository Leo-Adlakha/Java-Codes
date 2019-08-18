package Dynamic_Programming;

import java.util.Scanner;

public class Edit_Distance {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str = scn.next() ;
		String str2 = scn.next() ;
		System.out.println(EditDistanceBU(str, str2));
		
	}
	
	public static int EditDistance ( String S1, String S2 )
	{
		
		if ( S1.length() == 0 || S2.length() == 0 )
		{
			return Math.max(S1.length(), S2.length()) ;
		}
		
		String ros1 = S1.substring(1) ;
		String ros2 = S2.substring(1) ;
		
		int ans = 0 ;
		
		if ( S1.charAt(0) == S2.charAt(0) ) 
		{
			ans = EditDistance(ros1, ros2) ;
		}
		else
		{
			
			int insert = EditDistance(ros1, S2) ;
			int delete = EditDistance(S1, ros2) ;
			int replace = EditDistance(ros1, ros2) ;
			
			ans = Math.min(insert, Math.min(delete, replace)) + 1 ;
			
		}
		
		return ans ;
		
	}
	
	public static int EditDistanceBU ( String S1, String S2 )
	{
		
		int[][] stor = new int[S1.length() + 1][S2.length() + 1] ;
		
		for ( int i = S1.length() ; i >= 0 ; i-- )
		{
			for ( int j = S2.length() ; j >= 0 ; j-- )
			{
				
				if ( i == S1.length() )
				{
					stor[i][j] = S2.length() - j ;
					continue ;
				}
				
				if ( j == S2.length() )
				{
					stor[i][j] = S1.length() - i ;
					continue ;
				}
				
				if ( S1.charAt(i) == S2.charAt(j) )
				{
					stor[i][j] = stor[i+1][j+1] ;
				}
				else
				{
					
					int insert = stor[i+1][j] ;
					int delete = stor[i][j+1] ;
					int replace = stor[i+1][j+1] ;
					
					stor[i][j] = Math.min(insert, Math.min(delete, replace)) + 1 ;
					
					
				}
			}
			
			
		}
		return stor[0][0] ;
		
	}
	
	
	

}
