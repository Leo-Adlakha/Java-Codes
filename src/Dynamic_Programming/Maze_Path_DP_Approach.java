package Dynamic_Programming;

import java.util.Arrays;

public class Maze_Path_DP_Approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getmazepath(0, 0, 4, 6)) ;
		System.out.println(getmazepathTD(0, 0, 4, 6, new int[5][7])) ;
		System.out.println(getmazepathBU(0, 0, 4, 6));
		System.out.println(getmazepathBUSE(0, 0, 4, 6));
		System.out.println(getmazepathDBUSE(0, 0, 3, 3));
		
	}
	
	public static int getmazepath(int cr, int cc, int er, int ec )
	{
		if ( cr == er && cc == ec )
		{
			return 1 ;
		}
		
		int waysH = 0 ;
		int waysV = 0 ;
		if ( cc < ec )
		    waysH += getmazepath ( cr, cc + 1, er, ec) ;
		if ( cr < er )
			waysV += getmazepath ( cr + 1, cc, er, ec) ;
		
		return waysH + waysV ;
		
	}
	
	public static int getmazepathTD(int cr, int cc, int er, int ec, int[][] stor )
	{
		if ( cr == er && cc == ec )
		{
			return 1 ;
		}
		
		if ( stor[cr][cc] != 0 )
		{
			return stor[cr][cc] ;
		}
		
		int waysH = 0 ;
		int waysV = 0 ;
		if ( cc < ec )
		    waysH += getmazepathTD ( cr, cc + 1, er, ec, stor) ;
		if ( cr < er )
			waysV += getmazepathTD ( cr + 1, cc, er, ec, stor) ;
		
		stor[cr][cc] = waysH + waysV ;
		
		return waysH + waysV ;
		
	}
	
	public static int getmazepathBU( int cr, int cc, int er, int ec ) 
	{
		
		int[][] stor = new int[er+1][ec+1] ;
		
		for ( int i = er ; i >= 0 ; i-- )
		{
			for ( int j = ec ; j >= 0 ; j-- )
			{
				int sum = 0 ;
				if ( j == ec || i == er )
				{
					stor[i][j] = 1 ;
					continue ;
				}
				sum += stor[i][j+1] + stor[i+1][j] ;
				stor[i][j] = sum ;
			}
		}
		
		return stor[0][0] ;
		
	}
	
	public static int getmazepathBUSE ( int cr, int cc, int er, int ec )
	{
		
		int[] stor = new int[ec+1] ;
		Arrays.fill(stor, 1);
		
		for ( int i = er - 1 ; i >= 0 ; i-- )
		{
			
			for ( int j = ec - 1 ; j >= 0 ; j-- )
			{
				int sum = 0 ;
				if ( j < ec )
				{
					sum += stor[j] + stor[j+1] ;
				}
				
				stor[j] = sum ;
			
			}
			
		}
		
		return stor[0] ;
		
		
		
	}
	
	public static int getmazepathDBUSE(int cr, int cc, int er, int ec )
	{
		
		int[] stor = new int[ec+1] ;
		
		Arrays.fill(stor, 1);
		
		int d = 1 ;
		
		for ( int i = er - 1 ; i >= 0 ; i-- )
		{
			stor[ec] = 1 ;
			for ( int j = ec - 1 ; j >= 0 ; j-- )
			{
				int newd = stor[j] ;
				int sum = d + stor[j+1] + stor[j] ;
				stor[j] = sum ;
				d = newd ;
				
			}
			d = 1 ;
		}
		
		
		return stor[0] ;
		
	}

}
