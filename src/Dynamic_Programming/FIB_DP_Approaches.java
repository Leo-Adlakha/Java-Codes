package Dynamic_Programming;

public class FIB_DP_Approaches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start1 = System.currentTimeMillis() ;
		System.out.println(fibTD(70, new int[71])) ;
		long end1 = System.currentTimeMillis() ;
		
		long start2 = System.currentTimeMillis() ;
		System.out.println(fibBU(70));
		long end2 = System.currentTimeMillis() ;
		
		long start3 = System.currentTimeMillis() ;
		System.out.println(fibBUSE(70));
		long end3 = System.currentTimeMillis() ;
		
		System.out.println(end1-start1);
		System.out.println(end2-start2);
		System.out.println(end3-start3);
		
		
	}
	
	public static int fibTD ( int n, int[] storage )
	{
		
		if ( n == 0  || n == 1 )
		{
			return n ;
		}
		
		if ( storage[n] != 0 )
		{
			return storage[n] ;
		}
		
		int fn = fibTD(n-1, storage) + fibTD(n-2, storage) ;
		
		storage[n] = fn ;
		return fn ;
		
		
	}
	
	public static int fibBU ( int n )
	{
		
		int[] stor = new int[n+1] ;
		stor[0] = 0 ;
		stor[1] = 1 ;
		
		for ( int i = 2 ; i <= n ; i++ )
		{
			stor[i] = stor[i-1] + stor[i-2] ;
		}
		
		return stor[n] ;
		
	} 
	
	public static int fibBUSE ( int n )
	{
		
		int[] stor = new int[2] ;
		stor[0] = 0 ;
		stor[1] = 1 ;
		
		for ( int i = 2 ; i <= n ; i++ )
		{
			int sum = stor[0] + stor[1] ;
			stor[0] = stor[1] ;
			stor[1] = sum ;
		}
		
		return stor[1] ;
		
		
	}

}
