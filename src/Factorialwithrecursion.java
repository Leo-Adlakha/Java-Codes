import java.util.Scanner;

public class Factorialwithrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in ) ; 
		int n = scn.nextInt();
		System.out.println(fact(n));
	}
	
	public static int fact( int n )
	{
		if ( n == 0 )
		{
			return 1 ;
		}
		int ans;
		ans = n * fact(n-1);
		return ans ;
	}

}
