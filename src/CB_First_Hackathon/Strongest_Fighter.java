package CB_First_Hackathon;

import java.util.Scanner;

/*STRONGEST FIGHTER
There is a group of MMA fighters standing together in a line. Given the value of their strengths, find the strength of the strongest fighter in continuous sub-groups of size k.


Input Format:
First line contains an integer N, the number of fighters Followed by N integers where i'th integer denotes the strength of i'th fighter. Next line contains the size of sub-group k

Constraints:
1<=N<=10^5
1<=k<=N
Output Format:
Space separated integers in a single line denoting strength of strongest fighters in the groups.

Sample Input:
5
1 3 1 4 5
3
Sample Output:
3 4 5
Explanation:
First sub-group: 1 3 1 --> Max strength is 3 Second sub-group: 3 1 4 --> Max strength is 4 Third sub-group: 1 4 5 --> Max strength is 5

Time Limit: 1 sec*/

public class Strongest_Fighter {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		int k = scn.nextInt() ;
		output(a,0,k-1) ;
		
	}

	public static void output(int[] a, int i, int j) 
	{
		if ( j >= a.length )
		{
			return ; 
		}
		int max = Integer.MIN_VALUE ;
		for ( int k = i ; k <= j ; k++ )
		{
			if ( a[k] > max )
			{
				max = a[k] ;
			}
		}
		
		System.out.print(max+"\t");
		
		output(a, i + 1, j + 1 );
		
		
	}

	public static int[] takeInput(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[n] ;
		
		for ( int i = 0 ;  i < n ; i++ )
		{
			arr[i] = scn.nextInt();
		}
		
		return arr ;
	}
	
	

}
