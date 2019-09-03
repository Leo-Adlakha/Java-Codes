package CEC07;

import java.util.Scanner;

public class Program6 {

static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[10] ;
		a = takeInput() ;
		int[] b = a ;
		long start = System.nanoTime() ;
		selection(b) ;
		long end = System.nanoTime() ;
		display(b) ;
		System.out.println("Selection Sort: " + (end - start));
		System.out.println();
		start = System.nanoTime() ;
		insertion(a) ;
		end = System.nanoTime() ;
		display(a) ;
		System.out.println("Insertion Sort: " + (end - start));
		
	}

	public static int[] takeInput() {
		// TODO Auto-generated method stub
		int[] a = new int[10] ;
		for ( int i = 0 ; i < 10 ; i++ ) {
			a[i] = scn.nextInt() ;
		}
		
		return a;
	}
	
	public static void display(int[] a)
	{
		for (int j = 0; j < a.length; j++)
		{
			System.out.print(a[j] + " ");
		}
		System.out.println();
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
