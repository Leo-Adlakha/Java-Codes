import java.util.*;

public class Test{

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			long n = scn.nextInt() ;
			long ans = finans(n, 0) ;
			long m = (long) ( Math.pow(10,9) + 7 ) ;
			if ( ans >= m )
			{
				System.out.println(ans%m);
			}
			else
			{
				System.out.println(ans);
			}
		}
	}
		
		
		
	public static long finans(long n, long count ) 
	{
		
		if ( count == n )
		{
			return 1 ;
		}
		
		if ( count > n )
		{
			return 0 ;
		}
		
		long countR = 0 ;
		long countB = 0 ;
		long countG = 0 ;
		countR += finans(n, count + 1 ) ;
		countB += finans(n, count + 1 ) ;
		countG += finans ( n, count + 2 ) ;
		
		return countR + countB + countG ;
		
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
}
