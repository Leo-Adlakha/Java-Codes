import java.util.Scanner;

/*VALID-INVALID SEQUENCE
Take the following as input.

A number (N)
Take N more numerical inputs
The N inputs for a sequence S = s1, s2, .., sN. Compute if it is possible to split sequence into two sequences -
s1 to si and si+1 to sN such that first sequence is strictly decreasing and second is strictly increasing. Print true/false as output.


Constraints:
0 < N < 1000 
Each number in sequence S is > 0 and < 1000000000
Sample Input:
5 
1 
2 
3 
4 
5
Sample Output:
true
Explanation:
Carefully read the conditions to judge which all sequences may be valid. Don't use arrays or lists.
*/


public class VALIDINVALIDSequence {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int n = scn.nextInt() ;
		System.out.println(checkvalidity(n));
}
	
	public static boolean checkvalidity( int  n )
	{
		int p = 0 ;
		int lastnum = Integer.MAX_VALUE ;
		for ( int i = 1 ; i <= n ; i++ )
		{
			int N = scn.nextInt();
			if ( N < lastnum && p == 0 )
			{
				lastnum = N ;
			}
			else if ( N > lastnum && p == 0 )
			{
				p++ ;
				lastnum = N ;
			}
			else if ( N > lastnum && p > 0 )
			{
				lastnum = p ;
			}
			else if ( N < lastnum && p > 0 )
			{
				p++ ;
			}
		}
		
		if ( p == 0 || p == 1 )
		{
			return true ;
		}
		else
		{
			return false ;
		}

	}
	
}
