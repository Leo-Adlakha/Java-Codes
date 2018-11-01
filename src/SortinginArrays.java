import java.util.Scanner;

public class SortinginArrays {

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int[] a = takeInput(n);
		bubble(a);
		display(a);
		int[] b = new int[a.length] ;
		int[] c = new int[a.length] ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			b[i] = c[i] = a[i] ;
		}
		selection(b);
		display(b);
		insertion(c);
		display(c);
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
	public static int[] bubble ( int[] a )
	{
		for ( int i = 0 ; i < a.length - 1 ; i++ )
		{
			for ( int j = 0 ; j < a.length - i - 1 ; j++ )
			{
				if ( a[j] > a[j+1] )
				{
					int t;
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;
	}
	public static void selection ( int[] b )
	{
		for ( int i = 0 ; i < b.length ; i++ )
		{
			int min = i ;
			for ( int j = i + 1 ; j < b.length ; j++ )
			{
				if ( b[min] > b[j] )
				{
					min = j ;
				}
			}
			int t = b[i] ;
			b[i] = b[min] ;
			b[min] = t ;
			
		}
	}
	public static void insertion ( int[] c )
	{
		for ( int i = 1 ; i < c.length ; i++ )
		{
			int t = c[i];
			int j = i-1;
			while ( j >= 0 && t <= c[j] )
			{
				c[j+1] = c[j] ;
				j--;
			}
			
			c[j+1] = t ;
		}
	}
}
