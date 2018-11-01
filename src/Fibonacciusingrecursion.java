import java.util.Scanner;

public class Fibonacciusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in ) ; 
		int n = scn.nextInt();
		System.out.println(fib(n));
	}
	public static int fib( int n )
	{
		if ( n == 0 )
		{
			return 0 ;
		}
		else if ( n == 1 )
		{
			return 1 ;
		}
		int ans;
		ans = fib( n - 1 ) + fib( n - 2 );
		return ans ;
	}

}
