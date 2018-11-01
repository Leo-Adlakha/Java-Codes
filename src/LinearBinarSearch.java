import java.util.Scanner;

public class LinearBinarSearch {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Size?");
		int n = scn.nextInt();
		int[] a = takeInput(n);
		display(a);
		int N = scn.nextInt();
		System.out.println("Linear Search");
		System.out.println(linearsearch(a,N));
		System.out.println("BinarySearch");
		System.out.println(binarysearch(a,N));
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
		
		public static void display(int[] a)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.println(a[j]);
			}
		}
	public static int linearsearch( int[] a , int N )
	{
	for ( int k = 0 ; k < a.length ; k++ )
	{
		if ( a[k] == N )
		{
			return k ;
			
		}
	}
	return -1;
	}
	public static int binarysearch( int[] a, int N)
	{
		int lo , hi ;
		int mid ;
		lo = 0; 
	    hi = a.length - 1 ;
		while ( lo <= hi )
		{
		    
			mid = ( lo + hi )/2;
			if ( N > a[mid] )
			{
				lo = mid + 1 ;
			}
			else if ( N < a[mid] )
			{
				hi = mid - 1 ;
			}
			else 
			{
				return mid ;
			}
		}
		return -1;
	}
}
