package Codechef_Problems;

import java.util.Arrays;
import java.util.Scanner;

/*Good Median Problem Code: GMEDIAN
Add problem to Todo list
Submit
Tweet
 
Read problems statements Hindi , Vietnamese , Mandarin Chinese , Russian and Bengali as well.
Raja only participates in contests and does not upsolve, but he claims that he has been upsolving. Chef wants to test if he is really improving, so he asks Raja to solve the following problem.

The median of a sequence of numbers is computed in the following way:

sort the sequence in non-decreasing order
if the number of elements of this sequence is odd, the median is its middle element
if the number of elements is even, the median is the average (arithmetic mean) of its two middle elements
For example, the median of [1,3,2]
 is 2
 and the median of [2,3,3,2]
 is (2+3)/2=5/2
.

You are given a sequence A1,A2,…,AN
. Let's call a subsequence Ai1,Ai2,…,Aik
 (for any k>0
, 1≤i1<i2<…<ik≤N
) good if the median of this subsequence is an element of this subsequence. Find the number of good subsequences. Since this number may be large, compute it modulo 1000000007
 (109+7
).

Input
The first line of the input contains a single integer T
 denoting the number of test cases. The description of T
 test cases follows.
The first line of each test case contains a single integer N
.
The second line contains N
 space-separated integers A1,A2,…,AN
.
Output
For each test case, print a single line containing one integer — the number of good subsequences modulo 109+7
.

Constraints
1≤T≤30
1≤N≤1,000
1≤Ai≤2N
 for each valid i
Subtasks
Subtask #1 (5 points): A
 is a permutation of integers 1
 through N

Subtask #2 (25 points): 1≤N≤100

Subtask #3 (70 points): original constraints

Example Input
1
3
2 3 2
Example Output
5
Explanation
Example case 1: The good subsequences are [2]
, [3]
, [2]
, [2,2]
, [2,3,2]
.*/

public class Good_Median {

	static Scanner scn = new Scanner(System.in) ;
	static int res = 0 ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt();
			String str = "" ;
			for ( int j = 0 ; j < n ; j++ )
			{
				str += scn.nextInt() ;
			}
			long start = System.currentTimeMillis() ;
			subseq(str, "");
			System.out.println(res%1000000007);
			long end = System.currentTimeMillis() ;
			System.out.println(end-start);
		}
		
	}

	private static boolean findans(String val) 
	{
		
		int[] a = convert(val) ;
		Arrays.sort(a);
		
		int midm1 = (a.length-1)/2 ;
		
		int valm1 = a[midm1] ;
		int valp1 = a[midm1+1] ;
		
		double med = ((double)( valm1 + valp1 )) / 2 ;
		
		if ( med - (int)med == 0.5 )
		{
			return false ;
		}
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( (int)med == a[i] )
			{
				return true ;
			}
		}
		
		return false ;
		
	}

	private static int[] convert(String val) 
	{
		int[] a = new int[val.length()];
		for ( int i = 0 ; i < val.length() ; i++ )
		{
			a[i] = val.charAt(i) - 48 ;
		}
		return a ;
	}

	public static void subseq(String ques , String ans )
	{
		if ( ques.length()==0)
		{
			if ( ans.length() % 2 != 0 )
			{
				res++ ;
				return ;
			}
			else if ( ans.length() == 0 )
			{
				return ;
			}
			else if ( findans(ans) )
			{
				res++ ;
			}
			return ;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		subseq(roq,ans);
		subseq(roq,ans + ch );
		
	}
	
}
