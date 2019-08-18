package Dynamic_Programming;

public class Min_Matrix_Multiplications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = { 2,3,4,5,6 } ;
//		int[] arr = new int[1000] ;
//		
//		for ( int i = 0 ; i < 1000 ; i++ )
//		{
//			arr[i] = i + 1 ;
//		}
		System.out.println(MCM(arr, 0, arr.length - 1));
		System.out.println(MCM_TD(arr, 0, arr.length - 1, new int[arr.length][arr.length]));
		System.out.println(MCM_BU(arr));
		
	}
	
	public static int MCM ( int[] arr, int si, int ei )
	{
		
		if ( si + 1 == ei )
		{
			return 0 ;
		}
		
		
		int min = Integer.MAX_VALUE ;
		for ( int k = si + 1 ; k <= ei - 1 ; k++ )
		{
			
			int fc = MCM(arr, si, k) ;
			int sc = MCM(arr, k, ei) ;
			
			int sw = arr[si] * arr[k] * arr[ei] ;
			
			int total = sw + fc + sc ;
			
			if ( total < min )
			{
				min = total ;
			}
			
		}
		
		return min ;
		
		
	}
	
	public static int MCM_TD ( int[] arr, int si, int ei, int[][] stor )
	{
		
		if ( si + 1 == ei )
		{
			return 0 ;
		}
		
		if ( stor[si][ei] != 0 )
		{
			return stor[si][ei] ;
		}
		
		
		int min = Integer.MAX_VALUE ;
		for ( int k = si + 1 ; k <= ei - 1 ; k++ )
		{
			
			int fc = MCM(arr, si, k) ;
			int sc = MCM(arr, k, ei) ;
			
			int sw = arr[si] * arr[k] * arr[ei] ;
			
			int total = sw + fc + sc ;
			
			if ( total < min )
			{
				min = total ;
			}
			
		}
		
		stor[si][ei] = min ;
		
		return min ;
		
		
	}
	
	public static int MCM_BU ( int[] arr ) 
	{
		int n = arr.length ;
		
		int[][] stor = new int[arr.length][arr.length] ;
		
		for ( int slide = 2 ; slide <= n ; slide++ )
		{
			
			for ( int si = 0 ; si <= n - slide ; si++ )
			{
				
				int ei = si + slide - 1 ;
				
				if ( si + 1 == ei )
				{
					stor[si][ei] = 0 ;
				}
				else
				{
					
					int min = Integer.MAX_VALUE ;
					for ( int k = si + 1 ; k <= ei - 1 ; k++ )
					{
						
						int fc = stor[si][k] ;
						int sc = stor[k][ei] ;
						
						int sw = arr[si] * arr[k] * arr[ei] ;
						
						int total = sw + fc + sc ;
						
						if ( total < min )
						{
							min = total ;
						}
						
					}
					
					stor[si][ei] = min ;
					
				}
			
			}
		
		}
		
		
		return stor[0][n-1] ;
		
	}

}
