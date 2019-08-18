package Codechef_Problems;

import java.util.Scanner;

/*Appy Loves One Problem Code: HMAPPY1
Add problem to Todo list
Submit
Tweet
  
Read problems statements Hindi , Vietnamese , Mandarin Chinese , Russian and Bengali as well.
Chef has a sequence A1,A2,…,AN
; each element of this sequence is either 0
or 1
. Appy gave him a string S
 with length Q
 describing a sequence of queries. There are two types of queries:

'!': right-shift the sequence A
, i.e. replace A
 by another sequence B1,B2,…,BN
 satisfying Bi+1=Ai
 for each valid i
 and B1=AN
'?': find the length of the longest contiguous subsequence of A
 with length ≤K
 such that each element of this subsequence is equal to 1
Answer all queries of the second type.

Input
The first line of the input contains three space-separated integers N
, Q
 and K
.
The second line contains N
 space-separated integers A1,A2,…,AN
.
The third line contains a string with length Q
 describing queries. Each character of this string is either '?', denoting a query of the second type, or '!', denoting a query of the first type.
Output
For each query of the second type, print a single line containing one integer — the length of the longest required subsequence.

Constraints
1≤K≤N≤105
1≤Q≤3⋅105
0≤Ai≤1
 for each valid i
S
 contains only characters '?' and '!'
Subtasks
Subtask #1 (30 points):

1≤N≤103
1≤Q≤3⋅103
Subtask #2 (70 points): original constraints

Example Input
5 5 3
1 1 0 1 1
?!?!?    
Example Output
2
3
3
Explanation
In the first query, there are two longest contiguous subsequences containing only 1
-s: A1,A2
 and A4,A5
. Each has length 2
.
After the second query, the sequence A
 is [1,1,1,0,1]
.
In the third query, the longest contiguous subsequence containing only 1
-s is A1,A2,A3
.
After the fourth query, A=[1,1,1,1,0]
.
In the fifth query, the longest contiguous subsequence containing only 1
-s is A1,A2,A3,A4
 with length 4
. However, we only want subsequences with lengths ≤K
. One of the longest such subsequences is A2,A3,A4
, with length 3
.*/

public class Appy_loves_One {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int q = scn.nextInt();
		int k = scn.nextInt();
		int[] a = takeInput(n) ;
		String str = scn.next();
		findans(k,a,str) ;
		
		
	}

	public static void findans(int k, int[] a, String str) 
	{
		
		while ( str.length() != 0 )
		{
			char ch = str.charAt(0) ;
			str = str.substring(1) ;
			if ( ch == '!' )
			{
				firstquery(a) ;
			}
			else
			{
				System.out.println(secondquery(a,k)) ;
			}
			
		}
		
		
		
	}

	public static int secondquery(int[] a, int k) 
	{
		
		int max = 0 ;
		int count = 0 ; 
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( a[i] == 0 )
			{
				continue ;
			}
			count = 1 ;
			int j = i ;
			while ( j < a.length - 1 && a[j+1] == 1 )
			{
				count++ ;
				j++ ;
			}
			if ( count > max )
			{
				max = count ;
			}
			
		}
		
		if ( max > k )
		{
			return k ;
		}
		else
		{
			return max ;
		}
		
		
	}

	public static void firstquery(int[] a) 
	{
		int n = a[a.length - 1] ;
		
		for ( int i = a.length - 2 ; i >= 0 ; i-- )
		{
			a[i+1] = a[i] ;
		}
		a[0] = n ;
		
	}

	private static int[] takeInput(int n) 
	{
		int[] arr = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			arr[i] = scn.nextInt();
		}
		return arr ;
	}

	
}
