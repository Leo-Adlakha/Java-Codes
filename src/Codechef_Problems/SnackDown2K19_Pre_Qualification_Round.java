package Codechef_Problems;

import java.util.Scanner;

/*Snackdown 2019 is coming! There are two rounds(A
		 and B
		) after the Qualification. In both of them teams can qualify to the Pre-elimination round. According to the rules, teams will be sorted in descending order by their score, each team with score at least equal to score of the team at 1500
		-th place will advance to Pre-elimination round, i.e. it's possible to have more than 1500
		qualified teams in the case of tie.

		Today the organizers ask you to count the number of qualified teams in Pre-elimination round. They provide you scores of each team and ensure that all teams scoring at least equal to K
		-th team (instead of 1500
		-th) qualify.

		Input:
		The first line contains one integer T
		 - the number of testcases. The next 2⋅T
		lines contains test cases.
		The first line of each test case contains two integers - N
		 and K
		The second line contains N
		 space-separated integers Si
		, i
		-th of them denoting the score of i
		-th team.
		Output:
		For each testcase, output in a single line containing the answer to the problem.

		Constraints
		1≤T≤1000
		1≤K≤N≤105
		1≤S[i]≤109
		sum of N
		 over all test-cases doesn't exceed 106
		Sample Input:
		2
		5 1
		3 5 2 4 5
		6 4
		6 5 4 3 2 1
		Sample Output:
		2
		4*/

public class SnackDown2K19_Pre_Qualification_Round {

	static Scanner scn = new Scanner (System.in) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int  i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] a = takeInput(n); 
			k = a[k-1] ;
			System.out.println(countteams(a,k)) ;			
			
			
		}
		
		
	}
	
	public static int countteams(int[] a, int k) 
	{
		
		int ans = 0 ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( a[i] >= k )
			{
				ans++ ;
			}			
		}
		
		return ans ;
		
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

}
