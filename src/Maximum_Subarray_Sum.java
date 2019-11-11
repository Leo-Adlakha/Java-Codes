import java.util.Scanner;

public class Maximum_Subarray_Sum {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		int q = scn.nextInt() ;
		for ( int j = 0 ; j < q ; j++ ) {
//			String s = scn.next();
//			System.out.println(s);
//			int l = Integer.valueOf(s.charAt(0));
//			int r = Integer.valueOf(s.charAt(2)) ;
			int l = scn.nextInt() - 1 ;
			int r = scn.nextInt() - 1;
			int[] b = new int[r-l+1];
			for ( int k = 0 ; k < r-l+1 ; k++ ) {
				b[k] = a[l+k];
			}
			System.out.println(maxsumofsubarray(b));			
		}
		
	}
	
	public static int[] takeInput( int n )
	{
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt() ;
		}
		return a ;
		
	}
	
	public static int maxsumofsubarray ( int[] a )
	{
		
		int[] allmax = new int[a.length] ;
		
		for ( int i = 0 ; i < a.length ; i++ ) 
		{
			int[] max = new int[a.length] ;
			for ( int j = i ; j < a.length ; j++ )
			{
				int sum = 0 ;
				for ( int k = i ; k <= j ; k++ )
				{
					sum += a[k] ;
				}
				max[j] = sum ;
			}
			allmax[i] = maximumof(max) ;
		}
		
		return maximumof(allmax) ;
		
		
		
	}
	
	public static int maximumof( int[] max )
	{
		int m = Integer.MIN_VALUE ;
		for ( int i = 0 ; i < max.length ; i++ )
		{
			if ( max[i] > m )
			{
				m = max[i] ;
			}
		}
		return m ;
	}
	
}
