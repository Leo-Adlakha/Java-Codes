package Dynamic_Programming;

public class Knapsack_0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] wt = { 1,3,4,5 } ;
		int[] prices = { 1,4,5,7 } ;
		System.out.println(knapsack(wt, prices, 0, 7));
		System.out.println(knapsack(wt, prices, 0, 7, new int[wt.length][8]));
		System.out.println(knapsack(wt, prices, 7));
		
	}
	
	public static int knapsack ( int[] wt, int[] prices, int vidx, int cap )
	{
		
		if ( vidx == wt.length )
		{
			return 0 ;
		}
		
		int include = 0 ;
		if ( cap >= wt[vidx] )
		{
		    include = knapsack(wt, prices, vidx+1, cap-wt[vidx]) + prices[vidx] ;
		}
		int exclude = knapsack(wt, prices, vidx+1, cap) ;
		
		return Math.max(include, exclude) ;
		
		
	}
	
	public static int knapsack ( int[] wt, int[] prices, int vidx, int cap, int[][] stor )
	{
		
		if ( vidx == wt.length )
		{
			return 0 ;
		}
		
		if ( stor[vidx][cap] != 0 )
		{
			return stor[vidx][cap] ;
		}
		
		int include = 0 ;
		if ( cap >= wt[vidx] )
		{
		    include = knapsack(wt, prices, vidx+1, cap-wt[vidx]) + prices[vidx] ;
		}
		int exclude = knapsack(wt, prices, vidx+1, cap) ;
		
		stor[vidx][cap] = Math.max(include, exclude) ;
		
		return Math.max(include, exclude) ;
		
		
	}

	public static int knapsack ( int[] wt, int[] prices, int cap )
	{
		
		int nr = wt.length + 1 ;
		int nc = cap + 1 ;
		
		int[][] stor = new int[nr][nc] ;
		
		for ( int i = 0 ; i < nr ; i++ )
		{
			for ( int j = 0 ; j < nc ; j++ )
			{
				if ( i == 0 || j == 0 )
				{
					stor[i][j] = 0 ;
				}
				else
				{
					
					int include = 0 ;
					
					if ( j >= wt[i-1] )
					{
						include = prices[i-1] + stor[i-1][j-wt[i-1]] ;
					}
					
					int exclude = stor[i-1][j] ;
					
					stor[i][j] = Math.max(include, exclude) ;
					
				}
			}
		}
		
		return stor[nr-1][nc-1] ;
		
	}
	
}
