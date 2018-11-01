package CB_First_Hackathon;

import java.util.Scanner;

/*PRIME VISITS
PMO gives two random numbers a & b to the Prime Minister. PM Modi wants to visit all countries between a and b (inclusive) , However due to shortage of time he can't visit each and every country , So PM Modi decides to visit only those countries,for which country number has two divisors. So your task is to find number of countries Mr. Modi will visit.


Input Format:
The first line contains N , no of test cases. The next lines contain two integers a and b denoting the range of country numbers.

Constraints:
a<=1000000 & b<=1000000.
N<=1000
Output Format:
Output contains N lines each containing an answer for the test case.

Sample Input:
2
1 10
11 20
Sample Output:
4
4
Time Limit: 1 sec*/

public class Prime_Visits {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			int si = scn.nextInt();
			int ei = scn.nextInt();
			System.out.println(countprimes(si,ei));
		}
		
	}

	public static int countprimes ( int si, int ei )
	{
		boolean[] prime = new boolean[ei+1] ;
		prime[0] = true ;
		prime[1] = true ;
		for ( int i = 2 ; i*i <= ei ; i++ )
		{
			if ( !prime[i] )
			{
			int p = 2 ;
			while ( i * p <= ei )
			{
				prime[i*p] = true ;			
				p++ ;
			}
			}
		}
		
		int count = 0 ;
		for ( int j = si ; j <= ei ; j++ )
		{
			if ( prime[j] == false )
			{
				count++ ;
			}
		}
		
		return count ;
		
	}
	
}
