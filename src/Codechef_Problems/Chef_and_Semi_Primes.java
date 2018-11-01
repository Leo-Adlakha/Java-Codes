package Codechef_Problems;

import java.util.Scanner;

/*Chef and Semi-Primes Problem Code: CHEFPRMS
Add problem to Todo list
Submit
Tweet
  
Chef likes prime numbers. However, there is one thing he loves even more. Of course, it's semi-primes!! Semi-prime number is an integer which can be presented as a product of two distinct primes. For example: 15=3⋅5
 is a semi-prime number and 1=1
, 9=3⋅3
 are not.

Chef is wondering to check if an integer can be presented as a sum of two semi-primes. Help Chef with this tough task!

Input:
First line will contain T
, number of testcases. Then the testcases follow.
Each testcase contains one integer N
 in a single line.
Output:
For each testcase output in a single line "YES" if possible to present N
 as the sum of two semi-primes and "NO" otherwise.

Constraints
1≤T≤200
1≤N≤200
Sample Input:
3
30
45
62
Sample Output:
YES
YES
NO
EXPLANATION:
30 can be presented as 15(3⋅5)+15(3⋅5)
, 45 can be presented as 35(5⋅7)+10(2⋅5)
, 62 cannot be represented as the sum of two semi-primes.*/

public class Chef_and_Semi_Primes {

	static Scanner scn = new Scanner (System.in) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int  i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt();
			int[] semiprimes = new int[n] ;
			int l = 0 ;
			for ( int j = 2 ; j < n ; j++ )
			{
				
				if ( checksemiprime ( j ) )
				{
					semiprimes[l] = j ;
					l++ ;
				}
				
			}
			
			int flag = 0 ;
			for ( int k = 0 ; k < l ; k++ )
			{
				int n1 = semiprimes[k] ;
				for ( int m = k ; m < l ; m++ )
				{
					if ( semiprimes[m] + n1 == n )
					{
						flag = 1 ;
						break ;
					}
				}
				
				if ( flag == 1 )
				{
					break ;
				}
				
			}
			if ( flag == 1 )
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			
		}
		
		
	}
	
	public static boolean checksemiprime(int j)
	{
		int p = j ;
		int[] factors = new int[j/2] ;
		int l = 0 ;
		int div = 2 ;
		while ( p != 1 )
		{
			
			if ( p % div == 0 )
			{
				p = p / div ;
				factors[l] = div ;
				l++ ;
				
			}
			else
			{
				div++ ;
			}
			
		}
		
		if ( l > 2 || l < 2 )
		{
			return false ;
		}
		else 
		{
			if ( isprime(factors[0]) && isprime(factors[1]) )
			{
				if ( factors[0] == factors[1] )
				{
					return false ;
				}
				return true ;
			}
			else
			{
				return false ;
			}
			
		}
		
		
	}
	
	public static boolean isprime ( int n )
	{
		int i=1,p=0;
		while(i<=n)
		{
			if(n%i==0)
			{
			p++;
			}
			i++;
		}
		if(p>2)
		{
			return false ;
		}
		else
		{
			return true ;
		}
		
		
		
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}


}
