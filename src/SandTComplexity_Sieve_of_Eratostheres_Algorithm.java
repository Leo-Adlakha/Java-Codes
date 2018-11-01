import java.util.Arrays;
import java.util.Scanner;

public class SandTComplexity_Sieve_of_Eratostheres_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		SOE(n);
		
		
	}
	
	public static void SOE ( int n )
	{
		
		boolean[] primes = new boolean[n+1] ;
		Arrays.fill(primes, true);
		primes[0] = false ;
		primes[1] = false ;
		for ( int i = 2 ; i*i <= n ; i++ )
		{
			if ( primes[i] )
			{
			for ( int mul = 2 ; mul*i <= n ; mul++ )
			{
				primes[i*mul] = false ;
			}
			}
		}
		
		for ( int i = 0 ; i < n ; i++ )
		{
			if ( primes[i] == true )
			{
				System.out.println(i);
			}
		}
		
		
	}

}
