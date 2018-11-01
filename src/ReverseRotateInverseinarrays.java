import java.util.Scanner;

public class ReverseRotateInverseinarrays {

	static Scanner scn = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		System.out.println("Size?");
		int n = scn.nextInt();
		int[] a = takeInput(n);
		reverse(a,n);
		display(a);
		reverse(a,n);
		int[] c = new int[5];
		for ( int l = 0 ; l < a.length ; l++ )
		{
			c[l] = a[l] ;
		}
		int N = scn.nextInt();
		if ( N < 0 )
		{
			N = n - 1 ;
		}
		else if ( N > a.length )
		{
			N = N % ( a.length );
		}
		int[] b = null ;
		for ( int j = 1 ; j <= N ; j++ )
		{
	    b = rotate(a) ;
		}
		display(b);
		inverse(c);
		display(inverse(c));
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
	public static void reverse(int[] a, int n)
	{
	int p;
	for ( int i = 0 ; i <= (n/2)-1 ; i++ )
	{
		p=a[i];
		a[i] = a[n - i - 1 ];
		a[n - 1 - i ] = p ;
	}
	}
	public static int[] rotate(int[] a)
	{
		int p;
		for ( int i = a.length - 2 ; i >= 0 ; i-- )
		{
			p=a[i];
			a[i] = a[i + 1];
			a[ i + 1 ] = p ;
		}
		return a ; 
	}
	public static int[] inverse(int[] a)
	{
		int[] b = new int[a.length] ; 
		int p ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			p = a[i];
			b[p] = i ; 
		}
		return b ;
	}


}
