package Stack_Ques;

import java.util.LinkedList;
import java.util.Scanner;

/*MAXIMUM OF MINIMUM FOR EVERY WINDOW SIZE
Given an integer array of size n, find the maximum of the minimum’s of every window size in the array. Window size very from 1 to n.


Input Format:
First line contains integer t which is number of test case. For each test case, it an integer n which size of given array and next line contains n space separated integers.

Output Format:
Print the maximum of the minimum’s of every window size in the array .

Sample Input:
1
7
10 20 30 50 10 70 30
Sample Output:
70 30 20 10 10 10 10
*/

public class Maximum_of_Minimum_of_every_window_size {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt() ;
		for ( int i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt();
			int[] a = takeInput(n) ;
			displayans(a) ;
		}
		
		
		
	}

	private static void displayans(int[] a) 
	{
		
		LinkedList<Integer> ans = new LinkedList<>() ;
		LinkedList<Integer> helper = new LinkedList<>() ;
		int i = 1 ;
		int ki = 0 ;
		int kf = 0 ;
		
		while ( i <= a.length )
		{
			
			while ( kf < a.length )
			{
				int l = ki ;
			    while ( l <= kf )
			    {
			    	helper.addFirst(a[l]);
				    l++ ;
			    }
			    ans.addFirst(min(helper));
			    ki++ ;
			    kf++ ;
			
			}
			System.out.print( max(ans) + " " );
			ki = 0 ;
			kf = i ;
			i++ ;
			
		}
		
		
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
	
	public static int min ( LinkedList<Integer> stack )
	{
		int min = Integer.MAX_VALUE ;
		while ( !stack.isEmpty() )
		{
			int t = stack.removeFirst() ;
			if ( t < min )
			{
				min = t ;
			}
		}
		return min ;
		
	}
	
	public static int max ( LinkedList<Integer> stack )
	{
		int max = Integer.MIN_VALUE ;
		while ( !stack.isEmpty() )
		{
			int t = stack.removeFirst() ;
			if ( t > max )
			{
				max = t ;
			}
		}
		return max ;
		
	}

}
