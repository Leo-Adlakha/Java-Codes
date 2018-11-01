import java.util.Arrays;
import java.util.Scanner;

/*AGGRESSIVE COWS
Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?


Input Format:
First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.

Output Format:
Print one integer: the largest minimum distance.

Sample Input:
5 3
1 2 8 4 9
Sample Output:
3
Explanation:
Problem Credits (Spoj)[http://www.spoj.com/problems/AGGRCOW/]

Time Limit: 2 sec*/

public class Aggressive_Cows {

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nos = scn.nextInt() ;
		int noc = scn.nextInt() ;
		int[] stalls = takeInput(nos) ;
		Arrays.sort(stalls);
		
		System.out.println(aggcows(stalls,nos,noc));
		
		
		
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static int aggcows ( int[] stalls, int nos, int noc )
	{
		
		int lo = 0 ;
		int hi = stalls[nos - 1 ] - stalls[0] ;
		
		int finalans = 0 ;
		
		while ( lo <= hi )
		{
			
			int mid = ( lo + hi ) / 2 ;
			
			if ( ispossible(stalls,nos,noc,mid ) )
			{
				lo = mid + 1 ;
				finalans = mid ;
				
			}
			else
			{
				
				hi = mid - 1 ;
				
			}
			
			
			
			
			
		}
		
		return finalans ;
		
	}

	private static boolean ispossible(int[] stalls, int nos, int noc, int mid) 
	{
		
		int placedcows = 0 ;
		int lastpos = stalls[0] ;
		int i = 0 ;
		
		
		while ( i < stalls.length )
		{
			
			if ( stalls[i] - lastpos >= mid )
			{
				placedcows++ ;
				lastpos = i ;
			}
			
			i++ ;
			
			
			
		}
		
		
		if ( placedcows >= noc )
		{
			return true ;
		}
		
		return false;
	}
	
}
