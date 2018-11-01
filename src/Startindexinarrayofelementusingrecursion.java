import java.util.Scanner;

public class Startindexinarrayofelementusingrecursion {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int t = scn.nextInt();
		int[] a = takeInput(n);
		int i = 0 ;
//		System.out.println(sin(a,i,t));
//		i = a.length - 1 ;
//		System.out.println(ein(a,i,t));
		int count = 0 ; 
		int[] ans = allin(a, i, t, count);
		for ( int val : ans )
		{
			System.out.println(val);
		}
	}
	
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static int sin( int[] a , int i , int t )
	{
		if ( i == a.length )
		{
			return -1 ;
		}
		if ( a[i] == t )
		{
			return i ;
		}
		i++ ; 
		return sin( a, i , t );
		
		
	}
	public static int ein( int[] a , int i , int t )
	{
		if ( i == -1 )
		{
			return -1 ;
		}
		if ( a[i] == t )
		{
			return i ;
		}
		i-- ; 
		return ein( a, i , t );
		
		
	}
	public static int[] allin(int[] a , int i , int t , int count )
	{
		if ( i == a.length )
		{
			int[] b = new int[count];
			return b ;
		}
		
		int[] ans ;
		if ( a[i] == t )
		{
			ans = allin(a, i+1, t, count+1);
			ans[count] = i ;
		}
		else 
		{
			ans = allin(a, i+1, t, count);
		}
		
		return ans ;
	}
	

}
