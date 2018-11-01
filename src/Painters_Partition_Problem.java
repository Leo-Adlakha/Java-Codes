import java.util.Scanner;

/*PAINTER'S PARTITION PROBLEM
Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of time to paint all the boards.

Note that:

Every painter can paint only contiguous segments of boards.
A board can only be painted by 1 painter at maximum.

Input Format:
Every test file consists of 3 lines. First line contains K which is the number of painters. Second line contains N which indicates the number of boards. Third line contains N space separated integers representing the length of each board.

Constraints:
1 <= K <= 10
1 <= N <= 10
1<= Length Of Each Board <= 10^8
Output Format:
Output the minimum time required to paint the board.

Sample Input:
2
2
1 10
Sample Output:
10*/

public class Painters_Partition_Problem {

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		
		int t = scn.nextInt() ;
		for ( int i = 0 ; i < t ; i++ )
		{
			long nop = scn.nextInt() ;
			int nob = scn.nextInt() ;
			long[] board = takeInput(nob) ;
			System.out.println(paintboards(board, nob, nop)) ;
		}
		
		
	}
	
	public static long[] takeInput(int n) {
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	private static long paintboards(long[] board, long nob, long nop ) 
	{
		
		long lo = 0 ;
		long sum = 0 ;
		for ( long val : board )
		{
			sum += val ;
		}
		
		long hi = sum ;
		
		long finalans = 0 ;
		
		while ( lo <= hi )
		{
			
			long mid = ( lo + hi ) / 2 ;
			
			if ( ispossible(board,nob,nop ,mid ) )
			{
				hi = mid - 1 ;
				finalans = mid ;
				
			}
			else
			{
				
				lo = mid + 1 ;
				
			}
	
		}
		
		return finalans ;
		
		
		
		
		
	}
	
	private static boolean ispossible(long[] board, long nob, long nop , long mid) 
	{
		
		long painter = 1 ;
		long timeremaining = mid ;
		
		// denotes no of boards painted !
		int i = 0 ;
		
		while ( i < board.length && painter <= nop )
		{
			
			if ( board[i] <= timeremaining )
			{
				timeremaining -= board[i] ;
				i++ ;
			}
			else
			{
				painter++ ;
				timeremaining = mid ;
				
			}
			
			
		}
		
		if ( i == board.length )
		{
			return true ;
		}
		else
		{
			return false ;
		}
		
		
		
		
	}

	
}
