package Dynamic_Programming;

public class Wine_Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = { 2,3,5,1,4 } ;
		System.out.println(wineproblem(prices, 0, prices.length - 1, 1));
		System.out.println(wineproblemTD(prices, 0, prices.length - 1, new int[prices.length][prices.length]));
		System.out.println(wineproblemBU(prices));
	}

	public static int wineproblem ( int[] prices, int si, int ei, int yr )
	{
		
		if ( si == ei )
		{
			return prices[si]*yr ;
		}
		
		int ls = wineproblem(prices, si + 1, ei, yr + 1 ) + prices[si] * yr ;
		int rs = wineproblem(prices, si, ei - 1, yr + 1 ) + prices[ei] * yr ;
		
		return Math.max(ls, rs) ;
		
	}
	
	public static int wineproblemTD ( int[] prices, int si, int ei, int[][] stor )
	{
		
		int yr = prices.length - ( ei - si ) ;
		
		if ( si == ei )
		{
			return prices[si]*yr ;
		}
		
		if ( stor[si][ei] != 0 )
		{
			return stor[si][ei] ;
		}
		
		int ls = wineproblem(prices, si + 1, ei, yr + 1 ) + prices[si] * yr ;
		int rs = wineproblem(prices, si, ei - 1, yr + 1 ) + prices[ei] * yr ;
		
		stor[si][ei] = Math.max(ls, rs) ;
		
		return Math.max(ls, rs) ;
		
	}
	
	public static int wineproblemBU ( int[] prices )
	{
		
		int n = prices.length ;
		
		int[][] stor = new int[n][n] ;
		
		for ( int slide = 1 ; slide <= n ; slide++ )
		{
			
			for ( int si = 0 ; si <= n - slide ; si++ )
			{
				
				int ei = si + slide - 1 ;
				
				int yr = n - ( ei - si ) ;
				
				if ( si == ei )
				{
					stor[si][si] = prices[si] * yr ;
				}
				else
				{
					int ls = stor[si + 1][ei] + prices[si] * yr ;
					int rs = stor[si][ei - 1] + prices[ei] * yr ;
					
					stor[si][ei] = Math.max(ls, rs) ;
				}
				
			}
			
		}
		
		return stor[0][n - 1] ;
		
	}
	
}
