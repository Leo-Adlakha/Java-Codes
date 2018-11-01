import java.util.Scanner;

/*SORTING IN LINEAR TIME
You will be given an array containing only 0s, 1s and 2s. you have sort the array in linear time that is O(N) where N is the size of the array.


Input Format:
The first line contains N, which is the size of the array. The following N lines contain either 0, or 1, or 2.

Constraints:
Each input element x, such that x ∈ { 0, 1, 2 }.
Output Format:
Output the sorted array with each element separated by a newline.

Sample Input:
5
0
1
2
1
2
Sample Output:
0
1
1
2
2
Time Limit: 1 sec*/

public class Sorting_in_Linear_Time {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		int[] b = sorting(a) ;
		for ( int val : b )
		{
			System.out.println(val);
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
	
	public static int[] sorting ( int[] a )
	{
		int count0 = 0 ;
		int count1 = 0 ;
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( a[i] == 0 )
			{
				count0++ ;
			}
			else if ( a[i] == 1 )
			{
				count1++ ;
			}
		}
		int ans[] = new int[a.length] ;
		int i = 0 ;
		int j = count0 ;
		int k = count0 + count1 ;
		for ( int l = 0 ; l < a.length ; l++ )
		{
			if ( a[l] == 0 )
			{
				ans[i] = 0 ;
				i++ ;
			}
			else if ( a[l] == 1 )
			{
				ans[j] = 1 ;
				j++ ;
			}
			else
			{
				ans[k] = 2 ;
				k++ ;
			}
		}
		
		return ans ;
	}

}
