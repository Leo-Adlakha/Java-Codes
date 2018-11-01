package Codechef_Problems;

import java.util.Scanner;

/*Spread the Word Problem Code: SPREAD2
Add problem to Todo list
Submit
Tweet
  
Snackdown 2019 is coming! People have started to spread the word and tell other people about the contest.

There are N
 people numbered 1
 through N
. Initially, only person 1
 knows about Snackdown. On each day, everyone who already knows about Snackdown tells other people about it. For each valid i
, person i
 can tell up to Ai
 people per day. People spread the information among the people who don't know about Snackdown in the ascending order of their indices; you may assume that no two people try to tell someone about Snackdown at the same moment. Each person is only allowed to start telling other people about Snackdown since the day after he/she gets to know about it (person 1
 can start telling other people already on day 1
). How many days does it take for all people to know about Snackdown?

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
For each test case, print a single line containing one integer — the number of days.

Constraints
1≤T≤1,000
2≤N≤105
the sum of N
 for all test cases does not exceed 106
0≤Ai≤N
 for each valid i
1≤A1
Example Input
2
7
2 1 1 5 5 5 5
5
5 1 3 2 1
Example Output
2
1
Explanation
Example case 1: On day 1
, person 1
 tells people 2
 and 3
 about Snackdown. On day 2
, the first three people know about Snackdown, so they can tell 2+1+1=4
 people about it in a single day. That means the last four people get to know about Snackdown on day 2
, so the total number of days is 2
.

Example case 2: On each day, person 1
 can tell up to 5
 people about Snackdown, so on the first day, he simply tells all people about it and the total number of days is 1
.
*/

public class Spread_The_Word {

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int  i = 0 ; i < t ; i++ )
		{
			
			int n = scn.nextInt() ;
			int[] a = takeInput(n) ;
			long start = System.currentTimeMillis() ;
			System.out.println(days(a));
			long end = System.currentTimeMillis() ;
			System.out.println(end-start);
			
		}
		
	}
	
	public static int days(int[] a)
	{
		int howmanyknow = 1 ;
		int howmanytotell ;
		int days = 0 ;
		int sum = a[0] ;
		int i = 1 ;
		
		while ( howmanyknow < a.length )
		{
			
			if ( i == howmanyknow )
			{
				howmanytotell = sum ;
				howmanyknow += howmanytotell ;
				days++ ;
			}
			
			sum += a[i] ;
			i++ ;
			
			
		}
		
		return days ;
		
		
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

}
