import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int c = scn.nextInt();
		int[] a = takeInput(c) ;
		
		Arrays.sort(a);
		
		Murthal_Parantha m = new Murthal_Parantha() ;
		HeapMover mover = m.new HeapMover() ;
		findmin( mover, a, new int[a.length], n, 0);
		System.out.println(mover.min);
		
		
	}
	
	public static void findmin(HeapMover mover, int[] a, int[] con, int n, int t ) 
	{
		
	    int sum = sum(con) ;
		if ( sum == n )
		{
			if ( t < mover.min )
			{
				mover.min = t ;
			}
			return ;
		}
		
		if ( sum > n )
		{
			return ;
		}
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			
			con[i] = con[i] + 1 ;
			findmin(mover, a, con, n, con[i]*a[i] + t);
			
		}
		
		
	}

	public static int sum(int[] con) 
	{
		
		int sum = 0 ;
		for  (int i = 0 ; i < con.length ; i++ )
		{
			sum += con[i] ;
		}
		return sum ;
		
	}

	class HeapMover
	{
		int min = Integer.MAX_VALUE ;
	}

	public static int[] takeInput(int c) 
	{
		int[] a = new int[c] ;
		for ( int i = 0 ; i < c ; i++ )
		{
			a[i] = scn.nextInt();
		}
		return a ;
	}

}
