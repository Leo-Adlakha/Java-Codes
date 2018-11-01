import java.util.Scanner;

public class QuickSort_DIVIDE_and_CONQUER {

	static Scanner scn = new Scanner (System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] a = takeinput(n);
		
		QuickSort(a,0,a.length-1);
		for ( int val : a )
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
	
	public static void QuickSort( int[] a, int lo , int hi )
	{
		if ( lo >= hi )
		{
			return ;
		}
		
		int left = lo ;
		int right = hi ;
		int mid = ( lo + hi ) / 2 ;
		int pivot = a[mid] ;
		
		while ( left <= right )
		{
			
			while ( a[left] < pivot )
			{
				left++ ;
			}
			
			while ( a[right] > pivot )
			{
				right-- ;
			}
			if ( left <= right )	
			{
				int t = a[left] ;
				a[left] = a[right] ;
				a[right] = t ;
				left++ ;
				right-- ;
				
			}
			
		}
		
		QuickSort(a,lo,right);
		QuickSort(a,left,hi);
		
	}
	

}
