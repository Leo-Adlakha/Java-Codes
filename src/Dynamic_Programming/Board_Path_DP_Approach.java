package Dynamic_Programming;

public class Board_Path_DP_Approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getpathTD(0, 10, new int[11]));
		System.out.println(getpath(0, 10));
		System.out.println(getpathBU(10));
		System.out.println(getpathBUSE(10));
		
	}

	public static int getpathTD(int cur, int end, int[] stor) {
		
		if (cur == end) {
			return 1;
		}
		
		if ( stor[cur] != 0 )
		{
			return stor[cur] ;
		}
		
		int ways = 0;
		for (int i = 1; i <= 6 && cur + i <= end ; i++) {
			ways += getpathTD(cur + i, end, stor);
		}
		
		stor[cur] = ways ;

		return ways;

	}
	
	public static int getpath(int cur, int end ) 
	{
		int ways = 0;
		if (cur == end) 
		{
			return 1;
		}
		
		for (int i = 1; i <= 6 && cur + i <= end ; i++) 
		{
			ways += getpath(cur + i, end );
		}

		return ways;

	}
	
	public static int getpathBU ( int n )
	{
		
		int[] stor = new int[n+6] ;
		stor[n] = 1 ;
		
		for ( int i = n - 1 ; i >= 0 ; i-- )
		{
			int count = 0 ; 
			
			for ( int j = 1 ; j <= 6 ; j++ )
			{
				count += stor[i+j];
			}
			stor[i] = count ;
		}
		
		return stor[0] ;
		
	}

	public static int getpathBUSE ( int n )
	{
		int[] stor = new int[6] ;
		stor[0] = 1 ;
		
		for ( int i = n - 1 ; i >= 0 ; i-- )
		{
			int sum = 0 ;
			for ( int j = 0 ; j < 6 ; j++ )
			{
				sum += stor[j];
			}
			
			for ( int j = 5 ; j >= 1 ; j-- )
			{
				stor[j] = stor[j-1] ;
			}
			
			stor[0] = sum ;
		}
		
		return stor[0] ;
	}

	
}
