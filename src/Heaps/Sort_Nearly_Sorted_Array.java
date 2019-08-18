package Heaps;

public class Sort_Nearly_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1,4,5,2,3,7,8,6,10,9 } ;
		
		sort(a, 2);
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			System.out.print(a[i] + " ");
		}
		
		
	}
	
	public static void sort ( int[] a, int k )
	{
		
		Heap heap = new Heap() ;
		
		for ( int i = 0 ; i < 2 * k + 1 ; i++ )
		{
			heap.add(a[i]);
		}
		
		int j = 0 ;
		int vidx = 2 * k + 1 ;
		
		while ( !heap.IsEmpty() )
		{
			if ( vidx < a.length )
			{
			    heap.add(a[vidx]);
			    vidx++ ;
			}
			
			int n = heap.remove() ;
			a[j] = n ;
			j++ ;
		}
		
		
	}

}
