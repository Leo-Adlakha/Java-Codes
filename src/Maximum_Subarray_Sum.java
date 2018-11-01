import java.util.Scanner;

/*MAXIMUM SUBARRAY SUM
You are given a one dimensional array that may contain both positive and negative integers, find the sum of contiguous subarray of numbers which has the largest sum. For example, if the given array is {-2, -5, 6, -2, -3, 1, 5, -6}, then the maximum subarray sum is 7.


Input Format:
The first line consists of number of test cases T. Each test case consists of N followed by N integers.

Constraints:
1 <= N <= 100000 
1 <= t <= 20
 0 <= A[i] <= 100000000
Output Format:
The maximum subarray sum

Sample Input:
2 
4
 1 2 3 4
 3
 -10 5 10
Sample Output:
10 
15
Time Limit: 2 sec
*/	

public class Maximum_Subarray_Sum {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		long start = System.currentTimeMillis();
		System.out.println(maxsumofsubarray(a));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		}
		
	}
	
	public static int[] takeInput( int n )
	{
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt() ;
		}
		return a ;
		
	}
	
	public static int maxsumofsubarray ( int[] a )
	{
		
		int[] allmax = new int[a.length] ;
		
		for ( int i = 0 ; i < a.length ; i++ ) 
		{
			int[] max = new int[a.length] ;
			for ( int j = i ; j < a.length ; j++ )
			{
				int sum = 0 ;
				for ( int k = i ; k <= j ; k++ )
				{
					sum += a[k] ;
				}
				max[j] = sum ;
			}
			allmax[i] = maximumof(max) ;
		}
		
		return maximumof(allmax) ;
		
		
		
	}
	
	public static int maximumof( int[] max )
	{
		int m = Integer.MIN_VALUE ;
		for ( int i = 0 ; i < max.length ; i++ )
		{
			if ( max[i] > m )
			{
				m = max[i] ;
			}
		}
		return m ;
	}
	
}
