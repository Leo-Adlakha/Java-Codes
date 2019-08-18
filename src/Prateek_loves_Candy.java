import java.util.Arrays;
import java.util.Scanner;

public class Prateek_loves_Candy {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
		
		    int n = scn.nextInt() ;
		    
		    int count = 0 ;
		    
		    int j = 2 ;
		    
		    while ( j < Math.pow(10000, 0.5))
		    {
		    	int div = 0 ;
		    	
		    	for ( int k = 2 ; k < j ; k++ )
		    	{
		    		if ( j % k == 0 )
		    		{
		    			div++ ;
		    		}
		    	}
		    	
		    	if ( div == 0 )
		    	{
		    		if ( count == n - 1 )
		    		{
		    			System.out.println(j);
		    			break ;
		    		}
		    		else
		    		{
		    			count++ ;
		    		}
		    	}
		    	
		    	
		    	j++ ;
		    	
		    }
		    
		    
		    
		    
		    
		    
		    
		   // SOE(n);
		    
		    
		}
		
	}

	public static void SOE ( int n )
	{
		
		boolean[] primes = new boolean[10000+1] ;
		Arrays.fill(primes, true);
		primes[0] = false ;
		primes[1] = false ;
		for ( int i = 2 ; i*i <= 100 ; i++ )
		{
			if ( primes[i] )
			{
			for ( int mul = 2 ; mul*i <= 10000 ; mul++ )
			{
				primes[i*mul] = false ;
			}
			}
		}
		
		int count = 0 ;
		for ( int i = 0 ; i < 10000 ; i++ )
		{
			if ( primes[i] && count == n - 1 )
			{
				System.out.println(i);
				break ;
			}
		    else if ( primes[i] == true )
			{
		    	count++ ;
			}
		}
		
		
	}
	
}
