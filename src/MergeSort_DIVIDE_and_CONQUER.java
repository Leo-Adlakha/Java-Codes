import java.util.Scanner;

public class MergeSort_DIVIDE_and_CONQUER {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = scn.nextInt();
		int[] a = takeinput(n);
		for ( int val : MergeSort(a,0,a.length-1) )
		{
			System.out.println(val);
		}
		
		
		
	}
	
	public static int[] takeinput( int n )
	{
		int[] a = new int[n];
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt();
		}
		return a ;
	
	}
	
	public static int[] MergeSort( int[] a, int lo , int hi )
	{
		
		if ( hi == lo )
		{
			int[] base = new int[1];
			base[0] = a[hi] ;
			return base ;
		}
		
		int mid = ( lo + hi ) / 2 ;
		int[] fh = MergeSort(a, lo, mid);
		int[] sh = MergeSort(a, mid+1, hi);
		
		int[] merged = Mergetwosortedarrays(fh, sh) ;
		
		return merged ;
	}
	
	public static int[] Mergetwosortedarrays(int[] one, int[] two)
	{
		
		int i = 0 ;
		int j = 0 ;
		int k = 0 ;
		
		int[] merged = new int[one.length + two.length ];
		
		while ( i < one.length && j < two.length )
		{
			
			if ( one[i] >= two[j])
			{
				merged[k] = two[j];
				j++ ;
				k++ ;
			}
			else
			{
				merged[k] = one[i];
				i++ ;
				k++ ;
			}
			
		}
		
		if ( j == two.length )
		{
			while( i < one.length )
			{
				merged[k] = one[i] ;
				k++;
				i++;
			}
		}
		if ( i == one.length )
		{
			while( j < two.length )
			{
				merged[k] = two[j] ;
				k++;
				j++;
			}
		}
		
		return merged ;
		
		
		
	}
 
}
