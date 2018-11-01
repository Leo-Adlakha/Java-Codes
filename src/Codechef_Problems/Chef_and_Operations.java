package Codechef_Problems;

import java.util.Scanner;

/*Chef and Operations Problem Code: QABC
Add problem to Todo list
Submit
Tweet
  
Chef has 2 sequences of length N
 - A
 and B
, he can apply the magic operation arbitrary number of times: choose an index i(1≤i≤N−2)
 and add 1
 to Ai
, 2
to Ai+1
 and 3
 to Ai+2
, i.e.:

Ai
 += 1
Ai+1
 += 2
Ai+2
 += 3
Chef asks you toto say if possible obtain the sequence B
 from the sequence A
using such operations.

Input:
First line will contain T
, number of testcases. Then the testcases follow.
The first line of each testcase contains one integer N
.
The second and third lines contains N
 space-separated integers - sequences A
 and B
 respectively.
Output:
For each testcase, output in a single line "TAK" if possible to reach B
 using that operation and "NIE" otherwise.

Constraints
1≤T≤1000
1≤N≤105
sum of all N
 in all test-cases doesn't exceed 5⋅105
0≤Ai≤108
0≤Bi≤108
Sample Input:
2
5
0 0 0 0 0 
1 2 4 2 3
5
0 0 0 0 0 
1 2 4 2 4
Sample Output:
TAK
NIE
EXPLANATION:
In the first test case, Chef can apply that operation at index i=3
 and get a sequence 00123
. After that, he can apply that operation at index i=1
 and reach a sequence 12423
, the same sequence as B
. It's impossible to reach the sequence B
 in the second example.*/

public class Chef_and_Operations {

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		
		int t = scn.nextInt();
		for ( int  i = 0 ; i < t ; i++ )
		{
			
			int n = scn.nextInt();
			int[] a = takeInput(n) ;
			int[] b = takeInput(n) ;
			boolean bl = check ( a,b,0 ) ;
			if ( bl )
			{
				System.out.println("TAK");
			}
			else
			{
				System.out.println("NIE");
			}
		}
		
		
		
		
		
	}
	
	public static boolean check(int[] a, int[] b, int k ) 
	{
		boolean bl = true ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( a[i] != b[i] )
			{
				bl = false ;
				break ;
			}
		}
		
		if ( bl )
		{
			return true ;
		}
		
		if ( k < a.length && a[k] > b[k] ) 
		{
			return false ; 
		}
		
		int flag = 0 ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			int l = 1 ;
			for ( int j = i ; j < a.length ; j++ )
			{
				a[j] += l ;
				l++ ;				
			}
			
			boolean blc = check(a, b, i + 1 ) ;
			if ( blc )
			{
				flag = 1 ;
				break ;
			}
		}
		
		if ( flag == 1)
			return true ;
		else
		    return false;
	}

	public static int[] takeInput ( int n )
	{
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt();
		}
		return a ;
	}

}
